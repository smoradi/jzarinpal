package mars.jzarinpal.server;

import org.apache.commons.daemon.DaemonContext;
import org.apache.commons.daemon.DaemonInitException;
import org.glassfish.grizzly.http.server.HttpServer;

public class Daemon implements org.apache.commons.daemon.Daemon {

	private HttpServer server;

	public Daemon() {
		System.err.println("jZarinpalDaemon: instance " + this.hashCode() + " created");
	}

	@Override
	public void init(DaemonContext context) throws DaemonInitException,
			Exception {
		server = Main.startServer();
		System.err.println("jZarinpalDaemon: instance " + this.hashCode() + " initialized");
	}

	@Override
	public void start() throws Exception {
		System.err.println("jZarinpalDaemon: instance " + this.hashCode() + " started");
	}

	@Override
	public void stop() throws Exception {
		server.stop();
		System.err.println("jZarinpalDaemon: instance " + this.hashCode() + " stopped");
	}

	@Override
	public void destroy() {
		System.err.println("jZarinpalDaemon: instance " + this.hashCode() + " destroied");
	}

}