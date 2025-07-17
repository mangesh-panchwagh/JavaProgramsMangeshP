package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {

	public static void main(String[] args) {
		
		// Find Second Largest Number in an Array
		int[] array = {12, 34, 10, 1, 100, 3, 4, 32};
		
		Arrays.sort(array);
		
		System.out.println("Second hghest number first way : " + array[array.length-2]);
		//System.out.println(array[array.length-3]);
		// You find it without using the sort function.
		
		int secondHighest = findSecondHighest(array);
		System.out.println("Second hghest number second way : " + secondHighest);
	}
	
	static int findSecondHighest(int[] array) {
		
		for(int i = 0;i<array.length;i++) {
			for(int j = i+1;j<array.length; j++) {
				int temp;
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int number = array[array.length-2];
		return number;
		
	}
}
