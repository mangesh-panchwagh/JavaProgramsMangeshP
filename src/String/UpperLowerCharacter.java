package String;

import java.util.Scanner;

public class UpperLowerCharacter {

	public static void main(String[] args) {
		
		System.out.println("Enter the String : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int upper = 0;
		int lower = 0;
		
		for(int i = 0;i<str.length();i++) {
			
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				upper++;
				
			}else {
				lower++;
			}
		}
		
		System.out.println("Upper : " + upper);
		System.out.println("Lower : " + lower);
	}
}
