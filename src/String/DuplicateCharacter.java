package String;

import java.util.Scanner;


// Print Duplicate Characters

public class DuplicateCharacter {

	public static void main(String[] args) {

		System.out.println("Enter string to check for Duplicate Characters : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		char[] charArray = s.toCharArray();
		char dupChar[] = new char[s.length()];

		for (int i = 0; i < charArray.length; i++) {

			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					System.out.print(charArray[i] + " ");
					dupChar[i] = charArray[i];
				}
				
			}
		}
	}

}
