package by.zastr.shape.entity;

import java.util.ArrayList;
import java.util.List;

import by.zastr.shape.observer.Observable;
import by.zastr.shape.observer.Observer;
import by.zastr.shape.observer.PyramidEvent;
import by.zastr.shape.observer.impl.PyramidObserver;
import by.zastr.shape.util.IdGenerator;

public class Pyramid implements Observable {
	private List<Observer> observers= new ArrayList<Observer>();
	private Point a;
	private Point b;
	private Point c;
	private int h;
	private final long pyramidId;
	public Pyramid(Point a, Point b, Point c, int h) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
		this.pyramidId = IdGenerator.generateId();
		observers.add(new PyramidObserver());
	}	
	
	public long getPyramidId() {
		return pyramidId;
	}

	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
		notifyObservers();
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
		notifyObservers();
	}
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c = c;
		notifyObservers();
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
		notifyObservers();
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		if (observers.isEmpty()) {
			return;
		}
		PyramidEvent event= new PyramidEvent(this);
		for (Observer observer:observers) {
			observer.parameterChanged(event);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		result = prime * result + h;
		result = prime * result + ((observers == null) ? 0 : observers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pyramid other = (Pyramid) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		if (h != other.h)
			return false;
		if (observers == null) {
			if (other.observers != null)
				return false;
		} else if (!observers.equals(other.observers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pyramid [observers=");
		builder.append(observers);
		builder.append(", a=");
		builder.append(a);
		builder.append(", b=");
		builder.append(b);
		builder.append(", c=");
		builder.append(c);
		builder.append(", h=");
		builder.append(h);
		builder.append(", pyramidId=");
		builder.append(pyramidId);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
