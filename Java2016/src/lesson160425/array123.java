package lesson160425;

public class array123 {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 3, 1 };
		for (int i = 0; i < (nums.length - 2); i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
				System.out.println("true");
			}
		System.out.println("flase");
	}

}
