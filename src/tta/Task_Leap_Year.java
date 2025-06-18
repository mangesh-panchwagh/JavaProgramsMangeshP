package tta;

import java.util.Scanner;
/*
#. Leap Year Checker : 
Create a program hat determines weather a given year is a leap year. 
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
Use an if-else statement to make this determination.
*/
public class Task_Leap_Year {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year to check Leap year : ");
		int year = scan.nextInt();
		
		if((year % 4 == 0 && year%100 !=0) || year % 400 == 0) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
	}
}
