package lesson160407;

public class SwitchExample4 {

	public static void main(String[] args) {

		if (args == null) {
			System.exit(1);
		}
		if (args.length == 0) {
			System.out.println("Usage: <hello phrase>");
		}

		switch (args[0]) {
		case "Hello":
			System.out.println("Hi there!");
			break;
		case "Привет":
			System.out.println("Здарова");
			break;
		case "Шолом":
			System.out.println("израэля");
			break;
		default:
			System.out.println("не понимаю");
		}
	}

}
