package InterviewQuestions;

public class Wipro1 {

	public static void main(String[] args) {
		
		int[] array = {2,8,1,10,5};
		int max = 0;
		for(int i = 0; i< array.length;i++){
		    for(int j = i+1; j< array.length;j++){
		        int temp = array[j] - array[i];
		        if( temp > max){
		            max = temp;
		        }
		    }
		}
		System.out.println(max);
	}
}
