package InterviewQuestions;

import java.util.Map;

public class CountCharOccurance {

	public static void main(String[] args) {
		
		String str = "Mangesh PanchwaghMmm";
		int[] frequency = new int[256];
		
		
		for(char ch:str.toLowerCase().toCharArray()) {
			frequency[ch]++;
		}
		
		for(int i=0;i<frequency.length;i++) {
			if(frequency[i]>1) {
				System.out.println((char)i + " = " +frequency[i]);
			}
		}
		
	}
}
