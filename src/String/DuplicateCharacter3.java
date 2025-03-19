package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Count Dupicate Characters using Map Interface
public class DuplicateCharacter3 {

	public static void main(String[] args) {

		System.out.println("Enter String to find duplicates : ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		// Call the method to find duplicate characters
		findDuplicates(input);
	}

	public static void findDuplicates(String input) {

		// Create a HashMap to store the frequency of each character
		Map<Character, Integer> charCountMap = new HashMap<>();

		// convert input string to charArray
		char[] charArray = input.toCharArray();

		// Iterate over charArray and count the occurrences of each character
		for (int i = 0; i < charArray.length; i++) {

			charCountMap.put(charArray[i], charCountMap.getOrDefault(charArray[i], 0) + 1);
		}

		// Print out duplicate characters
		System.out.println("Duplicate characters in the String: ");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}

	}

}
