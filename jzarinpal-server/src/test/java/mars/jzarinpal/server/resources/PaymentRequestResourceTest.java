package mars.jzarinpal.server.resources;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import mars.jzarinpal.server.BuildProps;

import org.junit.Test;

public class PaymentRequestResourceTest extends ResourceTestCaseBase {

	@Test
	public void testPaymentRequesstGet() {
		Form formData = new Form("amount", "1000")
				.param("description", "description")
				.param("callbackURL", BuildProps.serviceBaseUri + "/callbackTest");
		Entity<Form> entity = Entity.form(formData);
		Response response = target.path("/paymentrequest").request().post(entity);

		if (BuildProps.isProdServer) {
			assertEquals(Status.OK.getStatusCode(), response.getStatus());
			String authority = response.readEntity(String.class);
			assertTrue(authority.trim().length() > 0);
			System.out.println(f("###########Temporary log##### authority[%s]", authority));
		} else {
			assertEquals(Status.BAD_GATEWAY.getStatusCode(), response.getStatus());
			assertFalse(response.readEntity(String.class).trim().length() > 0);
		}
	}

}