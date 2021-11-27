package by.zastr.shape.repository.impl;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.zastr.shape.entity.Point;
import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.exception.PyramidException;

public class PyramidRepositoryImplTest {
  PyramidRepositoryImpl pyramidRepository;
  Pyramid pyramid=null;
  Pyramid pyramid1=new Pyramid(new Point(0,0,0), new Point(0,2,0), new Point(2,0,0), 2);
  List<Pyramid> pyramidList=null;
  int indexOutOfRange=2;
	
  @BeforeClass
  public void setUp() {
	  pyramidRepository = new PyramidRepositoryImpl();
  }

  @Test(expectedExceptions =PyramidException.class)
  public void addTestNull() throws PyramidException {
	  pyramidRepository.add(pyramid);
  }

  @Test(expectedExceptions =PyramidException.class)
  public void addAllTestNull() throws PyramidException {
	  pyramidRepository.addAll(pyramidList);
  }

  @Test(expectedExceptions =PyramidException.class)
  public void containsTestNull() throws PyramidException {
	  pyramidRepository.add(pyramid1);
	  pyramidRepository.contains(pyramid);
  }

  @Test(expectedExceptions =PyramidException.class)
  public void getTestIllegalIndex() throws PyramidException {
	  pyramidRepository.add(pyramid1);
	  pyramidRepository.get(indexOutOfRange);
  }

  @Test(expectedExceptions =PyramidException.class)
  public void indexOfTestNull() throws PyramidException {
	  pyramidRepository.indexOf(pyramid);
  }

  @Test(expectedExceptions =PyramidException.class)
  public void queryTestNull() throws PyramidException {
	  pyramidRepository.query(null); 
  }

  @Test(expectedExceptions =PyramidException.class)
  public void removeTestNull() throws PyramidException {
	  pyramidRepository.add(pyramid1);
	  pyramidRepository.remove(pyramid);
  }

  @Test(expectedExceptions =PyramidException.class)
  public void setTestNull() throws PyramidException {
	  pyramidRepository.set(1, pyramid);   
  }

  @Test(expectedExceptions =PyramidException.class)
  public void sortTestNull() throws PyramidException {
	  pyramidRepository.sort(null);
  }
}
