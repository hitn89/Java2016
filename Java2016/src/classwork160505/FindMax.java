package classwork160505;

public class FindMax {

	public static void main(String[] args) {

		int[] a = { 10, 30, -20, 90, 40, 2 };

		int n = findMaxElementIndex(a);

		System.out.println(n);
		System.out.println(a[n]);

	}

	private static int findMaxElementIndex(int[] a) {
		if (a == null) {
			return -1;
		}
		if (a.length == 0) {
			return -1;
		}
		int indexOfElementWithMaxValue = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[indexOfElementWithMaxValue]) {
				indexOfElementWithMaxValue = i;
			}
		}

		return indexOfElementWithMaxValue;
	}

}
