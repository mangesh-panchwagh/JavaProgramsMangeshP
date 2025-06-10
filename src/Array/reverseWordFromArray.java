package Array;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class reverseWordFromArray {
	String reverseString = "";
	public static void main(String[] args) {
		
		String[] words = {"India","China","America"};
		
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
