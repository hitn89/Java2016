package lesson160425;

public class arrayCount9 {

	public static void main(String[] args) {

		int[] nums = { 1, 9, 9, 3, 9 };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				count++;
			}
		}
		System.out.println(count);
	}

}
