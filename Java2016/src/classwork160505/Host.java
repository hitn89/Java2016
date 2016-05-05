package classwork160505;

public class Host {

	public static void main(String[] args) {

		Animal Kittie = new Animal("Кот", "Барсик"); // создание объекта
		// Kittie.name = "Барсик"; // задаем имя
		// Kittie.kind = "Кот"; // задаем тип
		Kittie.feed("сосику"); // передаем сообщение
		Kittie.feed("сосикой"); // передаем сообщение
		Kittie.feed("сосикой"); // передаем сообщение
		Kittie.play();
		Kittie.play();
		// Kittie.isHungry = false;
		Kittie.play();

	}

}
