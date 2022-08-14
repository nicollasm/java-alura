package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {

        Collection<Integer> numeros = new HashSet<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 250000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = (fim - inicio) / 1000L;

//        long timeSeconds = TimeUnit.MILLISECONDS.toSeconds(tempoDeExecucao);
        
        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }
	
}
