package HundredJavaPrograms;

import java.math.BigInteger;
import java.util.Scanner;

// 8. Add two numbers program in java
public class J8_AddNumbers {

	public static void main(String[] args) {
		
		int x,y,z;
		System.out.println("Enter two integers to calculate their sum : ");
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		y = scan.nextInt();
		z = x + y;
		
		System.out.println("Sum of entered integers : " + z);
		
		// Add large numbers
		String number1, number2;
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter first large number");
		number1 = scan2.nextLine();
		
		System.out.println("Enter second large number");
		number2 = scan2.nextLine();
		
		BigInteger first = new BigInteger(number1);
		BigInteger second = new BigInteger(number2);
		
		BigInteger sum;
		
		sum = first.add(second);
		System.out.println("Result of addition : " + sum);
		
	}
}
