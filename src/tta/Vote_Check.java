package tta;

import java.util.Scanner;

// 
public class Vote_Check {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = scan.nextInt();
		
		if(age >= 18) {
			System.out.println("Eligible for Vote");
		}else {
			System.out.println("Not eligible for vote");
		}
		
		
		
	}
}
