package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
		 Integer[] array = {1,2,3,4,5,2,3};
		 String[] string = {"India", "USA", "China"};
		 Character[] charArray = {'a','g','r','u','o','p','m', 'a', 'r', 'g', 'a'};
	     
	     List<Integer> list = new ArrayList<>(Arrays.asList(array));
	     System.out.println("Given list : " + list);
	     
	     Set<Integer> set = new HashSet<>(Arrays.asList(array));
	     System.out.println("Withoud duplicates : " + set);
	     
	     LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(array));
	     System.out.println("Linked list of given list  " +list2);
	     
	     // String
	     List<String> strList = new LinkedList<>(Arrays.asList(string));
	     System.out.println(strList);
	    
	     // Character
	     List<Character> charList = new ArrayList<>(Arrays.asList(charArray));
	     System.out.println(charList);
	     
	     Set<Character> charSet = new HashSet<>(Arrays.asList(charArray));
	     System.out.println(charSet);
	}
}
