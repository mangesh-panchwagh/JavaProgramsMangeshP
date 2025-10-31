package Array;

import java.util.Scanner;

public class reverseWordsFromArray3 {

	public static void main(String[] args) {
		String[] words = {"India","Pune","Mumbai"}; 
		
		for(int i=0; i<words.length;i++) {
			words[i] = reverseString(words[i]);
		}
		
		// Print Reverse Words
		for(String word:words) {
			System.out.println(word);
		}
		
	}
	
	public static String reverseString(String words) {
		
		String reverseWord = "";
		
		for(int i =words.length()-1;i>=0; i--) {
			reverseWord += words.charAt(i);
		}
		return reverseWord;
	}
}
