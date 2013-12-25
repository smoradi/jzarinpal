package mars.jzarinpal.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import javax.ws.rs.core.Response.Status;

import org.junit.Test;

import mars.jzarinpal.client.impl.JZarinpalClientImpl;
import mars.jzarinpal.client.impl.WrongStatusCodeException;
import mars.jzarinpal.domain.build.BuildProps;
import mars.jzarinpal.domain.dto.PaymentRequestDto;

public class PaymentRequestClientTest extends ClientTestCaseBase {

	@Test
	public void obtainPaymentToken() {
		JZarinpalClient client = JZarinpalClientImpl.newClient();
		PaymentRequestDto dto = new PaymentRequestDto(1000, "Charge account test");
		try {
			String authorityToken = client.paymentRequest(dto);
			assertFalse(authorityToken.trim().isEmpty());
		} catch (WrongStatusCodeException e) {
			assertFalse("We should see exception in development mode", BuildProps.isProdServer);
			assertEquals("Status code should be 502 in dev mode", Status.BAD_GATEWAY.getStatusCode(), e.getStatusCode());
		}
	}

}