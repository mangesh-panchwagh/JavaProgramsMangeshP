package ex_16_Arrays;

public class Lab158_String_CLI_ForEach_Loop {

	public static void main(String[] mangesh) {
		// 10 mangesh true
		
		for(int i = 0; i<mangesh.length; i++) {
			System.out.println(mangesh[i]);
		}
		
		System.out.println(" -- ");
		
		for(String arg:mangesh) {
			System.out.println(arg);
		}
	}
}
