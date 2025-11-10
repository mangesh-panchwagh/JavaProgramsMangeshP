package String;

public class ReverseWordOrder {

	public static void main(String[] args) {
		
		String str = "Java is fun to learn";
		
		String[] words = str.split(" ");
		
		for(String word:words) {
			System.out.print(word + " ");
		}
		System.out.println();
		String[] words2 = str.split("\\s+");
		for(String word:words2) {
			System.out.print(word + " ");
		}
		
		System.out.println();
		for(int i = words.length-1; i>=0; i--) {
			System.out.print(words[i] + " ");
		}
		
		String target = "fun";
		String revtarget = "";
		for(int i=0; i<words.length; i++) {
			if(words[i] == target) {
				revtarget += words[i].charAt(i);
			}
		}
		
		
	}
}
