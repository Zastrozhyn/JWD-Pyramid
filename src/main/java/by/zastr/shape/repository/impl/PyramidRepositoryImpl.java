package by.zastr.shape.repository.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.exception.PyramidException;
import by.zastr.shape.repository.PyramidRepository;
import by.zastr.shape.repository.PyramidSpecification;

public class PyramidRepositoryImpl implements PyramidRepository {

    private List<Pyramid> pyramidList = new ArrayList<>();
    private static Logger logger= LogManager.getLogger();

    @Override
	public boolean add(Pyramid pyramid) throws PyramidException {
    	if (pyramid==null) {
    		logger.log(Level.ERROR, "pyramid=null");
   		    throw new PyramidException("pyramid=null");
   		}
        return pyramidList.add(pyramid);
    }

    @Override
	public boolean addAll(List<Pyramid> pyramides) throws PyramidException {
    	if (pyramides==null) {
    		logger.log(Level.ERROR, "pyramides=null");
   		    throw new PyramidException("pyramides=null");
   		 }
        return pyramidList.addAll(pyramides);
    }

    @Override
	public void clear() {
    	pyramidList.clear();
    }

    @Override
	public boolean contains(Pyramid pyramid) throws PyramidException {
    	if (pyramid==null) {
    		logger.log(Level.ERROR, "pyramid=null");
   		    throw new PyramidException("pyramid=null");
   		}
        return pyramidList.contains(pyramid);
    }

    @Override
	public Pyramid get(int index) throws PyramidException {
    	if (index>=pyramidList.size()) {
    		logger.log(Level.ERROR, "Index>pyramideList sise");
   		    throw new PyramidException("Index>pyramideList sise");
   		} 
        return pyramidList.get(index);
    }

    @Override
	public int indexOf(Pyramid pyramid) throws PyramidException {
    	if (pyramid==null) {
    		logger.log(Level.ERROR, "pyramid=null");
   		    throw new PyramidException("pyramid=null");
   		}
        return pyramidList.indexOf(pyramid);
    }

    @Override
	public Pyramid remove(int index) throws PyramidException {
    	if (index>=pyramidList.size()) {
    		logger.log(Level.ERROR, "Index>pyramideList sise");
   		    throw new PyramidException("Index>pyramideList sise");
   		}
        return pyramidList.remove(index);
    }

    @Override
	public boolean remove(Pyramid pyramid) throws PyramidException {
    	if (pyramid==null) {
    		logger.log(Level.ERROR, "pyramid=null");
   		    throw new PyramidException("pyramid=null");
   		}
        return pyramidList.remove(pyramid);
    }

    @Override
	public Pyramid set(int index, Pyramid pyramid) throws PyramidException {
    	if (pyramid==null) {
    		logger.log(Level.ERROR, "pyramid=null");
   		    throw new PyramidException("pyramid=null");
   		}
    	if (index>=pyramidList.size()) {
    		logger.log(Level.ERROR, "Index>pyramideList sise");
   		    throw new PyramidException("Index>pyramideList sise");
   		} 
        return pyramidList.set(index, pyramid);
    }

    @Override
	public List<Pyramid> query(PyramidSpecification pyramidSpecification) throws PyramidException {
    	if (pyramidSpecification==null) {
    		 logger.log(Level.ERROR, "PyramidSpecification=null");
    		 throw new PyramidException("PyramidSpecification=null");
     	}
        return pyramidList.stream().filter(pyramidSpecification::specify).toList();
    }

    @Override
	public List<Pyramid> sort(Comparator<? super Pyramid> comparator) throws PyramidException {
    	if (comparator==null) {
   		 logger.log(Level.ERROR, "Pyramid comparator=null");
   		 throw new PyramidException("Pyramid comparator=null");
    	}
        List<Pyramid> trianglesClone = new ArrayList<>(pyramidList);
        trianglesClone.sort(comparator);
        return trianglesClone;
    }
    
    @Override
    public boolean equals(Object o) {
        return pyramidList.equals(o);
    }

    @Override
    public int hashCode() {
        return pyramidList.hashCode();
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PyramidRepositoryImpl [pyramidList=");
		builder.append(pyramidList);
		builder.append("]");
		return builder.toString();
	}
    

}
