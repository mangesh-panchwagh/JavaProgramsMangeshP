package String;

import java.util.Arrays;
import java.util.Scanner;

//Here we are sorting using bubble sort in-build method
public class Anagrams2 {

	public static void main(String[] args) {

		System.out.println("Enter String 1 for checking Angram : ");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();

		System.out.println("Enter String 1 for checking Angram : ");
		String s2 = scan.nextLine();

		if (anagramCheck(s1, s2))
			System.out.println(s1 + " and " + s2 + " are Anagrams");
		else
			System.out.println(s1 + " and " + s2 + " are not Anagrams");
	}

	private static boolean anagramCheck(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		// convert String to charArray
		char[] charArray1 = s1.toLowerCase().toCharArray();
		char[] charArray2 = s2.toLowerCase().toCharArray();

		// Sort the array 1
		for (int i = 0; i < charArray1.length - 1; i++) {

			for (int j = 0; j < charArray1.length - 1; j++) {
				if (charArray1[j] > charArray1[j + 1]) {
					// swap characters
					char temp = charArray1[j];
					charArray1[j] = charArray1[j + 1];
					charArray1[j + 1] = temp;
				}

			}
		}

		// Sort the array 2
		for (int i = 0; i < charArray2.length - 1; i++) {

			for (int j = 0; j < charArray2.length - 1; j++) {
				if (charArray2[j] > charArray2[j + 1]) {
					// swap characters
					char temp = charArray2[j];
					charArray2[j] = charArray2[j + 1];
					charArray2[j + 1] = temp;
				}

			}
		}
		
		return Arrays.equals(charArray1, charArray2);
	}
}
