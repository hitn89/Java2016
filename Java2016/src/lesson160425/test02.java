package lesson160425;

public class test02 {

	public static void main(String[] args) {

		String str = "Code";
		// System.out.println(str.length());
		String result = "";
		for (int i = 1; i < str.length() + 1; i++) {
			result += str.substring(0, i);
		}
		System.out.println(result);

	}

}
