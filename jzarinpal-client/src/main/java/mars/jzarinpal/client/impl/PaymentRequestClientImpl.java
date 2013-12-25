package mars.jzarinpal.client.impl;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import mars.jzarinpal.domain.constants.CS;
import mars.jzarinpal.domain.constants.Paths;
import mars.jzarinpal.domain.dto.PaymentRequestDto;

public class PaymentRequestClientImpl extends ClientBase {

	public PaymentRequestClientImpl(WebTarget webTarget) {
		super(webTarget);
	}

	public String paymentRequest(PaymentRequestDto dto) throws UnexpectedStatusCodeException {
		Form form = new Form(CS.amount, dto.amount+"")
				.param(CS.description, dto.description)
				.param(CS.callbackURL, dto.callbackURL)
				.param(CS.email, dto.email)
				.param(CS.mobile, dto.mobile);
		Entity<Form> entity = Entity.form(form);
		Response response = this.webTarget.path(Paths.paymentrequest).request().post(entity);
		if (response.getStatus() == Status.CREATED.getStatusCode()) {
			return response.readEntity(String.class);
		}
		throw new UnexpectedStatusCodeException(response.getStatus());
	}

}