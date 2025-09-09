package String;

import java.util.Scanner;

public class VowelsAndConsonantsCount2 {

	public static void main(String[] args) {
		
		System.out.println("Enter string for vowel and consonents");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		str = str.toLowerCase();
		
		int vowelCount = 0;
		int consonantCount = 0;
		
		String vowelSet = "aeiou";
		
		for(char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) {
				if(vowelSet.indexOf(ch)!= -1) {
					vowelCount ++;
				}else {
					consonantCount ++;
				}
			}
		}
		
		// Print result
        System.out.println("Total vowels: " + vowelCount);
        System.out.println("Total consonants: " + consonantCount);
	}
}
