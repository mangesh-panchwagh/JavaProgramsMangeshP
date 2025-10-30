package InterviewQuestions;

public class removeWhiteSpace2 {

	public static void main(String[] args) {
		
		String str = "aaaa bbcc";
		String result = str.replaceAll("\\s+", "");
		System.out.println(result);
	}
}
