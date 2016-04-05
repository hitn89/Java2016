package lesson160404;

public class TypeCasting {

	public static void main(String[] args) {
		
		int x = 1;
		
		double d = 1;  // не явное преобразование
		
		int y = (int)1.3;  // заставляем откинуть дробную часть
		
		int x2 = (int) (10.0f / 3.0f);
		
		short s = (short)1921222;
		
		System.out.println(Integer.toBinaryString(1921222));
		System.out.println(Integer.toBinaryString((short)1921222));
		
		short x1 = 10;
		short y1 = 3;
		short z = (short)(x1 * y1);
	}
	
}
