package by.zastr.shape.comparator;

import java.util.Comparator;

import by.zastr.shape.entity.Pyramid;

public class PyramidIdComparator implements Comparator<Pyramid>{

	@Override
	public int compare(Pyramid o1, Pyramid o2) {		
		return (int) (o1.getPyramidId()-o2.getPyramidId());
	}

}
