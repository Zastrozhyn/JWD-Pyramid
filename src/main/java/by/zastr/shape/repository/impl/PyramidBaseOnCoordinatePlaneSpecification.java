package by.zastr.shape.repository.impl;

import by.zastr.shape.action.PyramidMathImpl;
import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.repository.PyramidSpecification;

public class PyramidBaseOnCoordinatePlaneSpecification implements PyramidSpecification{

	@Override
	public boolean specify(Pyramid pyramid) {
		var pyramidMath= new PyramidMathImpl();
		return pyramidMath.isBaseOnCoordinatePlane(pyramid);
	}

}
