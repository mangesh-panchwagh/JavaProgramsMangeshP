package InterviewQuestions;

import java.util.Scanner;
// input : 4321, Output : 10
public class TCS_L2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for sum of digits : ");
		int n = scan.nextInt();
		int sum = 0;
		while(n>0) {
			/*
			int digit = n %10;
			sum = sum + digit;
			n = n/10;
			*/
			sum += n %10;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
