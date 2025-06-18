package tta;

import java.util.Scanner;
public class Triangle_Classifier_Ternary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of side1 of triangle : ");
		int side1 = scan.nextInt();
		
		System.out.println("Enter the value of side2 of triangle : ");
		int side2 = scan.nextInt();
		
		System.out.println("Enter the value of side3 of triangle : ");
		int side3 = scan.nextInt();
		
		// Check triangle validity first
        boolean isValid = (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
        
		String result = isValid ?
				(side1 == side2 && side2 == side3 ?  "Equilateral Triangle" :
				(side1 == side2 || side2 == side3 || side1 == side3 ? "Isosceles Triangle" :
					"Scalene Triangle")) :
							"Not a valid Triangle";
		
		System.out.println(result);
		scan.close();
	}
}
