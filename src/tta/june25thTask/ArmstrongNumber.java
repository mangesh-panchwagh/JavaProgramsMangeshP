package tta.june25thTask;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check ArmstrongNumber : ");
		int num = scan.nextInt();
		
		// separate digits
		int digitCount = 0;
		while(num!=0) {
			 num = num /10;
			digitCount ++;
		}
		System.out.println(digitCount);
		
		int temp = num;
		
	}
}
