package Practice;

import java.util.Scanner;

public class secondHighestno {

	public static void main(String[] args) {
		
		int[] numbers = {12,34,10,1,100,3,4,32};
		
		for(int i = 0;i<numbers.length; i++) {
			for(int j=i+1;j<numbers.length;j++) {
				int temp = 0;
				if(numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		System.out.println(numbers[numbers.length-2]);
	}
}
