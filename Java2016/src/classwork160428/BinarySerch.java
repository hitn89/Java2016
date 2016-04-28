package classwork160428;

import java.util.Arrays;

public class BinarySerch {

	public static void main(String[] args) {

		int[] a = { 10, 20, -2, 3, 0, 100, -500 };

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int result = binarySerch(a, 101);

		System.out.println(result);
		System.out.println(a[result]);

	}

	static int binarySerch(int[] x, int key) {
		// Код для двличного поиска в массиве Х

		int left = 0;
		int right = x.length - 1;
		
		while(left <= right){
			int mid = left + (right - left) / 2;
			if (x[mid] == key) {
				return mid;
			}
			if (x[mid] > key) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		int mesto = 0;

		if (left - 1 == right && left != key) {
			if (key < left) {
				mesto = left - 1;
			} else {
				mesto = -left;
			}
		}
		return mesto;
	}

}
