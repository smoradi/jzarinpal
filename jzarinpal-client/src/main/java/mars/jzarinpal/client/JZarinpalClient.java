package mars.jzarinpal.client;

import mars.jzarinpal.client.impl.WrongStatusCodeException;
import mars.jzarinpal.domain.dto.PaymentRequestDto;

public interface JZarinpalClient {

	public String paymentRequest(PaymentRequestDto dto) throws WrongStatusCodeException;

}