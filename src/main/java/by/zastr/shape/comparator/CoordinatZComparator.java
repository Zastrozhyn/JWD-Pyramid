package by.zastr.shape.comparator;

import java.util.Comparator;

import by.zastr.shape.entity.Pyramid;

public class CoordinatZComparator implements Comparator<Pyramid>{

	@Override
	public int compare(Pyramid o1, Pyramid o2) {
		return o1.getA().z()-o2.getA().z();
	}

}
