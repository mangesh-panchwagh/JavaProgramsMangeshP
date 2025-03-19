package Pattern;

import java.util.Scanner;

//Enter the number : 
//5
//*****
//****
//***
//**
//*
public class pattern1 {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		downTriangle(n);
	}

	public static void downTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
