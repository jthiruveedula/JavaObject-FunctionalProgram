
public class MyPrimeRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(30);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime:" + isPrime);

		int sum = number.sumUptoN();
		System.out.println("sumUptoN:" + sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("SumofDivisors is : " + sumOfDivisors);

		number.printANumberTriangle();


	}

}

