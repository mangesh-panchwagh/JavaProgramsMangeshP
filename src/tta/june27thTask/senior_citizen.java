package tta.june27thTask;

import java.util.Scanner;

public class senior_citizen {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = scan.nextInt();
		
		if(age < 0){
			System.out.println("Please enter the valid age : ");
			System.out.println("Age cannot be negative");
		}else if(age <=12) {
			System.out.println("You are in the child category.");
		}else if(age <=19) {
			System.out.println("You are in teenage category.");
		}else if(age <=64) {
			System.out.println("You are in Adult category");
		}else if(age>=65) {
			System.out.println("You are senior citizen");
		}
	}
}
