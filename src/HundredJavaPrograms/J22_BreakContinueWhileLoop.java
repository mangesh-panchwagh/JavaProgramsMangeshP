package HundredJavaPrograms;

import java.util.Scanner;
// While loop using break and continue Program in java

public class J22_BreakContinueWhileLoop {

	public static void main(String[] args) {
		
		int n;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Integer : ");
			n = scan.nextInt();
			if(n !=0) {
				System.out.println("You entered : " + n);
				continue;
			}else {
				break;
			}
		}
		System.out.println("Out of Loop");
	}
}
