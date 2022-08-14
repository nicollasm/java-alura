package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListasEx {

	public static void main(String[] args) {
		
		String curso1 = "Orientação a objetos";
		String curso2 = "Polimorfismo";
		String curso3 = "Lambda expressions";
		
		ArrayList<String> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);

		System.out.println(cursos);
		
//		cursos.remove(curso3);
		
		System.out.println(cursos);
		
		System.out.println(cursos.get(0));
		
		Collections.sort(cursos);
		
		System.out.println(cursos);
		
		System.out.println("---------");
		
		cursos.forEach(curso -> {
			System.out.println(curso);
		});
	}

}
