package tta.june25thTask;

import java.util.Scanner;

public class Loan_Eligibility3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = scan.nextInt();
		
		System.out.println("Enter your salary : ");
		double salary = scan.nextDouble();
		
		System.out.println("Enter your credit score : ");
		int creditScore = scan.nextInt();
		
		boolean isValidAge = ageValidator(age);
		boolean isValidSalary = salaryValidator(salary);
		boolean isValidCreditScore = creditScoreValidator(creditScore);
		
		if(!isValidAge) {
			System.out.println("Age is not valid. Must be between 18 and 80.");
		}
		
		if(!isValidSalary) {
			System.out.println("Salary is not valid. Must be at least 30000.");
		}
		
		if(!isValidCreditScore) {
			System.out.println("Credit score is not valid. Must be between 650 and 850");
		}
		
		if(isValidAge && isValidSalary && isValidCreditScore) {
			System.out.println("Person is eligible for loan.");
		}else {
			System.out.println("Person is not eligible for loan.");
		}
	}

	private static boolean ageValidator(int age) {
		
		return age>=18 && age<=80;
	}
	
	private static boolean salaryValidator(double salary) {
		
		return salary>=30000;
	}
	
	private static boolean creditScoreValidator(int creditScore) {
		return creditScore>=650 && creditScore<=850;
	}
	
}
