package tta.june25thTask;

import java.util.Scanner;

public class BonusSalary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter years of experience : ");
		double experienceYears = scan.nextDouble();

		System.out.println("Enter your of Salary : ");
		double salary = scan.nextDouble();

		if (experienceYears < 1) {

			System.out.println("You are not eligible for bonus.");

		} else if (experienceYears >= 1 && experienceYears < 4) {

			System.out.println("Congratulations...You will get bonus as 5% of salary: ");
			System.out.println("Bonus Received : " + (salary * 0.05));

		} else if (experienceYears >= 4 && experienceYears < 6) {

			System.out.println("Congratulations...You will get bonus as 10% of salary: ");
			System.out.println("Bonus Received : " + (salary * 0.10));

		} else if (experienceYears >= 6) {

			System.out.println("Congratulations...You will get bonus as 15% of salary: ");
			System.out.println("Bonus Received : " + (salary * 0.15));
		}
	}
}
