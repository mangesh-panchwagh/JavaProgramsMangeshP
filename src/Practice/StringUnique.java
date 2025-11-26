package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class StringUnique {

	public static void main(String[] args) {
		
		
		
		List<String> list = Arrays.asList("a","b","c","a");
		Set<String> set = new HashSet<>(list);
		
		if(set.size() == list.size())
			System.out.println("All Strings are unique");
		else
			System.out.println("Not unique");
	}
}
