package HundredJavaPrograms;

import java.util.Scanner;

public class J15_CompareStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first strings : ");
		String str1 = scan.nextLine();
		
		System.out.println("Enter two strings : ");
		String str2 = scan.nextLine();
		
		if(str1.compareTo(str2) > 0)
			System.out.println("First string is grater than second");
		else if(str1.compareTo(str2) < 0)
			System.out.println("First string is smaller than second");
		else
			System.out.println("Both strings are equal");
			
		
	}
}
