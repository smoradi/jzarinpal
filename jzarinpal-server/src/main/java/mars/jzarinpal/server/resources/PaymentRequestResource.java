package mars.jzarinpal.server.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.ws.Holder;

import mars.jzarinpal.server.BuildProps;
import mars.jzarinpal.server.dto.StatusZarin;

import com.zarinpal.PaymentGatewayImplementationService;
import com.zarinpal.PaymentGatewayImplementationServicePortType;

@Path("/paymentrequest")
public class PaymentRequestResource {

	private final PaymentGatewayImplementationService serviceImpl = new PaymentGatewayImplementationService();
	private final PaymentGatewayImplementationServicePortType service = serviceImpl.getPaymentGatewayImplementationServicePort();

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response paymentRequest(@FormParam("amount") Integer amount,
			@FormParam("description") String description,
			@FormParam("email") String email,
			@FormParam("mobile") String mobile,
			@FormParam("callbackURL") String callbackURL) {
		Holder<Integer> status = new Holder<Integer>();
		Holder<String> authority = new Holder<String>();
		service.paymentRequest(BuildProps.merchantID, amount,
				description, email, mobile, callbackURL,
				status, authority);
		return Response.status(StatusZarin.fromCode(status.value).getStatus()).entity(authority.value).build();
	}

}