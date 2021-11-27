package by.zastr.shape.repository.impl;

import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.repository.PyramidSpecification;

public class AboveXYPyramidSpecification implements PyramidSpecification {
	private int hightAboveXY;
	
	

	public AboveXYPyramidSpecification(int hAboveXY) {
		this.hightAboveXY = hAboveXY;
	}

	@Override
	public boolean specify(Pyramid pyramid) {
		return pyramid.getA().z()>this.hightAboveXY;
	}

}
