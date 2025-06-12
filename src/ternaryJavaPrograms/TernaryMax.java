package ternaryJavaPrograms;

import java.util.Scanner;

public class TernaryMax {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number first number : ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter number second number : ");
		int num2 = scan.nextInt();
		
		int maxnumber = (num1 > num2 )? num1 :num2;
		System.out.println("Max number is : " + maxnumber);
	}
}
