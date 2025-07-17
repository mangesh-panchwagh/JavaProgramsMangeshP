package ex_16_Arrays;

import java.util.Scanner;

public class Lab165_Left_Triangle_2D {

	public static void main(String[] args) {
		
//		***
//		**
//		*
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		
		for(int i = n; i>0; i--) {
			for(int j = i;j>0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Second Way
//		for (int i = n; i >=1; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
	}
}
