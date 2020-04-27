package pigLatin;

import java.util.Scanner;

public class PigLatinCapstone {
	private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner anotherscnr = new Scanner(System.in);

		do {
			System.out.println();
			
			System.out.println("Welcome to the Pig Latin Translator");
			System.out.print("Enter a word to be translated: ");

			String initLine = anotherscnr.next();

			isFirstLetterVowel(initLine);

		} while (goAgain());
		
		anotherscnr.close();
	}

	private static void isFirstLetterVowel(String initLine) {

		if (initLine.charAt(0) == 'a' || initLine.charAt(0) == 'e' || initLine.charAt(0) == 'i'
				|| initLine.charAt(0) == 'o' || initLine.charAt(0) == 'u' || initLine.charAt(0) == 'A' || initLine.charAt(0) == 'E' 
				|| initLine.charAt(0) == 'I'
				|| initLine.charAt(0) == 'O' || initLine.charAt(0) == 'U') {
			System.out.println(initLine + "way");
		}

		else {
			for (int i = 0; i < initLine.length(); i++) {
				if (initLine.charAt(i) != 'a' || initLine.charAt(i) != 'e' || initLine.charAt(i) != 'i'
						|| initLine.charAt(i) != 'o' || initLine.charAt(i) != 'u'|| initLine.charAt(0) != 'A' || initLine.charAt(0) != 'E' 
						|| initLine.charAt(0) != 'I'
						|| initLine.charAt(0) != 'O' || initLine.charAt(0) != 'U'){

					initLine = initLine.substring(i + 1) + initLine.charAt(i);

				} else {
					break;
				}
				break;
			}
		}

		System.out.println(initLine + "ay");
	}

	private static boolean goAgain() {

		System.out.println("Would you like to translate another word into Pig Latin? (y/n) : ");
		return scnr.next().toLowerCase().startsWith("y");
	}
	
	

}
