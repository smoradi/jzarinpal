package mars.jzarinpal.domain.constants;

public class Paths {

	public static final String paymentrequest = "/paymentrequest";
	public static final String paymentverification = "/paymentverification";
	public static final String $amount_$authority = "/{" + Constants.amount + "}/{" + Constants.authority + "}";
	public static final String paymentverification_$amount_$authority = paymentverification + $amount_$authority;

}