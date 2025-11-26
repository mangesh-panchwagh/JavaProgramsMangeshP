package Practice;

import java.util.Scanner;
public class SubstringsExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : " );
		String s = scan.nextLine();
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			for(int j = i+1; j<=s.length(); j++) {
				System.out.println(s.substring(i, j));
				count++;
			}
		}
		System.out.println("Total number of substrings : " + count);
	}
}
