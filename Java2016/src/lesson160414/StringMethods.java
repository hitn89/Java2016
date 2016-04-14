package lesson160414;

public class StringMethods {

	public static void main(String[] args) {

		String s = "Hello, world!";

		System.out.println(s.length());

		for (int i = 0; i < s.length(); i++) {
			System.out.println(i + " : " + s.charAt(i)); // charAt - достает
															// символ
		}

		System.out.println(s.charAt(0));
		// System.out.println(s.charAt(s.length()));
		System.out.println(s.charAt(s.length() - 1));

		System.out.println(s.indexOf('w')); // - показывает номер символа w
		System.out.println(s.indexOf('o')); // - показывает номер символа o
		System.out.println(s.lastIndexOf('o')); // - показывает номер последнего
												// символа o
		String phrase = "If the thather of thathwood went to thatch it a thathing";

		System.out.println(phrase.indexOf("went"));
		System.out.println(phrase.indexOf("thatch", 35)); // найти после 35
															// позиции

		System.out.println(s.substring(6));
		System.out.println(s.substring(7, 12)); // обрезает с 7 по 12

		String w = s.substring(7, 12);
		System.out.println(w);
		
		s.substring(2, 2);
		System.out.println(s);

		// s.substring(2, 1);

	}
}
