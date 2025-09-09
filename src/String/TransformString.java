package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TransformString {

	public static void main(String[] args) {
		
		System.out.println("Enter the stirng : ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();			// a12c56a1b5
		// Step 1: Split into groups (letter+number)
		
		String[] parts = input.split("(?=[a-zA-Z])");
		
		// Step 2 : Use Linked hash map to keep unique letters with latest values
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i<parts.length;i++) {
			char letter = parts[i].charAt(0);
			int number = Integer.parseInt(parts[i].substring(1));
			
			if(i == 0) {
				// Increment only the first group
				number ++;
			}
			
			// Always overwrite (latest value for duplicate letters)
			map.put(letter, number);
			
		}
		
		 // Step 3: Sort keys alphabetically
		List<Character> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);
		
		// Step 4 : Build result
		StringBuilder result = new StringBuilder();
		for (char key : keys) {
			result.append(key).append(map.get(key));
		}
		
		// Step 5: Print output
        System.out.println("Output: " + result.toString());
		
	}
}
