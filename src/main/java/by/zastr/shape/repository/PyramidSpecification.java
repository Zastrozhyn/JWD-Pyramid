package by.zastr.shape.repository;

import by.zastr.shape.entity.Pyramid;

@FunctionalInterface
public interface PyramidSpecification {
	boolean specify(Pyramid pyramid);

}
