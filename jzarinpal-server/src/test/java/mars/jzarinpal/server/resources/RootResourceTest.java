package mars.jzarinpal.server.resources;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RootResourceTest extends ResourceTestCaseBase {

	@Test
	public void testWelcomeIndex() {
		String responseMsg = target.request().get(String.class);
		assertTrue(responseMsg.contains("Welcome to jZarinpal!"));
	}

}