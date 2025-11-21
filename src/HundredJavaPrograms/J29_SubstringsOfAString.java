package HundredJavaPrograms;

import java.util.Scanner;

// Find All substring of string in java Program
public class J29_SubstringsOfAString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scan.nextLine();
		int count = 0;
		for(int i=0; i<str.length();i++) {
			for(int j = i+1; j<=str.length();j++) {
				//res += str.charAt(j);
				System.out.println(str.substring(i, j));
				count ++;
			}
			
			//System.out.println();	
		}
		System.out.println(count +" ");
		
		/*
		String string, sub;
		 int i, c, length;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter a string to print it's all substrings");
		 string = in.nextLine();
		 length = string.length();
		 
		 System.out.println("Substrings of \""+string+"\" are :-");
		 for( c = 0 ; c < length ; c++ )
		 {
		 for( i = 1 ; i <= length - c ; i++ )
		 {
		 sub = string.substring(c, c+i);
		 System.out.println(sub);
		 }
		 }
		 */
	}
}
