package tta.june27thTask;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows you want : ");
		int number = scan.nextInt();

		for (int i = 0; i < number; i++) {

			for(int k = 1;k <= number-i;k++) {
				System.out.print(" ");
			}
			
			for(int j = 1;j<=(2*i-1);j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
