package by.zastr.shape.reader;

import java.util.List;

import by.zastr.shape.exception.PyramidException;

public interface PyramidReader {

	List<String> readFile(String file) throws PyramidException;

}