package mars.jzarinpal.client.impl;

import javax.ws.rs.client.WebTarget;

public abstract class ClientBase {

	protected final WebTarget webTarget;

	public ClientBase(WebTarget webTarget) {
		this.webTarget = webTarget;
	}

}