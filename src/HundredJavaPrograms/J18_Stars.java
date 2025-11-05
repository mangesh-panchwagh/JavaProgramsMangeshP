package HundredJavaPrograms;

// Print Star console using Loop
public class J18_Stars {

	public static void main(String[] args) {
		
		int row, numberOfStars;
		
		for(row = 1;row<=10;row++) {
			for(numberOfStars = 1; numberOfStars<=row; numberOfStars++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(row = 10;row>=1;row--) {
			for(numberOfStars = row; numberOfStars>=1;numberOfStars--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
