package lesson160331;

public class PrimitiveTypes {

	public static void main(String[] args) {
		
		byte b = 1;  // 8 bits == 1 byte
		b = Byte.MAX_VALUE;
		b = Byte.MIN_VALUE;
		
		short s = 34;  // 16 bits == 2 bytes
		s = Short.MAX_VALUE;
		s = Short.MIN_VALUE;
	
		int i = 10;  // 32 bits == 4 bytes
		i = Integer.MAX_VALUE;
		i = Integer.MIN_VALUE;
		
		long d = 1000000L;  // 64 bits  == 8 bytes
		d = Long.MAX_VALUE;
		d = Long.MIN_VALUE;
		
		char f = 50;  // 16 bits
		f = 'A';
		f = '\002';
		f = 35;  f++;
	//	f = -1; only +
		System.out.println(f);
		f = Character.MAX_VALUE;
		f = Character.MIN_VALUE;
		
		float z = 123.4f;  // 32 bits == 4 bytes
		System.out.println(z);
		z = Float.MAX_VALUE;
		z = Float.MIN_VALUE;

		double x = 321.3;  // 64 bits
		System.out.println(x);
		x = Double.MAX_VALUE;
		x = Double.MIN_VALUE;
		
		boolean y = true; // true false
	//	y = Boolean.
	}
	
}
		
		
