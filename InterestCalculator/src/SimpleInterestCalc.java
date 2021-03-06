import java.math.BigDecimal;

public class SimpleInterestCalc {

	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCalc(String principal, String interest) {

		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));

	}

	public BigDecimal calculateTotalValue(int numOfYears) {
		BigDecimal totalValue = principal.multiply(interest).multiply(new BigDecimal(numOfYears));
		return totalValue;

	}

}
