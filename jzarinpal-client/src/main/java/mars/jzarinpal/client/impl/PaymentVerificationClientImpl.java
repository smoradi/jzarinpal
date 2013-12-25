package mars.jzarinpal.client.impl;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import mars.jzarinpal.domain.constants.Paths;
import mars.jzarinpal.domain.dto.PaymentVerificationDto;

public class PaymentVerificationClientImpl extends ClientBase {

	public PaymentVerificationClientImpl(WebTarget webTarget) {
		super(webTarget);
	}

	public Long paymentVerification(PaymentVerificationDto dto) throws UnexpectedStatusCodeException {
		String paymentVerificationPath = String.format("%s/%s/%s",
				Paths.paymentverification, dto.getAmount(), dto.getAuthority());

		Response response = this.webTarget.path(paymentVerificationPath).request().get(Response.class);
		if (response.getStatus() == Status.OK.getStatusCode()) {
			return response.readEntity(Long.class);
		}
		throw new UnexpectedStatusCodeException(response.getStatus());
	}

}