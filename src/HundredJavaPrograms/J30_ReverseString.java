package HundredJavaPrograms;

import java.util.Scanner;

public class J30_ReverseString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string for revese it : ");
		String str = scan.nextLine();
		
		String revString1 = reverseStringMethod1(str);
		String revString2 = reverseStringMethod2(str);
		StringBuffer revString3 = reverseStringMethod3(str);
		
		System.out.println("Reverse String by method one   : " + revString1);
		System.out.println("Reverse String by method two   : " + revString2);
		System.out.println("Reverse String by method three : " + revString3);
	}
	public static String reverseStringMethod1(String str) {
		String revString = "";
		for(int i = str.length()-1;i>=0;i--) {
			revString += str.charAt(i);
		}
		return revString;
	}
	
	public static String reverseStringMethod2(String str) {
		String revString = "";
		char[] charArray = str.toLowerCase().toCharArray();
		for(int i = charArray.length-1; i>=0; i--) {
			revString += charArray[i];
		}
		return revString;
	}
	
		public static StringBuffer reverseStringMethod3(String str) {
		
		StringBuffer revString = new StringBuffer(str);
		return revString.reverse();
	}
	
}
