package exceptionHandling;

import java.util.Scanner;

public class TryWithResourcesRunner {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int[] i = { 1, 3, 5, 2 };
			int num = i[5];
			System.out.println("");
		}


	}

	}



