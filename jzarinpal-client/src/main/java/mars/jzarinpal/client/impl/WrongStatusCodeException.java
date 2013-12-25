package mars.jzarinpal.client.impl;

public class WrongStatusCodeException extends Exception {
	private static final long serialVersionUID = 1L;

	private final int statusCode;

	public WrongStatusCodeException(int status) {
		statusCode = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

}