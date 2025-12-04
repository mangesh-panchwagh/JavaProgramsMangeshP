package Practice;

public class ReverseSpecificWords {

	public static void main(String[] args) {
		
		String input = "mangesh panchwgh come from pune";
		String[] words = input.split(" ");
		
		
		String w1 = new StringBuffer(words[2]).reverse().toString();
		String w2 = new StringBuffer(words[3]).reverse().toString();
		
		String remaining = words[0] + " " + words[1] + " " + words[4];
		
		String output = w1 + " " + w2 + " " + remaining;
		System.out.println(output);
	}
}
