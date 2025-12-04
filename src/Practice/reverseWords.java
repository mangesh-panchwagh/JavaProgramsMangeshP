package Practice;

public class reverseWords {

	public static void main(String[] args) {
		
			String input = "Java Is Good";
			//Output: "avaJ sI dooG"
			String[] words = input.trim().split("\\s+");
			
			for(String s : words) {
				System.out.println(s);
			}
			
			for(int i=0; i<words.length; i++) {
				
				//words[i] = reverseWord(); 
			}
				
	}
}
