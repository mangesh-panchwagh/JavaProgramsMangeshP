package tta;

/*
 * Author : Mangesh Panchwagh
#. Triangle Classifier
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine 
if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or scalene (no sides are equal). 
Use if-else statement to classify the triangle
*/

import java.util.Scanner;
public class Triangle_Classifier {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of side1 of triangle : ");
		int side1 = scan.nextInt();
		
		System.out.println("Enter the value of side2 of triangle : ");
		int side2 = scan.nextInt();
		
		System.out.println("Enter the value of side3 of triangle : ");
		int side3 = scan.nextInt();
		
		if(side1 == side2 && side2 == side3) {
			System.out.println("Triangle is equilateral");
		}else if(side1 == side2 || side2 == side3 || side1 == side3) {
			System.out.println("Triangle is Isosceles");
		}else {
			System.out.println("Triangle is Scalene");
		}
	}
}
