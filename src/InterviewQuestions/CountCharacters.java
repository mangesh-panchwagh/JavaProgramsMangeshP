	package InterviewQuestions;

public class CountCharacters {

	public static void main(String[] args) {
		
		String str = "aaaa bbcc";
		String str2 = str.replaceAll("\\s+", "");
		int[] frequency = new int[256];
		
		
		
		for(char ch:str2.toCharArray()) {
			frequency[ch]++;
		}
		
		for(int i = 0; i<frequency.length;i++) {
			if(frequency[i]>0) {
				System.out.print((char)i + "" +frequency[i]);
			}
		}
	}
}
