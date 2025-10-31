package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCountOccurance2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scan.nextLine();
		
		countCharacters(str);
	}
	
	public static void countCharacters(String str) {
		
		str = str.replaceAll("\\s+", "");
		System.out.println(str);
		
		Map<Character,Integer> charCountMap = new HashMap<>();
		for(char ch : str.toCharArray()) {
			if(charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch)+1);
			}else {
				charCountMap.put(ch, 1);
			}
		}
		
		// Print The Results
		for(Map.Entry<Character, Integer> entry:charCountMap.entrySet()) {
			System.out.print(entry.getKey() + " " + entry.getValue());
		}
		
	}
}
