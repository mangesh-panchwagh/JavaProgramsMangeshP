package Practice;

import java.util.Scanner;
public class FrequencyOfChar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scan.nextLine();
		int[] frequency = new int[256];
		
		for(char ch:s.toCharArray()) {
			frequency[ch] ++;
		}
		
		for(int i = 0; i<frequency.length; i++) {
			if(frequency[i] > 1) {
				System.out.println((char)i + " = " + frequency[i]);
			}
		}
	}
}
