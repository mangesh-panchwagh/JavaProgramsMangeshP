package String;

import java.util.HashSet;
import java.util.Scanner;

public class firstRepeatedChar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		
		char result = findFirstRepeatedCharacter(str.trim());
		
		if(result != 0) {
			System.out.println("The first repeated character is : " + result);
		}else {
			System.out.println("No repeated character found");
		}
	}
	
	public static char findFirstRepeatedCharacter(String str) {
		
		// use hashset to track characters that have been seen
		HashSet<Character> seenCharacters = new HashSet<>();
		
		// Loop through string
		for(char ch: str.toCharArray()) {
			if(seenCharacters.contains(ch)) {
				return ch;
			}else {
				seenCharacters.add(ch);
			}
		}
		// if no repeated characters are found, return 0(null character) 
		return 0;
	}
}
