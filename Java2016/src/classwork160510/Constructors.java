package classwork160510;

public class Constructors {

	public static void main(String[] args) {

		// {
		// int a = 0;
		// }
		//
		// String s = "Hello";

		Животное dog = new Животное("собака", "Шарик"); // HEAP куча

		dog.play();
		
		Животное[] mikrob = { new Животное(), new Животное(), new Животное() };

		mikrob[1].feed("человеченку");
	}

}
