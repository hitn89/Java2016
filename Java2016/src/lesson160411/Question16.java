package lesson160411;

public class Question16 {

	public static void main(String[] args) {
		int y = 1;
		do {
			y = 1;
			System.out.println(y++ + " ");
		} while (y <= 10);

		int x = 10;

		{
			int z = 20;
			System.out.println(z);
		}
		// System.out.println(z);
	}

}
