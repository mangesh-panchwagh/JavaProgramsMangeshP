package Practice;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapSumOfDigits {

	public static void main(String[] args) {
		
		int[] array = {123,456,789};
		
		
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int num: array) {
			int sum = 0, temp = num;
			while(temp>0) {
				sum += temp %10;
				temp = temp / 10;
			}
			map.put(num, sum);
		}
		
		System.out.println(map);
	}
}
