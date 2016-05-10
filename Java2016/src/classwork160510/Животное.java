package classwork160510;

public class Животное {

	private String name; // поле
	private String kind;
	private boolean isHungry = true;

	{ // блок инициализации
		System.out.println("Создано очередное животное");
	}

	public Животное(boolean h, String n, String k) {
		kind = k;
		name = n;
		isHungry = h;
	}

	public Животное(String kind) {
		this.kind = kind;
		name = "";
		isHungry = false;
	}

	public Животное(String kind, String name) {
		this(true, name, kind);
	}

	public Животное() {
		this(true, "Вася", "микроб");
		// kind = "микроб";
		// name = "";
		// isHungry = true;
	}

	public void feed(String food) { // метод экземпляра
		if (isHungry) {
			System.out.println(kind + " '" + name + "' ест " + food);
			isHungry = false;
		} else {
			System.out.println(kind + " '" + name + "' играет с " + food);
		}
	}

	public void play() {
		if (isHungry) {
			System.out.println(kind + " '" + name + "' обиделся и залез в коробку");
		} else {
			System.out.println(kind + " '" + name + "' играет, пока не проголодается");
			isHungry = true;
		}
	}

}
