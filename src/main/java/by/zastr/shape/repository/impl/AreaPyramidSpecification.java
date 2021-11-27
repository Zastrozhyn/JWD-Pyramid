package by.zastr.shape.repository.impl;

import by.zastr.shape.action.PyramidMathImpl;
import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.repository.PyramidSpecification;

public class AreaPyramidSpecification implements PyramidSpecification {
	 private static final double NULL_AREA = 0;
	 private double maxArea;
	 

	public AreaPyramidSpecification(double maxArea) {
		this.maxArea = maxArea;
	}


	@Override
	public boolean specify(Pyramid pyramid) {
		var pyramidMath= new PyramidMathImpl();
		if(pyramid==null) {
			return false;
		}
		double area=pyramidMath.pyramidArea(pyramid);
		return area>NULL_AREA&&area<=this.maxArea;
	}

}
