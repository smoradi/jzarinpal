package mars.jzarinpal.server.resources;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.ws.Holder;

import com.zarinpal.PaymentGatewayImplementationService;
import com.zarinpal.PaymentGatewayImplementationServicePortType;

import mars.jzarinpal.domain.ZarinStatus;
import mars.jzarinpal.domain.build.BuildProps;
import mars.jzarinpal.domain.constants.Paths;
import mars.jzarinpal.domain.dto.PaymentRequestDto;

@Path(Paths.paymentrequest)
public class PaymentRequestResource {

	private final PaymentGatewayImplementationService serviceImpl = new PaymentGatewayImplementationService();
	private final PaymentGatewayImplementationServicePortType service = serviceImpl.getPaymentGatewayImplementationServicePort();

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public Response paymentRequest(@BeanParam PaymentRequestDto dto) {
		Holder<Integer> status = new Holder<Integer>();
		Holder<String> authority = new Holder<String>();
		service.paymentRequest(BuildProps.merchantID, dto.amount,
				dto.description, dto.email, dto.mobile, dto.getCallbackUrlOrDefault(),
				status, authority);
		return Response.status(ZarinStatus.fromCode(status.value).getStatus()).entity(authority.value).build();
	}

}