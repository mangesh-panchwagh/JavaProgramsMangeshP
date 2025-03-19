package String;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {

		System.out.println("Enter Statement for counting the words : ");
		Scanner scan = new Scanner(System.in);
		String stmt = scan.nextLine();

		countWords(stmt);
	}

	public static void countWords(String stmt) {

		int count = 1;
		String trimmedString = stmt.trim();
		for (int i = 0; i < trimmedString.length(); i++) {

			if(trimmedString.charAt(i) == ' ')
				count++;
		}
		
		System.out.println("Word count in given string is : " + count);
	}
}
