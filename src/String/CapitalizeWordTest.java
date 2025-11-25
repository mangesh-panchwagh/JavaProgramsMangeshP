package String;

import java.util.Scanner;

public class CapitalizeWordTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scan.nextLine();
		
		String[] words = str.trim().split("\\s+");
		String result = "";
		
		for(String word : words) {
			
			if(word.length()>0) {
				result += Character.toUpperCase(word.charAt(0))
							+ word.substring(1).toLowerCase()
							+ " ";
			}
		}
		System.out.println(result);
	}
}
