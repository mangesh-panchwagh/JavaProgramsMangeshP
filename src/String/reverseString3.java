package String;

import java.util.Scanner;

public class reverseString3 {

	public static void main(String[] args) {
		
		System.out.println("Enter String : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		
		sb.reverse();
		
		System.out.println("Reverse String is : " + sb.toString());
	
	}
}
