package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Convert number array into the map key as number and its digit sum as value 
public class EPAM {

	public static void main(String[] args) {
		
		int[] numbers = {123,456,879,963};
		
		
		for(int i = 0; i<numbers.length; i++) {
			int temp;
			for(int j = i+1; j< numbers.length; j++) {
				
				if(numbers[i] > numbers[j]) {
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		
		// Print array
		for(int i = 0; i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		Map<Integer, Integer> nuberSumMap = new LinkedHashMap<>();
		for(int num : numbers) {
			nuberSumMap.put(num,getDigitSum(num));
		}
		
		 // Print the map
		for(Map.Entry<Integer, Integer> entry : nuberSumMap.entrySet()) {
			System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}");
		}
	}
	
	 // Method to calculate the sum of digits of a number
	private static int getDigitSum(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		
		return sum;
	}
	
}
