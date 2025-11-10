package InterviewQuestions;

public class LTIMindTree {

	public static void main(String[] args) {
		
		String str = "mangesh panchwagh come from pune";
		// output : emoc mangesh panchwagh from pune
		// output : emoc morf mangesh panchwagh pune
		String revString = "";
		for(int i = str.length()-1; i>=0; i--) {
			
			revString += str.charAt(i);
		}
		System.out.println(revString);
		
		String target = "come";
		String revTarget = "";
		for(int i = target.length()-1; i>=0; i--) {
			
			revTarget += target.charAt(i);
		}
		
		System.out.println(revTarget);
		
		String[] words = str.split(" ");
		for(String word : words) {
			System.out.print(word + " ");
		}
		
		
	}
}
