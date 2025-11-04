package HundredJavaPrograms;

import java.util.Scanner;

//If else in Java code

public class J11_IfElse {

	public static void main(String[] args) {
		
		int marksObtained, passingMarks;
		
		passingMarks = 40;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter marks scored by you");
		marksObtained = scan.nextInt();
		
		if(marksObtained >= passingMarks)
			System.out.println("You passed the exam");
		else
			System.out.println("Unfortunately you failed to pass the exam");
	}
}
