package tta.june25thTask;

import java.util.Scanner;

public class EligibilityOfTravel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Get age input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        // Get visa status input
        System.out.print("Enter your visa status (valid/invalid): ");
        String visaStatus = sc.nextLine().toLowerCase();

		boolean isValidAge = ageValidator(age);
		boolean isValidVissa = visaStatusValidator(visaStatus);
		
		
		if(!isValidAge) {
			System.out.println("Age is not valid. Must be between 18 and 80.");
		}
		
		if(!isValidVissa) {
			System.out.println("provide valid visa status.");
		}
		
		if(age >=18 && visaStatus.equals("valid")) {
			System.out.println("You are eligible to travel.");
		}else {
			System.out.println("You are not eligible to travel.");
		}
	}
	
	private static boolean ageValidator(int age) {
		
		return age>=18;
	}
	
	private static boolean visaStatusValidator(String visaStatus) {
		
		if(visaStatus.equals("valid")) {
			return true;
		}else {
			return false;
		}
	}
}
