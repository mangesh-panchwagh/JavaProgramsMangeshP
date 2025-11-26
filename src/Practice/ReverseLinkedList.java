package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4));
		Collections.reverse(list);
		System.out.println(list);
		
		LinkedList<Character> charList = new LinkedList<>(Arrays.asList('a','b','c','d'));
		Collections.reverse(charList);
		System.out.println(charList);
		
		LinkedList<String> stringList= new LinkedList<>(Arrays.asList("Mangesh","Panchwagh","From","Pune"));
		Collections.reverse(stringList);
		System.out.println(stringList);
	}
}
