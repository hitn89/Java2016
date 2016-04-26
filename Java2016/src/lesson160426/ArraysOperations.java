package lesson160426;

import java.util.Arrays;

public class ArraysOperations {

	public static void main(String[] args) {

		// 1 create создание

		int[] a = { 1, 2, 3 };

		a = new int[] { 4, 5, 6, 7, 8, 9 };

		a = new int[100];

		// 2 fill заполнение

		for (int i = 0; i < a.length; i++) {
			a[i] = 10;
		}

		java.util.Arrays.fill(a, 20); // заполнить все значения массива
										// двадцатками
		Arrays.fill(a, 20); // добавился import

		// 3 compair сравнение

		a = new int[] { 1, 2, 3 };
		int[] b = { 1, 2, 3 };

		System.out.println(a == b);
		System.out.println(a.equals(b));

		System.out.println(equal(a, b));
		
		boolean same = Arrays.equals(a, b);
		System.out.println(same);

	}

	static boolean equal(int[] x, int[] y) {

		if (x == y) {
			return true;
		}
		if (x == null || y == null) {
			return false;
		}
		if (x.length != y.length) {
			return false;
		}

		for (int i = 0; i < x.length; i++) {
			if (x[i] != y[i]) {
				return false;
			}
			return true;
		}

		return true;
	}
}
