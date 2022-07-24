
public class TransacaoUsuario {
	
	public static void main(String[] args) {
		Conta contaNicollas = new Conta();
		contaNicollas.titular = new Cliente();
		contaNicollas.titular.nome = "Nicollas";
		contaNicollas.titular.cpf = "111.111.111-11";
		contaNicollas.titular.profissao = "Testando";
		contaNicollas.depositar(2000);
		
		Conta contaNayara = new Conta();
		contaNayara.titular = new Cliente();
		contaNayara.titular.nome = "Nayara";
		contaNayara.titular.cpf = "123.123.123-22";
		contaNayara.titular.profissao = "Testando";
		
		contaNicollas.transferir(1000, contaNayara);
		
		System.out.println(contaNayara.saldo);
		System.out.println(contaNicollas.saldo);
	}
}
