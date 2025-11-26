package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// Remove Duplicates while preserving order
// Q: You have a list: ["a", "b", "a", "c", "b"].
// Remove duplicates but keep order.
// Use LinkedHashSet
public class RemoveDuplicates {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("a","b","a","c","b");
		Set<String> set = new LinkedHashSet<>(list);
		System.out.println(set);
		
		System.out.println("Enter String for removing duplicates");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		StringBuffer result = new StringBuffer();
		Set<Character> set2 = new HashSet<>();
		
		for(char c : s.toCharArray()) {
			if(!set2.contains(c)) {
				set2.add(c);
				result.append(c);
			}
		}
		System.out.println("String after removing duplicates: " + result.toString());
		
		
	}
}
