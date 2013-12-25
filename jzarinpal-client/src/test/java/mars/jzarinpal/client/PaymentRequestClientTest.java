package mars.jzarinpal.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.ws.rs.core.Response.Status;

import org.junit.Test;

import mars.jzarinpal.client.impl.JZarinpalClientImpl;
import mars.jzarinpal.client.impl.UnexpectedStatusCodeException;
import mars.jzarinpal.domain.build.BuildProps;
import mars.jzarinpal.domain.dto.PaymentRequestDto;
import mars.jzarinpal.domain.dto.PaymentVerificationDto;

public class PaymentRequestClientTest extends ClientTestCaseBase {

	private final int amount = 1000;
	private static String authorityToken = "is-not-set-yet";

	@Test
	public void testObtainingPaymentToken() {
		JZarinpalClient client = JZarinpalClientImpl.newClient();
		PaymentRequestDto dto = new PaymentRequestDto(amount, "Charge account test");
		try {
			String paymentToken = client.paymentRequest(dto);
			authorityToken = paymentToken;
			assertFalse(paymentToken.trim().isEmpty());
		} catch (UnexpectedStatusCodeException e) {
			authorityToken = "is-set-but-we-are-in-development-mode";
			assertTrue("We should see exception in development mode", BuildProps.isDevServer);
			assertEquals("Status code should be 502 in dev mode", Status.BAD_GATEWAY.getStatusCode(), e.getStatusCode());
		}
	}

	/**
	 * Note: This test should be executed after {@link #testObtainingPaymentToken()} test
	 * Currently it seems they are in correct order (at least most of the times!),
	 * so be careful while renaming these two test methods.
	 */
	@Test
	public void testVerifingPaymentToken() {
		JZarinpalClient client = JZarinpalClientImpl.newClient();
		PaymentVerificationDto dto = new PaymentVerificationDto(amount, authorityToken);
		try {
			Long refId = client.paymentVerification(dto);
			assertTrue("RefId should be still zero", new Long(0l).equals(refId));
		} catch (UnexpectedStatusCodeException e) {
			if (e.getStatusCode() == Status.NOT_FOUND.getStatusCode()) {
				// It happens also production mode
			} else {
				assertTrue("We should see exception in development mode", BuildProps.isDevServer);
				assertEquals("Status code shold be 400 is dev mode", Status.BAD_REQUEST.getStatusCode(), e.getStatusCode());
			}
		}
	}

}