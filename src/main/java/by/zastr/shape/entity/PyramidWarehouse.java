package by.zastr.shape.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PyramidWarehouse {
	private static PyramidWarehouse instance;
    private Map<Long, PyramidParameters> pyramidMap = new HashMap<>();

    private  PyramidWarehouse() {
	}
    

    public static PyramidWarehouse getInstance() {
        if (instance == null) {
            instance = new PyramidWarehouse();
        }
        return instance;
    }

    public Map<Long, PyramidParameters> getTriangleMap() {
        return Map.copyOf(pyramidMap);
    }

    public void putParameters(long id, PyramidParameters pyramidParameters) {
        instance.pyramidMap.put(id, pyramidParameters);
    }

    public Optional<PyramidParameters> getParameters(long id) {
        Optional<PyramidParameters> parameters = Optional.ofNullable(instance.pyramidMap.get(id));
        return parameters;
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pyramidMap == null) ? 0 : pyramidMap.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PyramidWarehouse other = (PyramidWarehouse) obj;
		if (pyramidMap == null) {
			if (other.pyramidMap != null)
				return false;
		} else if (!pyramidMap.equals(other.pyramidMap))
			return false;
		return true;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PyramidWarehouse [pyramidMap=");
		builder.append(pyramidMap);
		builder.append("]");
		return builder.toString();
	}
    
}
