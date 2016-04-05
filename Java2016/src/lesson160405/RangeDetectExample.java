package lesson160405;

import java.util.Arrays;

public class RangeDetectExample {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage:  EvenOddExample <number>");
			System.exit(0);
		}

		String argsList = Arrays.toString(args);
		System.out.println(argsList);

		int x = Integer.parseInt(args[0]);

		if (x <= 20 && x >= 10) {
			System.out.println("�����!");
		} 
		
		if (x >= 20 || x <= 10) {
			System.out.println("����");
		}

	}

}
