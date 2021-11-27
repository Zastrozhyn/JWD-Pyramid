package by.zastr.shape.parser.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.zastr.shape.exception.PyramidException;
import by.zastr.shape.parser.PyramidParser;
import by.zastr.shape.util.PyramidValidator;

public class PyramidParserImpl implements PyramidParser {
	private static Logger logger=LogManager.getLogger();
	private static final String DELIMITER_REGEX = "\\s+";
 
	@Override
	public List<int[]> parseToArray (List<String> list) throws PyramidException{
		if (list == null ||list.isEmpty()) {
			logger.log(Level.ERROR, "List is null or hasn't any strings");
            throw new PyramidException("List is null or hasn't any strings");
        }
		List<int[]> pyramidList=new ArrayList<int[]>();
		for (int i=0; i<list.size();i++) {
			if(!PyramidValidator.PyramidData(list.get(i))){
				logger.log(Level.INFO, "It is not valid data: "+list.get(i));			
			}
			else {
				String[] arrayStringInteger= list.get(i).split(DELIMITER_REGEX);
				int[] array= new int[arrayStringInteger.length];
				for(int k=0;k<arrayStringInteger.length;k++) {
					array[k]=Integer.parseInt(arrayStringInteger[k]);
				}
				pyramidList.add(array);				
			}
			
		}
		logger.log(Level.INFO, "Parsing is successful");
		return pyramidList;
	}

}
