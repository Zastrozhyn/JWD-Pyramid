package by.zastr.shape.factory.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.zastr.shape.action.PyramidMathImpl;
import by.zastr.shape.entity.Point;
import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.entity.PyramidParameters;
import by.zastr.shape.entity.PyramidWarehouse;
import by.zastr.shape.exception.PyramidException;
import by.zastr.shape.factory.PyramidFactory;
import by.zastr.shape.util.PyramidValidator;

public class PyramidFactoryImpl implements PyramidFactory {
	public static final int VALID_AMOUNT_OF_ARGUMENTS=10;
	private static Logger logger = LogManager.getLogger();
	@Override
	public Pyramid createPyramid(int[] argument) throws PyramidException {
		if (argument == null || argument.length !=VALID_AMOUNT_OF_ARGUMENTS||!PyramidValidator.isPyramid(argument) ) {
			logger.log(Level.ERROR, "Parameters aren't correct");
            throw new PyramidException("Parameters aren't correct");
        }
		var pyramid =new Pyramid(new Point(argument[0],argument[1],argument[2]),
				                 new Point(argument[3],argument[4],argument[5]),
				                 new Point(argument[6],argument[7],argument[8]),argument[9]);
		logger.log(Level.INFO, "Creating Pyramid successful");
		var pyramidMath= new PyramidMathImpl();
		var pyramidParameters= new PyramidParameters (pyramidMath.pyramidArea(pyramid), pyramidMath.pyramidVolume(pyramid));
		PyramidWarehouse.getInstance().putParameters(pyramid.getPyramidId(),pyramidParameters);
		return pyramid;
	}
	@Override
	public List<Pyramid> createListPyramid(List<int[]> argumetList) throws PyramidException{
		if (argumetList == null ) {
            throw new PyramidException("argumetList=NULL");
        }
		List<Pyramid> listOfPyramid= new ArrayList<Pyramid>();
		for(int[] array:argumetList) {
			Pyramid pyramid=createPyramid(array);
			listOfPyramid.add(pyramid);
		}
		logger.log(Level.INFO, "Creating Pyramid list is successful");
		return listOfPyramid;
	}
}
