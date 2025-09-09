package String;

import java.util.Scanner;

public class CountWords3 {

	public static void main(String[] args) {
		System.out.println("Enter string for word count");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		
		String[] words = str.trim().split("\\s+");
		
		System.out.println("Number of words : " + words.length);

	}

}
