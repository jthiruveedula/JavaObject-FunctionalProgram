
import java.util.Scanner;

public class UserIneraction {

	public static void main(String[] args) {

		nestedIfElseWithSwitch(40, 5, 30);
	}

	public static void Scanner() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter input ");
		int number1 = scanner.nextInt();
		System.out.println(number1 + " Selected by user");
	}

	public static void Choice() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to MyCalc :)");
		System.out.println("Choose Your Inputs");

		System.out.println("Enter Number1:");
		int number1 = scanner.nextInt();
		System.out.println("Enter Number1:");
		int number2 = scanner.nextInt();

		System.out.println("" + "Select you Choice from Below Menu\n" + "1--> Addition\n" + "2--> Subtraaction\n"
				+ "3--> Multiplication\n" + "4--> Division");
		int choice = scanner.nextInt();



	}

	private static void nestedIfElseWithSwitch(int number1, int number2, int choice) {

		switch (choice) {
		case 1:
			System.out.printf("Addition of %d + %d = %d", number1, number2, number2 + number1).println();
			break;
		case 2:
			System.out.printf("Subtraaction of %d - %d = %d", number1, number2, number1 - number2).println();
			break;
		case 3:
			System.out.printf("Multiplication of %d * %d = %d", number1, number2, number1 * number2).println();
			break;
		case 4:
			System.out.printf("Division of %d // %d = %d", number1, number2, number1 / number2).println();
			break;

		default:
			System.out.println("Operation not Supported");
		}

	}
}
