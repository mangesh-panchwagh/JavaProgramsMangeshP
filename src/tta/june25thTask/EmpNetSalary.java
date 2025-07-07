package tta.june25thTask;

import java.util.Scanner;

public class EmpNetSalary {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Basic pay for employee : ");
		double basicPay = scan.nextDouble();
		
		System.out.println("Enter HRA for employee : ");
		double HRA = scan.nextDouble();
		
		System.out.println("Enter DA for employee : ");
		double DA = scan.nextDouble();
		
		System.out.println("Enter tax deductions for employee : ");
		double taxDecuctions = scan.nextDouble();
		
		double grossSalary = basicPay + HRA + DA;
		double netSalary = grossSalary - taxDecuctions;
		
		System.out.println("Gross Salary : " + grossSalary);
		System.out.println("Net Salary : " + netSalary);
		
	}
}
