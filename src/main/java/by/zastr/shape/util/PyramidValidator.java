package by.zastr.shape.util;

import by.zastr.shape.action.PyramidMathImpl;
import by.zastr.shape.entity.Point;
import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.factory.impl.PyramidFactoryImpl;

public class PyramidValidator {
	private static final String PYRAMID_DATA_REGEX = "^(\\d+\\s*){10}$";
	
	public static boolean isPyramid(int[] argument) {
		if(argument.length!=PyramidFactoryImpl.VALID_AMOUNT_OF_ARGUMENTS) {
			return false;
		}
		if (argument[9]==0) {
			return false;
		}
		if(!isBaseIsSquare(argument)){
			return false;
		}
		return true;
	}
	private static boolean isBaseIsSquare(int[] argument) {
		
		var pyramidMath= new PyramidMathImpl();
		double ab=pyramidMath.segmentLenght(new Point(argument[0],argument[1],argument[2]),new Point (argument[3],argument[4],argument[5]));
		double ac=pyramidMath.segmentLenght(new Point(argument[0],argument[1],argument[2]),new Point (argument[6],argument[7],argument[8]));		
		if(ab!=ac) {
			return false;
		}
		double bc=pyramidMath.segmentLenght(new Point(argument[6],argument[7],argument[8]),new Point (argument[3],argument[4],argument[5]));		
		return Math.abs(ab*ab+ac*ac-bc*bc) < 0.0001;		
	}
	
	public static boolean isPyramid(Pyramid pyramid) {
		var argument= new int[10];
		argument[0]=pyramid.getA().x();
		argument[1]=pyramid.getA().y();
		argument[2]=pyramid.getA().z();
		argument[3]=pyramid.getB().x();
		argument[4]=pyramid.getB().y();
		argument[5]=pyramid.getB().z();
		argument[6]=pyramid.getC().x();
		argument[7]=pyramid.getC().y();
		argument[8]=pyramid.getC().z();
		argument[9]=pyramid.getH();
		return isPyramid(argument) ;
	}
	 public static boolean PyramidData(String data) {
	        return data.matches(PYRAMID_DATA_REGEX);
	 }
}
