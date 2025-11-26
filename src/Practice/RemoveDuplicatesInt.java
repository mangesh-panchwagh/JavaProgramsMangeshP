package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesInt {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,2,3);
	
		List<Integer> uniques = new ArrayList<>(new HashSet<>(list));
		System.out.println("Unique Elements : " + uniques);
	}
}
