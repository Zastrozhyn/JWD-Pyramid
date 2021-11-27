package by.zastr.shape.observer.impl;

import by.zastr.shape.action.PyramidMathImpl;
import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.entity.PyramidParameters;
import by.zastr.shape.entity.PyramidWarehouse;
import by.zastr.shape.observer.Observer;
import by.zastr.shape.observer.PyramidEvent;

public class PyramidObserver implements Observer{

	@Override
	public void parameterChanged(PyramidEvent event) {
		if (event==null) {
			return;
		}
		var pyramidMath= new PyramidMathImpl();
		Pyramid pyramid=event.getSource();
		var pyramidParameters= new PyramidParameters(pyramidMath.pyramidArea(pyramid), pyramidMath.pyramidVolume(pyramid));
		PyramidWarehouse.getInstance().putParameters(pyramid.getPyramidId(), pyramidParameters);
	}

}
