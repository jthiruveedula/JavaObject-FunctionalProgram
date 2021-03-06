package functionalprogramming;

import java.util.List;

public class MethodRefeRunner {
	public static void main(String[] args) {
		
//		List.of("Apple", "Ball", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
//				.forEach(s -> System.out.println(s));

		// Making above code more readable

//		List.of("Apple", "Ball", "Cat", "Dog", "Elephant").stream().map(String::length).forEach(System.out::println);

		Integer max = List.of(23, 31, 745, 43, 91).stream().filter(MethodRefeRunner::isEven).max(Integer::compare)
				.orElse(0);

		System.out.println(max);

	}

	public static boolean isEven(Integer i) {
		return i % 2 == 0;
	}

}


