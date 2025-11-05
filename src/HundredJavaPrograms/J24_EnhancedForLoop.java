package HundredJavaPrograms;

// Enhance loop in java Program
public class J24_EnhancedForLoop {

	public static void main(String[] args) {
		
		int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		
		for(int t : primes) {
			System.out.println(t);
		}
		
		// For String
		String languages[] = { "C", "C++", "Java", "Python", "Ruby"};
		
		for(String lang:languages) {
			System.out.println(lang);
		}
	}
}
