package lesson160411;

public class Question03 {

	/*
	 * A. Grater than,10 B. false,10 C. Grater than,11 D. false,11 E. compile
	 * error in 22 F. compile error in 23
	 * 
	 */

	public static void main(String[] args) {

		int x = 0;
		while (x++ < 10) {
		}
		String message = x > 10 ? "Greater than" : "false";
		System.out.println(message + "," + x);

	}
}
