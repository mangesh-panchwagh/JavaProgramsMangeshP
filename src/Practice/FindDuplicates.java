package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,3,2);
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		
		for(Integer n:list) {
			if(!set.add(n)) {
				duplicates.add(n);
			}
		}
		System.out.println("Duplicate Elements are : " + duplicates);
		// Remove Duplicates from List
		List<Integer> unique = new ArrayList<>(new HashSet<>(list));
		System.out.println("Unique Elements are : "+unique);
	}
}
