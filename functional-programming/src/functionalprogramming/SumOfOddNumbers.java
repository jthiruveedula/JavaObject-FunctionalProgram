package functionalprogramming;

import java.util.List;

public class SumOfOddNumbers {
	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 5, 6, 7, 8, 32, 45);
		int sum = 0;
		sum = sumOfOddNumbers(list, sum);
		// System.out.println("Sum of Odd Numbers:-" + sum);
		
		list.stream().filter(ele->ele%2!=0).forEach(
				ele -> System.out.println("Odd Numbers in List:-" + ele)
				
		);

		int sumFunc = list.stream().filter(ele -> ele % 2 != 0).reduce(0, (num1, num2) -> {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			return num1 + num2;

		});

		System.out.println("Sum off OddNumbers from Functional:-" + sumFunc);

	}

	private static int sumOfOddNumbers(List<Integer> list, int sum) {
		for (int i : list) {
			if (i % 2 != 0) {
			sum += i;
			}
		}
		return sum;
	}

}
