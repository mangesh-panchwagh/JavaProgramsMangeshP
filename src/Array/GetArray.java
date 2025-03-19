package Array;

import java.util.Scanner;

public class GetArray {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements you want in the array : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		
		int array[] = new int[n];
		
		System.out.println("Enter " + n + " array elements");
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Entered array elements are : ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
