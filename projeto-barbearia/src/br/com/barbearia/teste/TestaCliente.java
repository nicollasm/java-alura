package br.com.barbearia.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.barbearia.Cliente;

public class TestaCliente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		System.out.println("Qual o nome do Cliente que você deseja cadastrar? ");
		String nomeIn = sc.nextLine();
		System.out.println("Agora digite o telefone: ");
		String telefoneIn = sc.nextLine();

		Cliente c1 = new Cliente();
		c1.setNomeCliente(nomeIn);
		c1.setTelefoneCliente(telefoneIn);
		
		
		
		clientes.add(c1);
		
		clientes.stream().forEach((cliente) -> {
			System.out.println(cliente);
		});
		
	}

}
