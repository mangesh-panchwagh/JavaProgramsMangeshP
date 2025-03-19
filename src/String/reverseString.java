package String;

import java.util.Scanner;

// Write a program to reverse a given string.

public class reverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string for reversal : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String revString = "";
		System.out.println("Entered string is : " + s);
		
		System.out.print("Reverse String of given String is : ");
		//char ch[] = new char[s.length()];
		for(int i=s.length()-1;i>=0;i--) {
			 revString += s.charAt(i);
		}
		
		System.out.println(revString);
	}
}
