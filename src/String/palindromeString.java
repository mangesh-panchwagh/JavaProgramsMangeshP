package String;

import java.util.Scanner;

// Write a program to check whether a given string is a palindrome (reads the same forwards and backwards).
public class palindromeString {

	public static void main(String[] args) {

		System.out.println("Enter string to check for palindrome: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		String reverseString = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverseString += s.charAt(i);
		}

		System.out.println("Reverse String is : " + reverseString);
		if (s.equals(reverseString))
			System.out.println("Entered String " + s + " is palindrome");
		else
			System.out.println("Entered String " + s + " is not a palindrome");
			
		
	}

}
