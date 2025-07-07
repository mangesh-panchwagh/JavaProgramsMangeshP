package tta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddSeparator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n = scan.nextInt();
		
		int arrayNumbers[] = new int[n];
		
		System.out.println("Enter " + n+" array elements");
		for(int i = 0;i<n;i++) {
			arrayNumbers[i] = scan.nextInt();
		}
		
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		
		for(int i = 0;i<arrayNumbers.length;i++) {
			
			if(arrayNumbers[i] % 2 == 0) {
				evenList.add(arrayNumbers[i]);
			}else {
				oddList.add(arrayNumbers[i]);
			}
		}
		System.out.println("Even List : " + evenList);
		System.out.println("Odd List : " + oddList);
	}
}
