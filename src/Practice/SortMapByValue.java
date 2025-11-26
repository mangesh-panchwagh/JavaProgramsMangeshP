package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class SortMapByValue {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("D", 3);
		map.put("A", 1);
		map.put("C", 2);
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());
		
		System.out.println(list);
	}
}
