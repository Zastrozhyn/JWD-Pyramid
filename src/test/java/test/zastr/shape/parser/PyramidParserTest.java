package test.zastr.shape.parser;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import by.zastr.shape.exception.PyramidException;
import by.zastr.shape.parser.PyramidParser;
import by.zastr.shape.parser.impl.PyramidParserImpl;

public class PyramidParserTest {
	PyramidParser pyramidParser;
	List<String> list= List.of(
			"0 0 0  0 2 0  2 0 0  2",
			"0 0 0  0 3 0  3 0 0  5");
	
	@BeforeClass
	public void setUp() {
		pyramidParser= new PyramidParserImpl();	
	}
	
	@Test
	public void parseToArrayTest() throws PyramidException {
		List<int[]> actual= pyramidParser.parseToArray(list);
		List<int[]> expected= List.of(
				new int[] {0,0,0,0,2,0,2,0,0,2},
				new int[] {0,0,0,0,3,0,3,0,0,5});
		assertThat(actual).containsExactlyElementsOf(expected);
	}
    @Test(expectedExceptions = PyramidException.class)
    public void testParseNullStringListToArray() throws PyramidException {
        pyramidParser.parseToArray(null);
    }
    public void testParseEmptyStringListToArray() throws PyramidException {
    	List<String> list= new ArrayList<String>();
        pyramidParser.parseToArray(list);
    }
}
