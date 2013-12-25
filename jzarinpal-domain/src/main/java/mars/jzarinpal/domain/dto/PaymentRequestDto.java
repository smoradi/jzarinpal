package mars.jzarinpal.domain.dto;

import javax.ws.rs.FormParam;

import mars.jzarinpal.domain.build.BuildProps;
import mars.jzarinpal.domain.constants.CS;

public class PaymentRequestDto {

	@FormParam(CS.amount)
	public int amount;
	@FormParam(CS.description)
	public String description;
	@FormParam(CS.callbackURL)
	public String callbackURL;
	@FormParam(CS.email)
	public String email;
	@FormParam(CS.mobile)
	public String mobile;

	public PaymentRequestDto() {
	}

	public PaymentRequestDto(int amount, String description) {
		this.amount = amount;
		this.description = description;
		this.callbackURL = BuildProps.defaultCallbackUri;
	}

	public String getCallbackUrlOrDefault() {
		if (callbackURL == null || callbackURL.trim().isEmpty())
			return BuildProps.defaultCallbackUri;
		return callbackURL;
	}

	// -- getters
	public int getAmount() { return amount; }
	public String getDescription() { return description; }
	public String getCallbackURL() { return callbackURL; }
	public String getEmail() { return email; }
	public String getMobile() {	return mobile; }

	// -- setters
	public void setAmount(int amount) { this.amount = amount; }
	public void setDescription(String description) { this.description = description; }
	public void setCallbackURL(String callbackURL) { this.callbackURL = callbackURL; }
	public void setEmail(String email) { this.email = email; }
	public void setMobile(String mobile) { this.mobile = mobile; }

}