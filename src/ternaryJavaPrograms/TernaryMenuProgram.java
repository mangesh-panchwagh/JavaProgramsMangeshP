package ternaryJavaPrograms;

import java.util.Scanner;

public class TernaryMenuProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n=== Ternary Operator Menu ===");
			System.out.println("1. Check Even or Odd");
			System.out.println("2. Find Maximum of Two Numbers");
			System.out.println("3. Check Voting Eligibility");
			System.out.println("4. Find Minimum of Three Numbers");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter a number: ");
				int num = sc.nextInt();
				String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
				System.out.println("Result: " + evenOdd);
				break;

			case 2:
				System.out.print("Enter first number: ");
				int a = sc.nextInt();
				System.out.print("Enter second number: ");
				int b = sc.nextInt();
				int max = (a > b) ? a : b;
				System.out.println("Maximum is: " + max);
				break;

			case 3:
				System.out.print("Enter your age: ");
				int age = sc.nextInt();
				String vote = (age >= 18) ? "Eligible to vote" : "Not eligible";
				System.out.println("Result: " + vote);
				break;

			case 4:
				System.out.print("Enter first number: ");
				int x = sc.nextInt();
				System.out.print("Enter second number: ");
				int y = sc.nextInt();
				System.out.print("Enter third number: ");
				int z = sc.nextInt();
				int min = (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z);
				System.out.println("Minimum is: " + min);
				break;

			case 5:
				System.out.println("Exiting program. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 5);
		sc.close();
	}

}
