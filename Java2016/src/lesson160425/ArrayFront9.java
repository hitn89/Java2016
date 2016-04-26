package lesson160425;

public class ArrayFront9 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 9, 3, 4 };
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (nums[i] == 9) {
				count++;
			}
		}
		if (count > 0)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
