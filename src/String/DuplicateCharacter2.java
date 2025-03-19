package String;

import java.util.Arrays;
import java.util.Scanner;

// Count the duplicate characters
public class DuplicateCharacter2 {

	public static void main(String[] args) {
		System.out.println("Enter string to check for Duplicate Characters : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		printDuplicates(s);
	}

	public static void printDuplicates(String str) {

		int strlen = str.length();

		// sorting the string
		char[] charArray = str.toCharArray();
		
		//char[] charArray = str.toLowerCase().toCharArray();

		// Loop through the sorted string to find duplicates
		for (int i = 0; i < strlen; i++) {
			int count = 1;

			for (int j = i + 1; j < strlen; j++) {
				
				if(charArray [i] == charArray[j] && charArray[i]!=' ') {
					count ++;
					charArray[j] = '0';
				}
			}
			
			if (count > 1 && charArray[i] !='0') {
				System.out.println(charArray[i] + " : " + count);
			}	

		}
	}
}
