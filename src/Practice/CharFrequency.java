package Practice;

import java.util.HashMap;
import java.util.Map;

// Find Frequency of Each Character in String
public class CharFrequency {

	public static void main(String[] args) {
		
		String s= "mangesh panchwagh";
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);
	}
}
