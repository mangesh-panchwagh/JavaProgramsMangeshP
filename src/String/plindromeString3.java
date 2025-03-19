package String;

import java.util.Scanner;

public class plindromeString3 {

	public static void main(String[] args) {

		System.out.println("Enter String for palindrome check");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		char[] charArray = str.toCharArray();
		String revString = "";
		
		for (int i = charArray.length - 1; i >= 0; i--) {
			revString += charArray[i];
		}
		
		if(str.equals(revString))
			System.out.println("Entered String is palindrome.");
		else
			System.out.println("Entered String is not a palindrome.");
	}
}
