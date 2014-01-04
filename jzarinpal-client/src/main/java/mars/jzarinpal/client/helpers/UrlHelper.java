package mars.jzarinpal.client.helpers;

import mars.jzarinpal.domain.build.BuildProps;

public class UrlHelper {

	public static String zarinpalStartPayUrl(String authorityToken) {
		return String.format("%s/%s", BuildProps.zarinpalStartPayUri, authorityToken);
	}

}