
public class PlayWithChars {

	public static void main(String[] args) {

		MyChar myChar = new MyChar('k');
		System.out.println(myChar.isVowel()); // 'a','e','i','o' and 'u' in both cases
		System.out.println(myChar.isConsonant()); // except vowels
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		MyChar.printLoweCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
