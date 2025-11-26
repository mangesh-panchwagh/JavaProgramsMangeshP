package InterviewQuestions;

import java.util.Scanner;

//  Reverse String Program
public class TCS_L1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string for reverse : ");
		String s = scan.nextLine();
		
		String revString = "";
		for(int i = s.length()-1; i>=0; i--) {
			revString += s.charAt(i);
		}
		System.out.println("Reverse String is : " + revString);
	}
}
