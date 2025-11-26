package Practice;

import java.util.Arrays;
import java.util.List;

public class ListToArrayArrayToList {

	public static void main(String[] args) {
		
		
		// List to Array String
		List<String> list = Arrays.asList("Pune","Mumbai","Delhi","banglore");
		String[] array = list.toArray(new String[0]); 
		
		// Array to List String
		String[] stringArray = {"Pune","Mumbai","Delhi","banglore"};
		List<String> list2 = Arrays.asList(stringArray);
		
		// List to Array integer
		List<Integer> intList = Arrays.asList(1,2,3,4);
		Object[] intArray = intList.toArray();
		
		// Array to List Integer
		int[] intArray1 = {1,2,3,4};
		List<int[]> listArray = Arrays.asList(intArray1);
		
		
	}
}
