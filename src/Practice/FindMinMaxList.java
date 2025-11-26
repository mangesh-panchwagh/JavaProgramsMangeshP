package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMinMaxList {

	public static void main(String[] args) {

		
		List<Integer> list = Arrays.asList(10,20,5,7);
		
		int max = Collections.max(list);
		int min = Collections.min(list);
		
		System.out.println("Max : "+ max + ", Min : " + min);
	}
}
