package test.zastr.shape.factory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


import by.zastr.shape.entity.Point;
import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.exception.PyramidException;
import by.zastr.shape.factory.PyramidFactory;
import by.zastr.shape.factory.impl.PyramidFactoryImpl;

public class PyramidFactoryTest {
	PyramidFactory pyramidFactory;
	
	@BeforeClass
	public void setUp() {
		pyramidFactory = new PyramidFactoryImpl();
	}
	    
	@Test
	public void testCreatePyramid () throws PyramidException {
		int[] argument= new int[]{0,0,0,2,0,0,0,2,0,4};
		Pyramid actual= pyramidFactory.createPyramid(argument);
		Pyramid expected= new Pyramid(new Point(0,0,0), new Point(2,0,0), new Point(0,2,0), 4);
		assertEquals(actual, expected);
	}
	
    @Test(expectedExceptions = PyramidException.class)
    public void testCreatePyramidListNullList() throws PyramidException {
        pyramidFactory.createListPyramid(null);
    }
    
    @Test(expectedExceptions = PyramidException.class)
    public void testCreatePyramidIllegalNumberOfArgument() throws PyramidException {
    	int[] argument= new int[]{0,0,0,2,0,0,0,2,0};
		pyramidFactory.createPyramid(argument);
    }
    

}
