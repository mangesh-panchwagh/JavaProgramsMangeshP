package HundredJavaPrograms;

import java.util.Scanner;

public class J31_Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check for palindrome : ");
		String str = scan.nextLine();
		
		System.out.println("palindrome String by method one : " );
		palindromeStringMethod1(str);
		
		System.out.println();
		System.out.println("palindrome String by method two : " );
		Boolean revString1 = palindromeStringMethod2(str);
		if(revString1)
			System.out.println(str + " is a palindrome");
		else {
			System.out.println(str + " is a not a palindrome");
		}
		
		System.out.println();
		System.out.println("palindrome String by method three : " );
		palindromeStringMethod3(str);
	}
	
	public static void palindromeStringMethod1(String str) {
		String revStr = "";
		for(int i = str.length()-1; i>=0;i--){
			revStr += str.charAt(i);
		}
		if(revStr.equals(str)) {
			System.out.println("Entered string " + str +" is palindrome");	
		}else {
			System.out.println("Entered string " + str +" is palindrome");
		}
	}
	
	public static Boolean palindromeStringMethod2(String str) {
		String revStr = "";
		for(int i = str.length()-1; i>=0;i--){
			revStr += str.charAt(i);
		}
		
		if(revStr.equals(str)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void palindromeStringMethod3(String str) {
		String revString = "";
		char[] charArray = str.toCharArray();
		for(int i = charArray.length-1; i>=0;i--) {
			revString += charArray[i];
		}
		if(str.equals(revString))
			System.out.println("Entered string " + str +" is palindrome");	
		else
			System.out.println("Entered string " + str +" not is palindrome");	
	}
}
