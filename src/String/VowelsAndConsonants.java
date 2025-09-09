package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
1. Total vowels & consonants (including duplicates)
2. Unique vowels & consonants (ignoring duplicates)
*/
public class VowelsAndConsonants {

	public static void main(String[] args) {
		
		System.out.println("Enter string for vowel and consonent count : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		str = str.toLowerCase();
		
		int totalVowels = 0;
		int totalConsonents = 0;
		
		Set<Character> uniqueVowels = new HashSet<>();
		Set<Character> uniqueConsonents = new HashSet<>();
		
		String vowels = "aeiou";
		
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch))	{	// consider only lettes
				
				if(vowels.indexOf(ch) != -1) {
					totalVowels ++;
					uniqueVowels.add(ch);
				}else {
					totalConsonents ++;
					uniqueConsonents.add(ch);
				}
			}
		}
		
		System.out.println("Total vowels: " + totalVowels);
        System.out.println("Unique vowels: " + uniqueVowels + " → Count: " + uniqueVowels.size());
        System.out.println("Total consonants: " + totalConsonents);
        System.out.println("Unique consonants: " + totalConsonents + " → Count: " + uniqueConsonents.size());
	}
}
