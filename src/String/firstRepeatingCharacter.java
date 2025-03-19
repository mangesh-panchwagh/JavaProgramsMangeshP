package String;

import java.util.Scanner;

public class firstRepeatingCharacter {

	public static void main(String[] args) {

		System.out.println("Enter string to find first repeated Character : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		char result = firstRepeatedCharacter(s.trim());
		if(result !=-1) {
			System.out.println("The first repeated character is : " + result);
		}else {
			System.out.println("No repeated character found ");
		}
		//System.out.println(firstRepeatedCharacter(s));
	}

	public static char firstRepeatedCharacter(String str) {

		
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = 0; j < i; j++) {
				
					if(str.charAt(i) == str.charAt(j)) {
						
						//return Character.toString(str.charAt(i));
						return str.charAt(i);
					}
			}
		}
		return (char) -1;
	
		
	}
	
}
