package mars.jzarinpal.client.impl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import mars.jzarinpal.client.JZarinpalClient;
import mars.jzarinpal.domain.build.BuildProps;
import mars.jzarinpal.domain.dto.PaymentRequestDto;
import mars.jzarinpal.domain.dto.PaymentVerificationDto;

public class JZarinpalClientImpl extends ClientBase implements JZarinpalClient {

	private final PaymentRequestClientImpl paymentRequestClientImpl;
	private final PaymentVerificationClientImpl paymentVerificationClientImpl;

	public JZarinpalClientImpl(WebTarget webTarget) {
		super(webTarget);
		paymentRequestClientImpl = new PaymentRequestClientImpl(webTarget);
		paymentVerificationClientImpl = new PaymentVerificationClientImpl(webTarget);
	}

	public static JZarinpalClient newClient() {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(BuildProps.serviceBaseUri);
		return new JZarinpalClientImpl(webTarget);
	}

	@Override
	public String paymentRequest(PaymentRequestDto dto) throws UnexpectedStatusCodeException {
		return paymentRequestClientImpl.paymentRequest(dto);
	}

	@Override
	public Long paymentVerification(PaymentVerificationDto dto) throws UnexpectedStatusCodeException {
		return paymentVerificationClientImpl.paymentVerification(dto);
	}

}