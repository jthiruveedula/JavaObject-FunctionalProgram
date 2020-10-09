
public class MyChar {

	private char ch;

	public MyChar(char ch) {
		// TODO Auto-generated constructor stub

		this.ch = ch;
	}

	public boolean isVowel() {
		// TODO Auto-generated method stub
		if (Character.toLowerCase(ch) == 'a' || Character.toLowerCase(ch) == 'e' || Character.toLowerCase(ch) == 'i'
				|| Character.toLowerCase(ch) == 'o' || Character.toLowerCase(ch) == 'u')
			return true;
		return false;
	}

	public boolean isNumber() {
		if (ch >= 48 && ch <= 57)
			return true;
		return false;
	}

	public boolean isAlphabet() {
		if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 95))
			return true;
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel())
			return true;
		return false;
	}

	public static void printLoweCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++)
			System.out.print(ch);


	}

	public static void printUpperCaseAlphabets() {
		System.out.println(' ');
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);

	}

}
