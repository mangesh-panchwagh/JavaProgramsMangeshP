package HundredJavaPrograms;

import java.util.Scanner;
//  While loop using break Program in java

public class J21_BreakWhileLoop {

	public static void main(String[] args) {
		
		int n;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the number : ");
			n = scan.nextInt();
			
			if(n==0) {
				break;
			}
			
			System.out.println("You entered : " + n);
		}
		System.out.println("Out of Loop");
	}
}
