package HundredJavaPrograms;

import java.util.Scanner;

//7. Swap two numbers without using third number

public class J07_SwapNumbers2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = scan.nextInt();
		
		System.out.println("Enter second number");
		int n2 = scan.nextInt();
		
		System.out.println("Before swapping : \n n1 : " + n1 + " \n n2 : " + n2);
		
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		System.out.println("Before swapping : \n n1 : " + n1 + " \n n2 : " + n2);
		
	}
}
