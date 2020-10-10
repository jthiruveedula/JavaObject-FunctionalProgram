package exceptionHandling;

import exceptionHandling.Amount.CurrenciesDontmatch;

class Amount {

	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws CurrenciesDontmatch {
		if(!this.currency.equals(that.currency)) {
			throw new CurrenciesDontmatch("Currencies don't matched for " + this.currency + " & " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}

	// Checked exception
	class CurrenciesDontmatch extends Exception {
		public CurrenciesDontmatch(String msg) {
			super(msg);
		}

	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

public class ExceptionThrowing {
	public static void main(String[] args) throws CurrenciesDontmatch {

		Amount amount1 = new Amount("USD", 100);
		Amount amount2 = new Amount("EUR", 100);
		amount1.add(amount2);

		System.out.println(amount1);

	}

}
