package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Write a program to count how many vowels and consonants are present in the given string.
//Here Duplicates vowels are also counted. Ex if 'a' occured twice, it should count it
//only once

public class vowelsConsonantsUniqueCount {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to check vowel and consonents : ");
		String str = scan.nextLine();
		
		str = str.toLowerCase();
		
		Set<Character> vowels = new HashSet<>();
		Set<Character> consonents = new HashSet<>();
		
		// Define vowels set
		
		String vowelSet = "aeiou";
		
		// Loop through each character
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {	// only letters
				if(vowelSet.indexOf(ch)!= -1) {
					vowels.add(ch);
				}else {
					consonents.add(ch);
				}
				
			}
		}
		
		System.out.println("Unique vowels : " + vowels + " count :" + vowels.size());
		System.out.println("Unique consonents : " + consonents + " count :" + consonents.size());
	}
}
