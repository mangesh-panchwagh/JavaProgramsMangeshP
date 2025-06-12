package ternaryJavaPrograms;

import java.util.Scanner;

public class TernaryEvenOdd {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		staticNumberEvenOdd();
		userInputTernaryEvenOdd();
	}
	
	public static void staticNumberEvenOdd() {
		int num = 5;
		String result = (num%2==0)?"Even" : "odd";
		System.out.println(result);
	}
	
	public static void userInputTernaryEvenOdd() {
		System.out.println("Enter nuber to check odd or even : ");
		int num = scan.nextInt();
		String result = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println(result);
	}
}
