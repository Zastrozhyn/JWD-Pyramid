package by.zastr.shape.comparator;

import java.util.Comparator;

import by.zastr.shape.action.PyramidMathImpl;
import by.zastr.shape.entity.Pyramid;

public class PyramidVolumeComparator implements Comparator<Pyramid>{

	@Override
	public int compare(Pyramid o1, Pyramid o2) {
		var pyramidMath= new PyramidMathImpl();
		return (int) (pyramidMath.pyramidVolume(o1)-pyramidMath.pyramidVolume(o2));
	}

}
