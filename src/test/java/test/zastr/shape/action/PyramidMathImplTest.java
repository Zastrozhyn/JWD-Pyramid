package test.zastr.shape.action;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import by.zastr.shape.action.PyramidMathImpl;
import by.zastr.shape.entity.Point;
import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.exception.PyramidException;
import static org.testng.Assert.*;


public class PyramidMathImplTest {
	 PyramidMathImpl pyramidMath;
	 Pyramid pyramid;
	 
	 @BeforeMethod
	 @BeforeClass
	 public void setUp() throws PyramidException {
		 pyramidMath = new PyramidMathImpl();
	     pyramid = new Pyramid(new Point(0,0,0), new Point(0,2,0), new Point(2,0,0), 4);
	 }   
	 
	 @Test
	 public void testPyramidArea() {
		 double actual = pyramidMath.pyramidArea(pyramid);
	     double expected = 20.49;
	     assertEquals(actual, expected,0.01);
	 }
	 
	 @Test
	 public void testPyramidVolume() {
		 double actual = pyramidMath.pyramidVolume(pyramid);
	     double expected = 5.33;
	     assertEquals(actual, expected,0.01);
	 }
	 
	 @Test
	 public void testPyramidVolumeRatio() {
		 double actual = pyramidMath.pyramidVolumeRatio(pyramid,2);
	     double expected = 0.125;
	     assertEquals(actual, expected,0.01);
	 }
	        
	 
	    
	    
}
