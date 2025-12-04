package InterviewQuestions;

public class Wipro2 {

	public static void main(String[] args) {
		
		//String str = "test12pop90java989pyt"
		// output = "tset12pop90avjaj989typ"
		
		String str = "test12pop90java989pyt";
		StringBuilder result = new StringBuilder();
		
		StringBuilder temp = new StringBuilder();	// to store continuous alphabets
		
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(Character.isLetter(ch)) {
				temp.append(ch);			// build alphabet sequence
			}else {
				// reverse collected alphabets
				result.append(temp.reverse());
				temp.setLength(0);		// clear buffer
				
				result.append(ch);		// keep digit as it is
			}
		}
		
		result.append(temp.reverse());
		System.out.println(result.toString());
	}
}
