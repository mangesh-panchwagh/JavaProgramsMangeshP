package Practice;

import java.util.*;

public class FrequencyOfChar2 {

	public static void main(String[] args) {
		
		System.out.println("Enter String frequency count: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
	}
}
