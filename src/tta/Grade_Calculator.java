package tta;

/*
#. Grade Calculator
Write a program that calculates and displays the letter grade for a given numerical score (e.g. A,B,C,D, or F)
A : 90-100
B : 80-89
C : 70-79
D : 60-69
F : 0-59
*/
import java.util.Scanner;
public class Grade_Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int marks = scan.nextInt();
		
		
		if(marks >=90 && marks <=100) {
			System.out.println("Grade A");
			
		}else if(marks >=80 && marks <=89) {
			System.out.println("Grade B");
			
		}else if(marks >=70 && marks <=79) {
			System.out.println("Grade C");
			
		}else if(marks >=60 && marks <=69) {
			System.out.println("Grade D");
			
		}else if(marks >=0 && marks <=59) {
			System.out.println("Grade F");
		}

	}
}
