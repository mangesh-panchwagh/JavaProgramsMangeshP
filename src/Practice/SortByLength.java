package Practice;

import java.util.Arrays;
import java.util.List;

public class SortByLength {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("apple","kiwi","banana");
		list.sort((a, b) -> a.length() - b.length());

		System.out.println(list);
	}
}
