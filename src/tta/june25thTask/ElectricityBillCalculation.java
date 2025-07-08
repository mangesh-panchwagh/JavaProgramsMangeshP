package tta.june25thTask;

import java.util.Scanner;

public class ElectricityBillCalculation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the units of Electricity Bill :" );
		float billUnits = scan.nextFloat();
		
		float billAmount = 0;
		
		float constantCharge = 100;
		
		if(billUnits >= 0 && billUnits <=100) {
			billAmount = (float) (billUnits * 0.50);
		}else if(billUnits >100 && billUnits <=200) {
			billAmount = (float) (billUnits * 0.75);
		}else if(billUnits > 200 && billUnits <= 300) {
			billAmount = (float) (billUnits * 1.20);
		}else if(billUnits > 300) {
			billAmount = (float) (billUnits * 1.50);
		}
		System.out.println("Bill is : " + (billAmount + constantCharge));
	}
}
