package lesson160405;

public class IfStatmentsExamples {

	public static void main(String[] args) {

		int x = 20;
		int y = 30;
		if (x < y)
			System.out.println("Less than");
		else
			System.out.println("Greater than");

		boolean isLessThan = x < y;
		
		if (isLessThan){
			System.out.println("I have cheked bla bla bla");
			System.out.println("Less than");
		}
		else{
			System.out.println("Greater than");
		}
		}
		

}
