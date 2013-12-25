package mars.jzarinpal.client.impl;

public class UnexpectedStatusCodeException extends Exception {
	private static final long serialVersionUID = 1L;

	private final int statusCode;

	public UnexpectedStatusCodeException(int status) {
		statusCode = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

}