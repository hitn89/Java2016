package classworks160504;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {

		int[] a;

		a = new int[10];

		ArrayList<Integer> intArray1 = new ArrayList<Integer>();
		ArrayList<Integer> intArray2 = new ArrayList<>(); // динамический массив

		intArray1.add(10);
		intArray1.add(20);
		intArray1.add(30);
		intArray1.add(40);

		for (Integer integer : intArray1) {
			System.out.print(integer + ",");
		}
		System.out.println("--" + intArray1.size());
		// --- вставка в конец
		intArray1.add(50);

		for (Integer integer : intArray1) {
			System.out.print(integer + ",");
		}
		System.out.println("--" + intArray1.size());
		// --- вставка в начало
		intArray1.add(0, 0);

		for (Integer integer : intArray1) {
			System.out.print(integer + ",");
		}
		System.out.println("--" + intArray1.size());
		// --- вставка на 4 место
		intArray1.add(4, 35);
		for (Integer integer : intArray1) {
			System.out.print(integer + ",");
		}
		System.out.println("--" + intArray1.size());
		// --- удалить 5 пункт
		intArray1.remove(5);
		for (Integer integer : intArray1) {
			System.out.print(integer + ",");
		}
		System.out.println("--" + intArray1.size());
		// --- найти индекс
		int indexOf30 = intArray1.indexOf(30);
		// удалить по индексу
		intArray1.remove(indexOf30);
		// удалить значение 20
		intArray1.remove((Integer) 20);
		for (Integer integer : intArray1) {
			System.out.print(integer + ",");
		}
		System.out.println("--" + intArray1.size());

		// вывод через for
		for (int i = 0; i < intArray1.size(); i++) {
			System.out.println(intArray1.get(i));
		}

		for (int i = 0; i < intArray1.size(); i++) {
			intArray1.set(i, i * 100);
			System.out.println(intArray1.get(i));
		}

		System.out.println(intArray1.isEmpty());
		System.out.println(intArray2.isEmpty());

		intArray1.clear();
		System.out.println(intArray1.isEmpty());
		System.out.println(intArray1.size());
	}

}
