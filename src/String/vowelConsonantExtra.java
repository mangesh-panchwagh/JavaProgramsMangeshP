package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class vowelConsonantExtra {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string for vowel and consonant : ");
		String str = scan.nextLine();
		
		int TotalvowelCount = 0;
		int TotalconsonantCount = 0;
		
		String vowelSet = "aeiou";
		
		Set<Character> uniqueVowels = new HashSet<>();
		Set<Character> uniqueConsonants = new HashSet<>();
		
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {
				if(vowelSet.indexOf(ch)!=-1) {
					TotalvowelCount ++;
					uniqueVowels.add(ch);
					
				}else {
					TotalconsonantCount++;
					uniqueConsonants.add(ch);
					
				}
			}
		}
		
		System.out.println("Total Vowel Count : " + TotalvowelCount);
		System.out.println("Unique vowels: " + uniqueVowels + " → Count: " + uniqueVowels.size());
		System.out.println("Total Consonant Count : " + TotalconsonantCount);
		System.out.println("Unique Consonant Count : " + uniqueConsonants + "Count :" + uniqueConsonants.size());
	}
}
