package classwork160505;

public class Methods {

	public static void main(String[] args) {

		int[] x = { 2, 4, 6, 8, 10 };
		// for (int element : x) {
		// System.out.println(element);
		// }
		int[] y = { 3, 6, 9, 12 };

		printArray(x);
		printArray(y);

	}

	static void printArray(int[] z) {
		// int[] a = { 1, 2, 3, 4, 5 };
		for (int element : z) {
			System.out.println(element);
	}
	}

}
