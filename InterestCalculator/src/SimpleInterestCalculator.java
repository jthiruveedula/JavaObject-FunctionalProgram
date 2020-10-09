import java.math.BigDecimal;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		SimpleInterestCalc calc = new SimpleInterestCalc("4500.00", "7.5");
		BigDecimal totalValue = calc.calculateTotalValue(5);
		System.out.println(totalValue);


	}

}
