package tta;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = scan.nextInt();
		
		System.out.println("Enter number 2");
		int num2 = scan.nextInt();
		
		if( num1 > num2) {
			System.out.println(num1 + " is maximum number");
		}else {
			System.out.println(num2 + " is maximum number");
		}
	}
}
