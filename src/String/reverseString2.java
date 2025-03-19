package String;

import java.util.Scanner;

public class reverseString2 {

	public static void main(String[] args) {

		System.out.println("Enter String : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		char[] chArray = s.toCharArray();
		String revString = "";

		for (int i = chArray.length - 1; i >= 0; i--) {
			revString += chArray[i];
		}

		System.out.println("Reverse String is : " + revString);

	}

}
