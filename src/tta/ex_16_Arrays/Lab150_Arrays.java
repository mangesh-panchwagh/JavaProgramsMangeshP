package tta.ex_16_Arrays;

public class Lab150_Arrays {

	public static void main(String[] args) {
		
		int[] marks = {1,2,3,4,5,6};
		
		// 2nd way to create array
		int[] marks2 = new int[5];	// Fixed size :5, 0 to 4
		String[] names = new String[3];	// Fixed size :3, 0 to 2
		
		names[0] = "mangesh";
		names[1] = "pramod";
		names[2] = "amit";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
//		System.out.println(names[]);
	}
}
