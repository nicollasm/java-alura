package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		alunos.add("Nicollas Martins");
		alunos.add("Nico Steppat");
		alunos.add("Paulo Silveira");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Paulo Silveira");

		System.out.println(alunos.size());

		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		System.out.println(pauloEstaMatriculado);

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
	}
}
