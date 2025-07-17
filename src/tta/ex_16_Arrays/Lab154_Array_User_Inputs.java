package tta.ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the array(int) only ");
		int size = scan.nextInt();
		
		int[] numbers_marks = new int[size];
		
//		float[] number_marks = new float[size];
//		String[] numbers_marks1 = new String[size];
		
		for(int i = 0; i<numbers_marks.length; i++) {
			System.out.println("Enter numbers");
			numbers_marks[i] = scan.nextInt();
		}

		System.out.println(" ---- Below Code is printing the elements! ");
		 
		for(int i = 0; i<numbers_marks.length;i++) {
			System.out.println(numbers_marks[i]);
		}
		
	}
}
