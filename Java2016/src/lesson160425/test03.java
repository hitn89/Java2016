package lesson160425;

public class test03 {

	public static void main(String[] args) {

		String str = "xooxxxoxx";
		if (str.length() < 2) {
			System.out.println("0");
		} else {
			String result = "";
			int count = 0;
			String end = str.substring(str.length() - 2, str.length());
			for (int i = 0; i < str.length() - 2; i++) {
				result = str.substring(i, i + 2);
				if (result.equals(end)) {
					count++;
				}

			}
			System.out.println(count);
		}
	}

}
