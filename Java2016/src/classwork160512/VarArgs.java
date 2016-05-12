package classwork160512;

public class VarArgs {

	public static void main(String... args) {
		if (args.length == 0) {
			System.out.println("Ussage ......");
		}

		for (String argument : args) {
			System.out.println(argument);
		}
		
		// вызов вспомогательного метода
		helper(1,2,3);
		helper(1, 2, 3, 4);
		helper(1);
	}
		
	// method overload

	private static void helper(int... a) {
		for (int i : a) {
			System.out.print(i);
		}
		System.out.println();
	}

	// static void helper(int i, int j, int k) {
	// System.out.println("Helper:");
	// }

}
