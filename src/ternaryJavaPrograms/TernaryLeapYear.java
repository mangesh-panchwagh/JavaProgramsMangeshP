package ternaryJavaPrograms;

import java.util.Scanner;

public class TernaryLeapYear {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year to check Lea year : ");
		int year = scan.nextInt();
		
		String result = ((year % 4 == 0 && year != 100 ) || year % 400 == 0) 
				? "Leap Year" : "Not a Leap year";
		System.out.println(result);
	}
}
