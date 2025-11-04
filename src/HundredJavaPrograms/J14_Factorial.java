package HundredJavaPrograms;

import java.util.Scanner;

public class J14_Factorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check factorial :");
		int n = scan.nextInt();
		
		int fact = 1;
		
		for(int i = 1;i<=n;i++) {
			fact = fact * i;
		}
		System.out.print(fact );
	}
}
