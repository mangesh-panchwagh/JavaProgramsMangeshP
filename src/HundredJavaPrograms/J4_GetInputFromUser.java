package HundredJavaPrograms;

import java.util.Scanner;

// 4. How to get User input using Scanner Program in java
public class J4_GetInputFromUser {

	public static void main(String[] args) {
		
		int a;
		float b;
		String s;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String : "); 
		s = scan.nextLine();
		System.out.println("You entered a String : " + s);
		
		System.out.println("Enter a Integer : ");
		a = scan.nextInt();
		System.out.println("You entered an integer : " + a);
		
		System.out.println("Enter a float : ");
		b = scan.nextFloat();
		System.out.println("You entered a float : " + b);
	}
}
