package tta.june25thTask;

import java.util.Scanner;

public class LoanEligibility2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = scan.nextInt();
		
		System.out.println("Enter Salary : ");
		double salary = scan.nextDouble();
		
		System.out.println("Enter cerdit Score : ");
		int creditScore = scan.nextInt();
		
		boolean validAge = age >=18 && age<=80;
		boolean validSalary = salary>=30000;
		boolean validCreditScore = creditScore>=650 && creditScore<=850;
		
		if(validAge && validSalary && validCreditScore) {
			System.out.println("Eligible for loan");
		}else {
			System.out.println("Not eligible for loan");
		}
	}
}
