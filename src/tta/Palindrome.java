package tta;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		
		int strlength = s.length();
		String revString = "";
		for( int i = strlength-1; i>=0; i--) {
			revString += s.charAt(i);
		}
		if(s.equals(revString)) 
			System.out.println(s + " is a palindrome");
		else
			System.out.println(s + " is not a palindrome");
	}
}
