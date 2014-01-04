package mars.jzarinpal.domain.dto;

import javax.ws.rs.PathParam;

import mars.jzarinpal.domain.constants.Constants;

public class PaymentVerificationDto {

	@PathParam(Constants.amount)
	public int amount;

	@PathParam(Constants.authority)
	public String authority;

	public PaymentVerificationDto() {
	}

	public PaymentVerificationDto(int amount, String authority) {
		this.amount = amount;
		this.authority = authority;
	}

	// -- getters
	public int getAmount() { return amount;	}
	public String getAuthority() { return authority; }

	// --setters
	public void setAmount(int amount) { this.amount = amount; }
	public void setAuthority(String authority) { this.authority = authority; }

}