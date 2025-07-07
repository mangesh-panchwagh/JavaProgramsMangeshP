package tta.june25thTask;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check palindrome : ");
		int num = scan.nextInt();
		int initialNumber = num;
		int revNumber = 0;
		
		
		while(num != 0) {
			int digit = num%10;
			revNumber = revNumber * 10 + digit;
			num = num / 10;
		}
		
		System.out.println("reverse number is : " + revNumber);
		
		if(initialNumber == revNumber) {
			System.out.println("Entered number is palindrome");
		}else {
			System.out.println("Entered number is not palindrome");
		}
	}
}
