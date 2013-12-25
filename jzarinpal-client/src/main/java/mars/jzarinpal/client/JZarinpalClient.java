package mars.jzarinpal.client;

import mars.jzarinpal.client.impl.UnexpectedStatusCodeException;
import mars.jzarinpal.domain.dto.PaymentRequestDto;
import mars.jzarinpal.domain.dto.PaymentVerificationDto;

public interface JZarinpalClient {

	public String paymentRequest(PaymentRequestDto dto) throws UnexpectedStatusCodeException;

	public Long paymentVerification(PaymentVerificationDto dto) throws UnexpectedStatusCodeException;

}