package classwork160505;

public class Animal {

	private String name; // поле
	private String kind;
	private boolean isHungry = true;

	public Animal(String kind, String name) {
		this.kind = kind;
		this.name = name;
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
