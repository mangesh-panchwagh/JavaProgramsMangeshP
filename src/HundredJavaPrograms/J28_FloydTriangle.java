package HundredJavaPrograms;

import java.util.Scanner;

// Print Floyd’s Triangle in java Program
public class J28_FloydTriangle {

	public static void main(String[] args) {
		
		int rows, num = 1;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the number of rows of floyd's triangle you want");
		 rows = in.nextInt();
		 System.out.println("Floyd's triangle :-");
		 for ( int i = 1 ; i <= rows ; i++ ) {
			 for(int j = 1;j<=i; j++) {
				 System.out.print(num + " ");
				 num++;
			 }
		 System.out.println();
		 }
	}
}
