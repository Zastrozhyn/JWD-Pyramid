package by.zastr.shape.exception;

@SuppressWarnings("serial")
public class PyramidException extends Exception{

	public PyramidException() {
    }

    public PyramidException(String message) {
        super(message);
    }

    public PyramidException(String message, Throwable cause) {
        super(message, cause);
    }

    public PyramidException(Throwable cause) {
        super(cause);
    }
}
