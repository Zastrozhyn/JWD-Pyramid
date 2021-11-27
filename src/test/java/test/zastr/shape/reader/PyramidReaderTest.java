package test.zastr.shape.reader;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.zastr.shape.exception.PyramidException;
import by.zastr.shape.reader.PyramidReader;
import by.zastr.shape.reader.impl.PyramidReaderImpl;

public class PyramidReaderTest {
    PyramidReader pyramidReader;
	
	@BeforeClass
	public void setUp() {
		pyramidReader= new PyramidReaderImpl();	
	}
	
	@Test(expectedExceptions= PyramidException.class )
	public void testPyramidREaderNullFile() throws PyramidException {
		pyramidReader.readFile(null);	
	}
	
	@Test(expectedExceptions= PyramidException.class )
	public void testPyramidREaderEmptyFileName() throws PyramidException {
		pyramidReader.readFile("");	
	}

}
