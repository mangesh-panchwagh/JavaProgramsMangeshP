package Pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		pyramid(n);
	}

	public static void pyramid(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i*2-1); j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
