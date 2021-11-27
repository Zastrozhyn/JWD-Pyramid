package by.zastr.shape.observer;

import java.util.EventObject;

import by.zastr.shape.entity.Pyramid;

public class PyramidEvent extends EventObject{

	public PyramidEvent(Pyramid source) {
		super(source);
	}
	@Override
	public Pyramid getSource() {
		return (Pyramid) super.getSource();
	}

}
