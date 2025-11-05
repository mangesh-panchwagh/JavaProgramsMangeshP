package HundredJavaPrograms;

import java.util.Scanner;
// Print Reverse number in java program
public class J20_ReverseNumber {

	public static void main(String[] args) {
		
		int n, reverseNumber = 0;
		System.out.println("Enter the number to reverse : ");
		Scanner scan = new Scanner(System.in);
		n=  scan.nextInt();
		
		while(n!=0) {
			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + n%10;
			n = n / 10;
		}
		
		System.out.println("Reverse of entered number : " + reverseNumber);
	}
}
