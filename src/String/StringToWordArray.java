package String;

public class StringToWordArray {

	public static void main(String[] args) {
		
		String str = "Hello Mangesh Panchwagh Pune";
		
		String[] words = str.split(" ");
	
		// str.split(" ") : splits on spaces
		// str.split("\\s+") : splits on every whitespace
		
		
		for(String word: words) {
			System.out.print(word + " ");
		}
		System.out.println();
		for(int i =0;i<words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}
}
