package InterviewQuestions;

public class removeWhiteSpace {

	public static void main(String[] args) {
		
		String str = "aaaa bbcc";
		String s="";
		int[] frequency = new int[256];
		for(int i=0;i< str.length();i++) {
			
			if(str.charAt(i)!=' ') {
				s += str.charAt(i);
			}
		}
		System.out.println(s);
		
		for(char ch:s.toCharArray()) {
			frequency[ch]++;
		}
	
		for(int i=0;i<frequency.length;i++) {
			if(frequency[i]>1) {
				System.out.print((char)i + ""+frequency[i]);
			}
		}
	}
}
