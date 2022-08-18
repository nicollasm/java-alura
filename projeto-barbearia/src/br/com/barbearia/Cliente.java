package br.com.barbearia;

public class Cliente {

	private String nomeCliente;
	private String telefoneCliente;
	private String enderecoCliente;
	
	public Cliente() {
		
	}
	
	public Cliente(String nomeCliente, String telefoneCliente) {
		
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public String getEnderecoCliente() {
		return this.enderecoCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	@Override
	public String toString() {
		return "O nome do cliente é: " + this.nomeCliente + ", telefone: " + this.telefoneCliente;
	}
	
}
