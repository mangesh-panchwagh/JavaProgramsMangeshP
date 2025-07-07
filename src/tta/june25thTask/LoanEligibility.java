package tta.june25thTask;

import java.util.Scanner;

public class LoanEligibility {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = scan.nextInt();
		
		System.out.println("Enter Salary : ");
		double salary = scan.nextDouble();
		
		System.out.println("Enter cerdit Score : ");
		int creditScore = scan.nextInt();
		

		
		if(age >0 && age >=18 && age<=80) {
			
			if(salary>=30000) {
				
				if(creditScore>=650 && creditScore<=850) {
					System.out.println("You are eligible for loan.");
				}else {
					System.out.println("Your credit score is not enough for loan approval");
				}
			}else {
				System.out.println("Your salary is too low to acquire loan");
			}
		}else {
			System.out.println("Due to your age, you are not eigible  for a loan");
		}
		
		
	}
}
