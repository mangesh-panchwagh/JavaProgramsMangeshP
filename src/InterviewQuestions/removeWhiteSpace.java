package InterviewQuestions;

public class removeWhiteSpace {

	public static void main(String[] args) {
		
		String str = "aaaa bbcc";
		String s="";
		for(int i=0;i< str.length();i++) {
			
			if(str.charAt(i)!=' ') {
				s += str.charAt(i);
			}
		}
		System.out.println(s);
	
	}
}
