package HundredJavaPrograms;

import java.util.Scanner;

// 5. Convert J5_Fahrenheit to Celsius Program in java
public class J5_FahrenheitToCelsius {

	public static void main(String[] args) {
		
		float temperature;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit");
		temperature = scan.nextInt();
		
		temperature = ((temperature - 32)*5)/9;
		
		System.out.println("Temprature in Celsius is : " + temperature);
	}
}
