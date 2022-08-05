package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura3 {

	public static void main(String[] args) throws Exception {
		
//		Locale.setDefault(new Locale("en", "US"));
		Scanner scanner = new Scanner(new File("contas.csv"));

//		System.out.println(linha);

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble();

//			String valorFormatado = String.format("%s: %04d-%08d, %20s, %8.2f", tipoConta, agencia, numero, titular, saldo);

			System.out.printf(String.format(new Locale("pt", "BR"),
					"%s: %04d-%08d, %20s: %8.2f %n", tipoConta, agencia, numero, titular, saldo));
			
			linhaScanner.close();

		}
		scanner.close();
	}

}
