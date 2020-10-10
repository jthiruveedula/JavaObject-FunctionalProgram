package functionalprogramming;

import java.util.List;

public class SumOfOddNumbers {
	public static void main(String[] args) {


		List<Integer> list = List.of(1, 2, 3, 2, 5, 3, 5, 6, 7, 8, 32, 45);
		int sum = 0;
		sum = sumOfOddNumbers(list, sum);
		// System.out.println("Sum of Odd Numbers:-" + sum);
		
		// this statement is filtering data for odd numbers
		list.stream().filter(ele->ele%2!=0).forEach(
				ele -> System.out.println("Odd Numbers in List:-" + ele)
				
		);

		int sumFunc = fpFilterSum(list);

		System.out.println("Sum off OddNumbers from Functional:-" + sumFunc);

		// this would print square of each distinct number
		list.stream().distinct().map(e -> e * e).forEach(e -> System.out.println("Distinct Squared Value:- " + e));
		// this would print distinct sorted order of list
		list.stream().distinct().sorted().forEach(e -> System.out.println("Distinct Sorted " + e));

	}

	// This method would let us create filtered sum of odd numbers using functional
	// approach

	private static int fpFilterSum(List<Integer> list) {
		int sumFunc = list.stream().filter(ele -> ele % 2 != 0).reduce(0, (num1, num2) -> num1 + num2);

		return sumFunc;
	}

	// This method would give sum of odd numbers using normal approach
	private static int sumOfOddNumbers(List<Integer> list, int sum) {
		for (int i : list) {
			if (i % 2 != 0) {
			sum += i;
			}
		}
		return sum;
	}

}
