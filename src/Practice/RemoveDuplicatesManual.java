package Practice;

public class RemoveDuplicatesManual {

	public static void main(String[] args) {
		
		String input = "programming";
		String result = new String();
		
		 boolean[] seen = new boolean[256];
		 
		 
		 for(char c : input.toCharArray()) {
			 if(!seen[c]) {
				 result = result + input.charAt(c) + "";
				 seen[c] = true;
			 }
		 }
		 
		 System.out.println(result.toString());
	}
}
