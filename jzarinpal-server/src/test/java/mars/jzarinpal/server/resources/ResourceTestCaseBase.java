package mars.jzarinpal.server.resources;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import mars.jzarinpal.server.BuildProps;
import mars.jzarinpal.server.Main;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class ResourceTestCaseBase {

	private static HttpServer server;
	protected static WebTarget target;

	@BeforeClass
	public static void setUp() {
		// start the server
		server = Main.startServer();

		// create the client
		Client client = ClientBuilder.newClient();
		target = client.target(BuildProps.serviceBaseUri);
	}

	@AfterClass
	public static void tearDown() {
		server.stop();
	}

	/**
	 * Simple wrapper for {@link String#format(String, Object...)}
	 * @param format
	 * @param args
	 * @return	A formatted string
	 */
	public String f(String format, Object... args) {
		return String.format(format, args);
	}

}