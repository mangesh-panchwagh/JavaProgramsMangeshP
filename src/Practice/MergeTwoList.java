package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoList {

	public static void main(String[] args) {
		
		List<Integer> a = Arrays.asList(1,2,3);
		List<Integer> b = Arrays.asList(4,5,6);
		
		List<Integer> merged = new ArrayList<>(a);
		merged.addAll(b);
		
		System.out.println(merged);
		
		List<String> list1 = new LinkedList<>(Arrays.asList("a","b","c"));
		List<String> list2 = new LinkedList<>(Arrays.asList("p","q","r"));
		
		List<String> mergedString = new ArrayList<>(list1);
		mergedString.addAll(list2);
		System.out.println(mergedString);
		
		List<Character> char1 = new LinkedList<>(Arrays.asList('l','m','n'));
		List<Character> char2 = new LinkedList<>(Arrays.asList('x','y','z'));
		
		List<Character> mergedChar = new ArrayList<>(char1);
		mergedChar.addAll(char2);
		
		System.out.println(mergedChar);
	}
}
