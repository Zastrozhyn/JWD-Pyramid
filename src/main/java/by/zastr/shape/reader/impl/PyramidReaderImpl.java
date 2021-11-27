package by.zastr.shape.reader.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.zastr.shape.exception.PyramidException;
import by.zastr.shape.reader.PyramidReader;

public class PyramidReaderImpl implements PyramidReader {
	private static Logger logger=LogManager.getLogger();
	@Override
	public List<String> readFile(String file) throws PyramidException {
		if (file == null || file.isBlank()) {
			logger.log(Level.ERROR, "File name is null or empty");
            throw new PyramidException("File name is null or empty");
        }
        List<String> pyramidList;
        Path dataFile = Paths.get(file);
        try (Stream<String> dataStream = Files.lines(dataFile)){
            pyramidList = dataStream.collect(Collectors.toList());
        } catch (IOException e) {
        	logger.log(Level.ERROR, "Read file error"+ e);
            throw new PyramidException(String.format("Error during reading file %s", dataFile.getFileName()), e);
        }
        logger.log(Level.INFO, "Read file is successful");
        return pyramidList;
	}
		        
}
