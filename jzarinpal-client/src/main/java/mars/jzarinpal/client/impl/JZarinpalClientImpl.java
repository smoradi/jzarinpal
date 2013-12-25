package mars.jzarinpal.client.impl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import mars.jzarinpal.client.JZarinpalClient;
import mars.jzarinpal.domain.build.BuildProps;
import mars.jzarinpal.domain.dto.PaymentRequestDto;

public class JZarinpalClientImpl extends ClientBase implements JZarinpalClient {

	private final PaymentRequestClientImpl paymentRequestClientImpl;

	public JZarinpalClientImpl(WebTarget webTarget) {
		super(webTarget);
		paymentRequestClientImpl = new PaymentRequestClientImpl(webTarget);
	}

	public static JZarinpalClient newClient() {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(BuildProps.serviceBaseUri);
		return new JZarinpalClientImpl(webTarget);
	}

	@Override
	public String paymentRequest(PaymentRequestDto dto) throws WrongStatusCodeException {
		return paymentRequestClientImpl.paymentRequest(dto);
	}

}