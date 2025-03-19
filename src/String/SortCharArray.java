package String;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SortCharArray {

	public static void main(String[] args) {

		System.out.println("Enter String  to sort the char Array : ");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();

		char[] charArray = s1.toCharArray();

		System.out.println("Original Array is : ");
		for (char c : charArray) {
			System.out.print(c + " ");
		}

		System.out.println("");

		// sort array using Bubble sort
		bubbleSort(charArray);

		// Display sorted array
		for (char c : charArray) {
			System.out.print(c + " ");
		}
	}

	public static void bubbleSort(char[] charArray) {

		int n = charArray.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1; j++) {
				if (charArray[j] > charArray[j + 1]) {
					// swap characters
					char temp = charArray[j];
					charArray[j] = charArray[j + 1];
					charArray[j + 1] = temp;
				}

			}
		}

	}
}
