package classwork160510;

import java.util.Random;

public class C {

	{
		System.out.println(" сделали еще один С");
	}

	public static void main(String[] args) {

		Random random = new Random();

		int max = random.nextInt(20);

		for (int i = 0; i < max; i++) {
			new D();
			new C();
		}


	}

}
