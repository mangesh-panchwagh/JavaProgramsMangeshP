package Array;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class reverseWordFromArray2 {
	String reverseString = "";
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many words you want to reverse : ");
		int numberOfWords = scan.nextInt();
		
		String[] words = new String[numberOfWords];
		System.out.println("Enter the "+numberOfWords+" words to reverse : ");
		
		for(int i= 0;i<numberOfWords;i++) {
			words[i] = scan.nextLine();
		}
		
		// Print words
		System.out.print("Entered words are : ");
		for(int i = 0; i<numberOfWords; i++) {
			System.out.println(words[i]);
		}
		
		// Loop through each word 
		for(int i=0;i<words.length;i++) {
			words[i] = reverseString(words[i]);
		}
		// Print words array
		for(String word : words) {
			System.out.println(word);
		}
	}
	
	public  static String reverseString(String str) {
		String reverseString = "";
		for(int i = str.length()-1;i>=0;i--) {
			reverseString += str.charAt(i);
		}
		return reverseString;
	}
}
