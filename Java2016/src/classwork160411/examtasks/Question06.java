package classwork160411.examtasks;

public class Question06 {

	public static void main(String[] args) {

		int x = 4;
		long y = x * 4 - x++;
		if (y < 10) {
			System.out.println("Too low");
		} else {
			System.out.println("Just right");
		}
		System.out.println(x + ", " + y);
		// else.... - лишнее!
	}

}
