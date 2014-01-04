package mars.jzarinpal.server.resources;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import mars.jzarinpal.domain.build.BuildProps;
import mars.jzarinpal.domain.constants.Constants;
import mars.jzarinpal.domain.constants.Paths;

import org.junit.Test;

public class PaymentResourceIntegrationTest extends ResourceTestCaseBase {

	private final String amount = "1000";
	public static String authorityToken = "is-not-set-yet";

	@Test
	public void testObtaingPaymentToken() {
		Form formData = new Form(Constants.amount, amount)
				.param(Constants.description, "description")
				.param(Constants.callbackURL, BuildProps.defaultCallbackUri);
		Entity<Form> entity = Entity.form(formData);
		Response response = target.path(Paths.paymentrequest).request().post(entity);

		if (BuildProps.isProdServer) {
			assertEquals(Status.CREATED.getStatusCode(), response.getStatus());
			String authority = response.readEntity(String.class);
			assertFalse("Authority token should not be empty", authority.trim().isEmpty());
			authorityToken = authority;
		} else {
			assertEquals(Status.BAD_GATEWAY.getStatusCode(), response.getStatus());
			assertTrue("Autority token should be empty", response.readEntity(String.class).trim().isEmpty());
			authorityToken = "is-set-but-we-are-in-development-mode";
		}
	}

	/**
	 * Note: This test should be executed after {@link #testObtaingPaymentToken()} test
	 * Currently it seems they are in correct order,
	 * so be careful while renaming these two test methods.
	 */
	@Test
	public void testVerifyingPaymentToken() {
		String dynamicPath = "/" + amount + "/" + authorityToken;
		System.out.println(f("##############Temporary log######### dPath[%s]", dynamicPath));
		Response response = target.path(Paths.paymentverification + dynamicPath).request().get(Response.class);

		if (BuildProps.isProdServer) {
			assertEquals(Status.NOT_FOUND.getStatusCode(), response.getStatus());
			Long refId = response.readEntity(Long.class);
			System.out.println(f("##############Temporary log######### refId[%s]", refId));
			assertTrue("RefId should be still zero", new Long(0).equals(refId));
		} else {
			assertEquals(Status.BAD_REQUEST.getStatusCode(), response.getStatus());
			assertEquals("RefId should be zero", new Long(0), response.readEntity(Long.class));
		}

	}

}