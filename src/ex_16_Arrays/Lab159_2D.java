package ex_16_Arrays;

public class Lab159_2D {

	public static void main(String[] args) {
		
		// 1,2,3
        // 4,5,6
        // 7,8,9
		
		int[][] array_2d_old = { 
				 {1,2,3},
		         {4,5,6},
		         {7,8,9}
		};
		
        // 10,20
        // 30,40
        // 50,60
		
		int[][] array;
		array = new int[][] {
			{10,20},
			{30,40},
			{50,60}
		};
		
		int[][] array_2d = new int[3][3];
		array_2d[0][0] =1;
		array_2d[0][1] =2;
		array_2d[0][2] =3;
//		array_2d[0][3] =92;	// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
		array_2d[1][0] = 1;
		array_2d[1][1] = 3;
		array_2d[1][2] = 5;
		
		array_2d[2][0] = 2;
		array_2d[2][1] = 4;
		array_2d[2][2] = 6;
		
 	}
}
