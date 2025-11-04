package HundredJavaPrograms;

import java.util.Scanner;

public class J13_OddOrEven {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check if it is odd or even");
		int n = scan.nextInt();
		
		if(n%2 ==0)
			System.out.println("You entered an even number.");
		else
			System.out.println("You entered an odd number.");
	}
}
