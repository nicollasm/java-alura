package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

//		Conta cc1 = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(22, 23);
//		
//		boolean compara = cc2.ehIgual(cc1);
//		
//		System.out.println(compara);
		
		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}
}
