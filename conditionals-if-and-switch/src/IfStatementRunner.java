
public class IfStatementRunner {

	public static void main(String[] args) {
		puzzel2();

	}

	public static void puzzel1() {
		int i = 45;
		if (i == 45) {
			System.out.println("i = 45");
		} else if (i == 24) {
			System.out.println("i = 24");
		} else if (i == 30) {
			System.out.println("i = 30");
		} else {
			System.out.println("i is nothing");
		}
	}

	public static void puzzel2() {
		int number = 5;
		if (number < 0) {
			number = number + 10;
		}
		number++;
		System.out.println(number);
	}

}
