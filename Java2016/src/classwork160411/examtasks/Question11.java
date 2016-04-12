package classwork160411.examtasks;

public class Question11 {

	public static void main(String[] args) {

		int x = 5 * 4 % 3;
		System.out.println(x);
		// otvet 2
		int y = 5 % 4 * 3; // равнозначные операции идут по порядку слева
		System.out.println(y);
		int z = 5 + 6 >> 1; // приритет у сложения
		System.out.println(z);
	}

}
