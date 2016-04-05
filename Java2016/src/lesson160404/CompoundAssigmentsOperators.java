package lesson160404;

public class CompoundAssigmentsOperators {

	public static void main(String[] args) {
		
		int x = 2, y = 3;
		
		x = x + y;
		x += y;
		
		long n = 10;
		int m = 5;
		
	//	m = m + n;
		m *= n;
		
		long l = 5;
		long k = l = 3;
		System.out.println(l);
		System.out.println(k);
	}
	
}
