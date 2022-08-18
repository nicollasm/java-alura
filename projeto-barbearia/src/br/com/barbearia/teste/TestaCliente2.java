package br.com.barbearia.teste;

import java.util.Scanner;

public class TestaCliente2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		Scanner in = new Scanner(System.in);

		System.out.println("Quantos clientes você deseja inserir? ");
		final int tamanho = sc.nextInt();
		sc.nextLine();
		int quantidadeAtual = 0;

		String nomes[] = new String[tamanho];
		Long telefones[] = new Long[tamanho];

		while (quantidadeAtual < tamanho) {
			System.out.println("Digite o nome: ");
			nomes[quantidadeAtual] = sc.nextLine();
			System.out.println("Digite o telefone: ");
			telefones[quantidadeAtual] = sc.nextLong();
			quantidadeAtual++;
			sc.nextLine();
		}

		sc.close();

//		String names[] = new String[tamanho];
//		long telNos[] = new long[tamanho];
//		System.out.println("Enter " + tamanho + " names and telephone numbers");
//		for (int i = 0; i < tamanho; i++) {
//			System.out.print("Enter Name: ");
//			names[i] = in.nextLine();
//			System.out.print("Enter telephone number: ");
//			telNos[i] = in.nextLong();
//			in.nextLine();
//		in.close();
	}

}
