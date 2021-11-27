package by.zastr.shape.repository;

import java.util.Comparator;
import java.util.List;

import by.zastr.shape.entity.Pyramid;
import by.zastr.shape.exception.PyramidException;

public interface PyramidRepository {

	boolean add(Pyramid pyramid) throws PyramidException;

	boolean addAll(List<Pyramid> pyramides) throws PyramidException;

	void clear();

	boolean contains(Pyramid pyramid) throws PyramidException;

	Pyramid get(int index) throws PyramidException;

	int indexOf(Pyramid pyramid) throws PyramidException;

	Pyramid remove(int index) throws PyramidException;

	boolean remove(Pyramid pyramid) throws PyramidException;

	Pyramid set(int index, Pyramid pyramid) throws PyramidException;

	List<Pyramid> query(PyramidSpecification pyramidSpecification) throws PyramidException;

	List<Pyramid> sort(Comparator<? super Pyramid> comparator) throws PyramidException;

}