package by.zastr.shape.action;

import by.zastr.shape.entity.Pyramid;

public interface PyramidMath {
	public double pyramidArea(Pyramid pyramid);
	public double pyramidVolume(Pyramid pyramid);
	public double pyramidVolumeRatio(Pyramid pyramid,int z);
	public boolean isBaseOnCoordinatePlane(Pyramid pyramid);
	public boolean isPyramid(Pyramid pyramid);
	
}
