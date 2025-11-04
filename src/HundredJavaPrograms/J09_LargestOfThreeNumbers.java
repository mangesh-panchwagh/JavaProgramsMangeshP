package HundredJavaPrograms;

import java.util.Scanner;

// Find Largest no in java Program
public class J09_LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int x, y, z;
		System.out.println("Enter three Integers");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		if(x > y && x > z) {
			System.out.println(x +" is the largest number");
		}else if(y > x && y > z) {
			System.out.println(y + " is the largest number");
		}else {
			System.out.println(z + " is the largest number");
		}
		
	}
}
