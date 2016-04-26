package lesson160426;

public class Arrays3 {

	public static void main(String[] args) {

		String[] bugs = { "Light", "Sever", "Disaster" };
		String[] troubles;

		troubles = bugs;

		System.out.println(troubles);
		System.out.println(bugs);

		System.out.println(troubles == bugs);

	}

}
