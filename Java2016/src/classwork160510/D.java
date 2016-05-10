package classwork160510;

public class D {

	public static final int MAX = 20;

	static int счетчик; // поле класса

	int count = 0; // поле экземпляра
	{
		count++;
		счетчик++;
		// System.out.println("count = " + count);
		System.out.print("счетчик = " + счетчик);
	}

}
