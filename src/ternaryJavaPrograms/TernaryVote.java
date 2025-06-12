package ternaryJavaPrograms;

import java.util.Scanner;

public class TernaryVote {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age fo vote eligibility : ");
		int age = scan.nextInt();
		
		String result = (age > 18) ? "Eligible" : "Not Eligible";
		System.out.println(result);
	}
}
