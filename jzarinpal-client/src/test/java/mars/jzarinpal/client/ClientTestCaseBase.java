package mars.jzarinpal.client;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import mars.jzarinpal.server.Main;

public abstract class ClientTestCaseBase {

	private static HttpServer server;

	@BeforeClass
	public static void setUp() {
		server = Main.startServer();
	}

	@AfterClass
	public static void tearDown() {
		server.stop();
	}

}