package generics;

import java.util.List;

public class genericRunner {

	static <X> X doubleValue(X value) {
		return value;
	}



	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		MyCustomList<Integer> list2 = new MyCustomList<>();

		list.addEle("Hello World!");
		list.addEle("Hello Generic!");
		list.addEle("Hello Main!");

		list2.addEle(518);
		list2.addEle(45);
		list2.addEle(34);

		System.out.println(list);
		System.out.println(list2);
		
		System.out.println(doubleValue(List.of("e1", "e2", "e3", 235, "e5")));




	}


}
