package by.zastr.shape.repository.impl;

import by.zastr.shape.action.PyramidMathImpl;
import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.repository.PyramidSpecification;

public class VolumePyramidSpecification implements PyramidSpecification{
	
	private final static double NULL_VOLUME=0;
	private double maxVolume;
	
	

	public VolumePyramidSpecification(double maxVolume) {
		this.maxVolume = maxVolume;
	}



	@Override
	public boolean specify(Pyramid pyramid) {
		if(pyramid==null) {
			return false;
		}
		var pyramidMath= new PyramidMathImpl();
		double volume= pyramidMath.pyramidVolume(pyramid);		
		return volume>NULL_VOLUME&&volume<=this.maxVolume;
	}

}
