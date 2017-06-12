package ar.com.puentedeideas.shapeshift;

public class ShapeshiftConnectionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5937634855117982180L;
	
	public ShapeshiftConnectionException(String message) {
		super(message);
	}

	public ShapeshiftConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

}