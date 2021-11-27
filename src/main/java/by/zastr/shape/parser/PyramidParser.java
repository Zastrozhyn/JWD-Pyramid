package by.zastr.shape.parser;

import java.util.List;

import by.zastr.shape.exception.PyramidException;

public interface PyramidParser {

	List<int[]> parseToArray(List<String> list) throws PyramidException;

}