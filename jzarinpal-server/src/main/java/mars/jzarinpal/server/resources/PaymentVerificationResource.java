package mars.jzarinpal.server.resources;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
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
import mars.jzarinpal.domain.dto.PaymentVerificationDto;

@Path(Paths.paymentverification)
public class PaymentVerificationResource {

	private final PaymentGatewayImplementationService serviceImpl = new PaymentGatewayImplementationService();
	private final PaymentGatewayImplementationServicePortType service = serviceImpl.getPaymentGatewayImplementationServicePort();

	@GET
	@Path(Paths.$amount_$authority)
	@Produces(MediaType.TEXT_PLAIN)
	public Response paymentVerification(@BeanParam PaymentVerificationDto dto) {
		Holder<Integer> status = new Holder<Integer>();
		Holder<Long> refID = new Holder<Long>();
		service.paymentVerification(BuildProps.merchantID,
				dto.getAuthority(), dto.getAmount(), status, refID);
		return Response.status(ZarinStatus.fromCode(status.value).getStatus())
				.entity(refID.value).build();
	}

}