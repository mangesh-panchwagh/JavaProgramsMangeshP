package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scan.nextLine();
		
		countCharacters(str);
	}
	
	public static void countCharacters(String str) {
		
		// Remove spaces if you want to skip them
		str = str.replaceAll("\\s+", "");
		System.out.println(str);
		
		Map<Character,Integer> charCountMap = new HashMap<>();
		for(char ch:str.toCharArray()) {
			if(charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch)+1);
			}else {
				charCountMap.put(ch, 1);
			}
		}
		// Print the results
		for(Map.Entry<Character, Integer> entry :charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " = "  + entry.getValue());
		}
		
		
		
	}
}
