package HundredJavaPrograms;

import java.util.Scanner;

// 26. Print prime no Program in java
public class J26_PrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter number to chcek for prime");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		boolean isPrime = true;
		
		if(n<=1) {
			isPrime = false;
		}else {
			for(int i = 2; i<=Math.sqrt(n); i++) {
				if(n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(n + " is a prime number");
		}else {
			System.out.println(n + " is a not prime number");
		}
		
		// Optimized version of Prime number along with between range
		System.out.println("=========================================================");
		System.out.println("Optimized version of Prime number along with between range");
		System.out.println("Enter start number : ");
		int start = scan.nextInt();
		
		System.out.println("Enter end number : ");
		int end = scan.nextInt();
		
		for(int i = start; i<= end; i++) {
			
			if(isPrimeFunction(i)) {
				System.out.print(i + " ");
			}
		}
	}

	private static boolean isPrimeFunction(int n) {
		
		if(n<=1)
			return false;
		for(int i = 2; i<= Math.sqrt(n); i++) {
			if(n % i ==0) {
				return false;
			}
		}
		return true;
	}
}
