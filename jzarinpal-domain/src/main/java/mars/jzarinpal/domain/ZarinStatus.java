package mars.jzarinpal.domain;

import javax.ws.rs.core.Response.Status;

public enum ZarinStatus {
	BAD_REQUEST(-1), BAD_GATEWAY(-2), EXPECTATION_FAILED(-3),
	SERVICE_UNAVAILABLE(-4), NOT_FOUND(-11), NOT_FOUND_PAYMENT(-21),
	NOT_ACCEPTABLE(-22), CONFILICT(-33), GONE(-54), CREATED(100),
	OK(101);

	/**
	 * This method is useful for initializing ZarinStatus
	 * from received status code from Zarinpal web service.
	 *
	 * @param code		the status code from Zarinpal web service
	 * @return
	 */
	public static ZarinStatus fromCode(int code) {
		switch (code) {
		case -1:				// Invalid Request
			return BAD_REQUEST;
		case -2:				// Invalid IP or merchantID
			return BAD_GATEWAY;
		case -3:				// Amount should be higher than 100 $TOMAN
			return EXPECTATION_FAILED;
		case -4:				// Service unavailable
			return SERVICE_UNAVAILABLE;
		case -11:				// Resource not found
			return NOT_FOUND;
		case -21:				// Payment not found
			return NOT_FOUND_PAYMENT;
		case -22:				// Result was failure
			return NOT_ACCEPTABLE;
		case -33:				// Amount was not matched
			return CONFILICT;
		case -54:				// Result was archived
			return GONE;
		case 100:				// Result was successful (first time)
			return CREATED;
		case 101:				// Result was successful
			return OK;
		default:
			return null;
		}
	}

	private ZarinStatus(int code) {
		this.code = code;
	}

	private int code;

	public int getCode() {
		return code;
	}

	public Status getStatus() {
		switch (this) {
		case  BAD_REQUEST:
return Status.BAD_REQUEST;
		case  BAD_GATEWAY:
return Status.BAD_GATEWAY;
		case  EXPECTATION_FAILED:
return Status.EXPECTATION_FAILED;
		case  SERVICE_UNAVAILABLE:
return Status.SERVICE_UNAVAILABLE;
		case  NOT_FOUND:
return Status.NOT_FOUND;
		case  NOT_FOUND_PAYMENT:
return Status.NOT_FOUND;
		case  NOT_ACCEPTABLE:
return Status.NOT_ACCEPTABLE;
		case  CONFILICT:
return Status.CONFLICT;
		case  GONE:
return Status.GONE;
		case  CREATED:
return Status.CREATED;
		case  OK:
return Status.OK;
		default:
			return null;
		}
	}

	/**
	 * This method is useful for initializing ZarinStatus
	 * from received HTTP status code from jzarinpal-client library.
	 *
	 * @param statusCode	the HTTP status code from jzarinpal-client library
	 * @return
	 */
	public static ZarinStatus fromHttpStatusCode(int statusCode) {
		switch(statusCode) {
		case 200:
			return OK;
		case 201:
			return CREATED;
		case 400:
			return BAD_REQUEST;
		case 404:
			return NOT_FOUND;
		case 406:
			return NOT_ACCEPTABLE;
		case 409:
			return CONFILICT;
		case 410:
			return GONE;
		case 417:
			return EXPECTATION_FAILED;
		case 500:
			return SERVICE_UNAVAILABLE;
		case 502:
			return BAD_GATEWAY;
		case 503:
			return SERVICE_UNAVAILABLE;
		default:
			return null;
		}
	}

}