package lesson160414;

public class StringMethod2 {

	public static void main(String[] args) {

		String s = "Hello, world!";

		System.out.println(s.toUpperCase()); // заглавными
		System.out.println(s.toLowerCase()); // строчными

		String name = "Mike";

		if (args.length == 0) {
			System.out.println("Enter name");
			return;
		}

		if (args[0].equalsIgnoreCase(name)) {
			System.out.println("Hello, Mike! How are you?");
		}

		if (args[0].startsWith("Mr.")) {
			System.out.println("Hello " + args[0]);
		} else {
			System.out.println("Hi, bubby!");
		}

		System.out.println(s.endsWith("d!"));

		System.out.println(s.contains("mama")); // содержит ли true\false
		System.out.println(s.indexOf("mama"));

		System.out.println(s.replace("Hell", "Ад")); // замена значений

		System.out.println("abc".trim());
		System.out.println("\t\n   a  b  c   ".trim()); // обрезает крайние
														// пробелы и знаки
														// табуляции
	}

}
