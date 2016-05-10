package classwork160510;

public class A {

	String state = "";

	{
		System.out.println(state);
		state = "начало";
		System.out.println(state);
	}

	public A() {
		System.out.println(state);
		state = "конструктор";
		System.out.println(state);
	}

	public A(String x) {
		this();
		state = x;
		System.out.println(x);
	}

	public A(int n) {
		System.out.println("n=" + n);
	}

	public static void main(String[] args) {
		A a = new A(0);
	}

}
