package br.com.nicollas.exercicios;

import java.util.Set;
import java.util.TreeSet;

public class TesteRecibo {

	public static void main(String[] args) {

		Recibo rec1 = new Recibo("Teste 1", 333.33);
		Recibo rec2 = new Recibo("Teste 2", 444.44);
		Recibo rec3 = new Recibo("Teste 3", 555.55);
		
		Set<Recibo> recibos = new TreeSet<>();
		recibos.add(rec1);
		recibos.add(rec2);
		recibos.add(rec3);
		
		for (Recibo recibo : recibos) {
			System.out.println(recibo);
		}
		
		recibos.forEach(recibo -> {
			System.out.println(recibo);
		});
		
	}

}
