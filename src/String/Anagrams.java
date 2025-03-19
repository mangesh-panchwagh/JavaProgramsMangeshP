package String;

import java.util.Arrays;
import java.util.Scanner;

// Here we are sorting using Arrays.sort in-build method
public class Anagrams {

	public static void main(String[] args) {

		System.out.println("Enter String 1 for checking Angram : ");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();

		System.out.println("Enter String 2 for checking Angram : ");
		String s2 = scan.nextLine();
		
		if(anagramCheck(s1, s2))
			System.out.println(s1 + " and " + s2 +" are Anagrams");
		else
			System.out.println(s1 + " and " + s2 +" are not Anagrams");
	}

	public static boolean anagramCheck(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		// convert String to charArray
		char[] charArray1 = s1.toLowerCase().toCharArray();
		char[] charArray2 = s2.toLowerCase().toCharArray();
		
		// Sort char Array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		//System.out.println(Arrays.toString(charArray1));
		//System.out.println(Arrays.toString(charArray2));
		
		return Arrays.equals(charArray1,charArray2);
	}
}
