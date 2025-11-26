package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		
		System.out.println("Enter String for first non-repeatng character : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char ch: s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() ==1) {
				System.out.println("First non-repeating : " + entry.getKey());
				break;
			}
		}
	}
}
