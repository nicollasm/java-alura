

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsIterator {

	public static void main(String[] args) {

		List<String> programmingLanguages = new ArrayList<String>();
		programmingLanguages.add("Zeno");
		programmingLanguages.add("Python");
		programmingLanguages.add("C#");
		programmingLanguages.add("Java");
		programmingLanguages.add("C++");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("Delphi");
		
		System.out.println("Array sem ordenação: ");
		for (String linguagem : programmingLanguages) 
			System.out.println(linguagem);
		System.out.println("----------------------");

		System.out.println("Array aleatório: ");
		Collections.shuffle(programmingLanguages);
		for (String linguagem : programmingLanguages) 
			System.out.println(linguagem);
		System.out.println("----------------------");

		System.out.println("Array rotacionado: ");
		Collections.rotate(programmingLanguages, 1);
		for (String linguagem : programmingLanguages) 
			System.out.println(linguagem);
		System.out.println("----------------------");
	}

}


