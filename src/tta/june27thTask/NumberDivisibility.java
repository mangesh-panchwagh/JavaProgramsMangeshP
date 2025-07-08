package tta.june27thTask;

import java.util.Scanner;

public class NumberDivisibility {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		if(num % 5 == 0 && num % 11 == 0) {
			System.out.println(num + " is divisible by 5 and 11");
		}else if(num % 5 == 0 && num % 11 != 0){
			System.out.println(num + " is divisible by 5 and not by 11");
		}else if (num % 5 != 0 && num % 11 == 0) {
			System.out.println(num + " is not divisible by 5 and divisible by 11");
		}else if(num % 5 != 0 && num % 11 != 0) {
			System.out.println(num + " is not divisible by 5 and not divisible by 11");
		}else {
			System.out.println("Invalid Number");
		}
	}
}
