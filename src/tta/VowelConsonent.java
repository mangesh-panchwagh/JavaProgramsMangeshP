package tta;

import java.util.Scanner;

// Check if character is Vowel or Consonent
public class VowelConsonent {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character");
		
		char ch = scan.next().charAt(0);
		
		System.out.println("You entered : " + ch);
		
		if(Character.toLowerCase(ch) == 'a' ||
		   Character.toLowerCase(ch) == 'e' || 
		   Character.toLowerCase(ch) == 'i' ||
		   Character.toLowerCase(ch) == 'o' ||
		   Character.toLowerCase(ch) == 'u') {
			System.out.println("Entered Chatacter is a Vowel");
		}else {
			System.out.println("Entered Character is Consonent");
		}
			
		
	}
}
