package tta.june27thTask;

import java.util.Scanner;

// 1 year - 365 days, 1 month - 30 days. Convert days into years months and days
// 1000 days - 2 years 9 Months
public class DaysConversion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of days : ");
		int num = scan.nextInt();
		
		int noOfYears = num / 365;
		int days_remaining = (num % 365);
		int noOfMonths =  days_remaining / 30;
		int noOfDays = days_remaining % 30;

		System.out.println("Number of years : " + noOfYears);
		System.out.println("Number of Months : " + noOfMonths);
		System.out.println("Number of Days : " + noOfDays);
		System.out.println(num + " has " + noOfYears + " years " + noOfMonths+" months and " + noOfDays+ " days");
	}
}
