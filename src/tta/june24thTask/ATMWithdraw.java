package tta.june24thTask;

import java.util.Scanner;

public class ATMWithdraw {

	public static void main(String[] args) {
		
		int balance = 10000;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount to withdrawn : ");
		int withdrawAmount = scan.nextInt();
		int remainingBalance = 0;
		
		if(withdrawAmount > balance) {
			System.out.println("Please enter amount less than balance");
		}
		
		if(withdrawAmount < 0) {
			System.out.println("Please enter positive amount greater than balance");
		}
		
		if((withdrawAmount>=0) && (withdrawAmount<=balance)) {
			
			if(withdrawAmount % 100 == 0) {
				
				remainingBalance = balance - withdrawAmount;
				System.out.println("Withdraw Successfull...");
				System.out.println("Remaining balance : " + remainingBalance);
			}else {
				System.out.println("Please enter a valid amount.");
			}
		}
	}
}
