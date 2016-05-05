package classwork160505;

public class test {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 4, 5, 6, 20 };

		int b = indexMax(x);

		System.out.println(b);

	}

	private static int indexMax(int[] x) {
		if (x == null) {
			return -1;
		}
		if (x.length == 0) {
			return -1;
		}

		int maxIndex = 0;

		for (int i = 0; i < x.length; i++) {
			if (x[i] > x[maxIndex]) {
				maxIndex = i;
			}
		}

		return maxIndex;

	}

}
