package HundredJavaPrograms;

import java.util.Scanner;

// Print Multiplication table Program in java
public class J25_MultiplicationTable {

	public static void main(String[] args) {
		
		int n,i;
		System.out.println("Enter number to print its multiplication table : ");
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		for(i = 1;i<=10;i++) {
			System.out.println(n +" * " + i +" = " + (n * i));
		}
		
		// For any number
		int a, b;
		System.out.println("Enter range of numbers to print their multiplication table");
		a = scan.nextInt();
		b = scan.nextInt();
		
		for(i = a; i<=b; i++) {
			System.out.println("Multiplication table of " + i +" : ");
			
			for(int j = 1; j<=10; j++) {
				System.out.println(i +" * " + j +" = " + (i * j));
			}
		}
	}
}
