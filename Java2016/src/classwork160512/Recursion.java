package classwork160512;

public class Recursion {

	public static void main(String[] args) {
		Object o = new Object();
		o.toString();
		a();

		d(0);

	}

	static void d(int n) {
		System.out.println("depth= " + n++);
		d(n);
	}

	private static void a() {
		System.out.println("a");
		b();
	}

	private static void b() {
		System.out.println("b");
		c();
	}

	private static void c() {
		System.out.println("c");
		new Exception().printStackTrace();
	}

}
