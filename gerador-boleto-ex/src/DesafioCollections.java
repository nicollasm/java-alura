

import java.util.ArrayList;
import java.util.Collections;

public class DesafioCollections {

	public static void main(String[] args) {

		ArrayList<Object> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("Zeno");
		programmingLanguages.add("Python");
		programmingLanguages.add("C#");
		programmingLanguages.add("Java");
		programmingLanguages.add("C++");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("Delphi");

		System.out.println("Array sem ordenação: ");
		for (int i = 0; i < programmingLanguages.size(); i++) {
			System.out.println(programmingLanguages.get(i));
		}
		System.out.println("----------------------");

		System.out.println("Array aleatório: ");
		Collections.shuffle(programmingLanguages);
		for (int i = 0; i < programmingLanguages.size(); i++) {
			System.out.println(programmingLanguages.get(i));
		}
		System.out.println("----------------------");

		System.out.println("Array rotacionado: ");
		Collections.rotate(programmingLanguages, 1);
		for (int i = 0; i < programmingLanguages.size(); i++) {
			System.out.println(programmingLanguages.get(i));
		}
		System.out.println("----------------------");

		programmingLanguages.sort(null);
		System.out.println("Array ordenado alfabeticamente: ");
		for (int i = 0; i < programmingLanguages.size(); i++) {
			System.out.println(programmingLanguages.get(i));
		}
		System.out.println("----------------------");

	}
}
