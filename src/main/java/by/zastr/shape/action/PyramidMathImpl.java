package by.zastr.shape.action;

import by.zastr.shape.entity.Point;
import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.util.PyramidValidator;

public class PyramidMathImpl implements PyramidMath{

	@Override
	public double pyramidArea(Pyramid pyramid) {
		return baseArea(pyramid)+2*apothemLenght(pyramid)*segmentLenght(pyramid.getA(), pyramid.getB());
	}

	@Override
	public double pyramidVolume(Pyramid pyramid) {
		return Math.abs(baseArea(pyramid)*pyramid.getH()/3);
	}

	@Override
	public double pyramidVolumeRatio(Pyramid pyramid, int z) {
		if(z>(pyramid.getH()+pyramid.getA().z())) {
			return 0;
		}
		double hNewPyramid=pyramid.getH()-z+pyramid.getA().z();
		double hRatio=Math.pow(hNewPyramid/pyramid.getH(), 2);
		double areaBaseNewPyramid=baseArea(pyramid)*hRatio;
		double volumeNewPyramid=areaBaseNewPyramid*hNewPyramid/3;
		return volumeNewPyramid/pyramidVolume(pyramid);
	}

	@Override
	public boolean isBaseOnCoordinatePlane(Pyramid pyramid) {
		if (pyramid.getA().z()==0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isPyramid(Pyramid pyramid) { 
		return PyramidValidator.isPyramid(pyramid);
	}
	public double baseArea(Pyramid pyramid) {
		return segmentLenght(pyramid.getA(),pyramid.getB())*segmentLenght(pyramid.getA(),pyramid.getC());
		}
	public  double segmentLenght(Point a, Point b) {
		return Math.sqrt((a.x()-b.x())*(a.x()-b.x())+(a.y()-b.y())*(a.y()-b.y()));
	}
	public  double apothemLenght(Pyramid pyramid) {
		return Math.sqrt(pyramid.getH()*pyramid.getH()+(segmentLenght(pyramid.getA(),pyramid.getB())*segmentLenght(pyramid.getA(),pyramid.getB()))/4);
	}
	
}
