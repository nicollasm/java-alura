package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunosSemAcentos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");

		System.out.println(alunos.size());

		// tente adicionar um aluno que existe
		alunos.add("Pedro");

		System.out.println(alunos.size());

		boolean adicionou = alunos.add("Pedro");
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);
		
	}

}
