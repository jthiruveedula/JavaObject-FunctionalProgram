package enums;

import java.util.Arrays;


public class EnumRunner {
	public static void main(String[] args) {

//	Season season =Season.FALL;

		System.out.println(Season.valueOf("WINTER"));
		System.out.println(Season.SUMMER.ordinal());
		System.out.println(Arrays.toString(Season.values()));
		System.out.println(Season.SUMMER.getValue());

	}

}
