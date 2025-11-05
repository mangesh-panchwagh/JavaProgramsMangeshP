package HundredJavaPrograms;

import java.util.Scanner;
// While loop Program in java
public class J19WhileLoop {

	public static void main(String[] args) {
		
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		
		while((n = scan.nextInt())!= 0) {
			System.out.println("You entered : " + n);
			System.out.println("Enter an Integer");
		}
		System.out.println("Out of Loop");
	}
}
