package lesson160404;

public class IncementDecrementExamples {

	public static void main(String[] args) {
		
		int counter = 0;
		
		System.out.println(counter);
		System.out.println(++counter);
		System.out.println(counter);
		System.out.println(counter--);
		System.out.println(counter);
		
		
		int x = 3;
		
		int y = ++x * 5 / x-- + --x;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		x++;
		
		
	}
	
}