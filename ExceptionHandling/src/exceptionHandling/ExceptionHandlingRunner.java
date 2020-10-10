package exceptionHandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {

		extracted1();
		System.out.println("Main Method Executed!");
	}

	private static void extracted1() {
		extracted();
		System.out.println("Extracted1 Method Executed!");
	}

	private static void extracted() {
		try {
//		String str = null;
//		str.length();
			int[] i = { 1, 2, 4 };
			int num = i[3];

	} catch (NullPointerException e) {
		System.out.println("NullPointException occured please pass some value");
		e.printStackTrace();
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException occured select value with in range");
		e.printStackTrace();
	}
	catch (Exception e) {
		System.out.println("Matched Exception");
		e.printStackTrace();
	}

	}
}
