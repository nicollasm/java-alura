package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosEx {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Jorge");
		alunos.add("Sergio");
		alunos.add("Marcelo");
		
		System.out.println(alunos.size());

		boolean adicionaPaulo = alunos.add("Paulos");
		System.out.println(adicionaPaulo);
		
		System.out.println(alunos.size());
		
		for(String aluno : alunos) {
			System.out.println(aluno);
		}
		
	}

}
