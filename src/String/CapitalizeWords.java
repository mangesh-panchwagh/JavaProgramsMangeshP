package String;

import java.util.Scanner;

public class CapitalizeWords {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = scan.nextLine();
		
		String[] words = str.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();

		
		String result = "";
		for(String word: words) {
			
			if(!word.isEmpty()) {
				result += Character.toUpperCase(word.charAt(0))
							+ word.substring(1).toLowerCase()
							+ " ";
			}
		}
		
		result = result.trim();
		System.out.println(result);
		
		for(String word: words) {
			
			if(word.length() > 0) {
				capitalized.append(Character.toUpperCase(word.charAt(0)))
						    .append(word.substring(1).toLowerCase())
						    .append(" ");
			}
		}
		
		System.out.println(capitalized.toString().trim());
		
	}
}
