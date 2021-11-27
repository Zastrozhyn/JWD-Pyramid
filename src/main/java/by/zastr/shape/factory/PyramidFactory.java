package by.zastr.shape.factory;

import java.util.List;

import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.exception.PyramidException;

public interface PyramidFactory {

	Pyramid createPyramid(int[] argument) throws PyramidException;

	List<Pyramid> createListPyramid(List<int[]> argumetList) throws PyramidException;

}