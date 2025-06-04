package String;

import java.util.Scanner;

public class CountWordWithoutSplit  {

	public static void main(String[] args) {
		System.out.println("Enter string for word count");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		// Trip the leading and trailing spaces
		
		int wordcount = 0;
		boolean inword = false;
		
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(Character.isWhitespace(ch)) {
				inword = false;
			}else {
				if(!inword) {
					wordcount++;
					inword = true;
				}
			}
		}

		System.out.println("Number of words : " + wordcount);
	}

}
