package tta;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		

	
	}
}
