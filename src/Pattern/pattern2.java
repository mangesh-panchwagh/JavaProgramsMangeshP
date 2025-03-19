package Pattern;

import java.util.Scanner;

//5
//*
//**
//***
//****
//*****
public class pattern2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		rightAngleTriangle(n);
	}

	public static void rightAngleTriangle(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
