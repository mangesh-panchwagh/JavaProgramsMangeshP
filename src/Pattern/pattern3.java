package Pattern;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		reverseRightAngleTriangle(n);
	}

	public static void reverseRightAngleTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for(int j = (n-1);j<=n;j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=n; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
