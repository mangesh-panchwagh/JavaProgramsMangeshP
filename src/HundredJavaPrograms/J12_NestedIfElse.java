package HundredJavaPrograms;

import java.util.Scanner;

public class J12_NestedIfElse {

	public static void main(String[] args) {
		
		int marksObtained, passingMarks;
		char grade;
		
		passingMarks = 40;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks scored by you :");
		System.out.println("Enter marks scored by you :");
		marksObtained = scan.nextInt();
		
		if(marksObtained >= passingMarks) {
			
			if(marksObtained > 90)
				grade = 'A';
			else if(marksObtained > 75)
				grade = 'B';
			else if(marksObtained > 60)
				grade = 'C';
			else 
				grade = 'D';
			
			System.out.println("You passed the exam and your grade is " + grade);
			
		}
		else {
			grade = 'F';
			System.out.println("You failed and your grade is " + grade);
		}
		
		
	}
}
