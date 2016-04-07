package lesson160407;

public class SwithExample2 {

	public static void main(String[] args) {

		switch (5) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("Не четные");
			break;
		case 0:
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println("Четные");
			break;
		}

	}

}
