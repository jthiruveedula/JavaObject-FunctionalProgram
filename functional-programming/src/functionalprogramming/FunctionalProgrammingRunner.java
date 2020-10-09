package functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {
	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Ball", "Cat", "Dog");

		funcprint(list);
		printList(list);

	}

	private static void printList(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}

	}
public static void funcprint(List<String> list) {
	
	list.stream().forEach(
			ele -> System.out.println("Element:-" + ele)
			);
	
}

}
