package Practice;

import java.util.Arrays;
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
		
		String[] stringArray = s.split("\\s+");
		List<String> list2 = Arrays.asList(stringArray);
		Set<String> set2 = new LinkedHashSet<String>(list2);
		System.out.println(set2);
	}
}
