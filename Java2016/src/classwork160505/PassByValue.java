package classwork160505;

public class PassByValue {

	public static void main(String[] args) {

		int a = 10;

		a = incrementBy10(a);

		System.out.println(a);

	}

	private static int incrementBy10(final int myVar) {
		// myVar = myVar + 10;
		// System.out.println(myVar);
		return myVar + 10;
	}

}
