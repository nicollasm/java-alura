
public class TesteClasse {
	
	public static void main(String[] args) {
		Conta contaNicollas = new Conta();
		contaNicollas.titular = new Cliente();
		contaNicollas.titular.nome = "Nicollas Martins";
		contaNicollas.titular.cpf = "222.222.222-22";
		contaNicollas.titular.profissao = "Desenvolvedor";
		
		System.out.println("O nome do titular é: " + contaNicollas.titular.nome);
		System.out.println("O CPF do titular é: " + contaNicollas.titular.cpf);
		System.out.println("A profissao é: " + contaNicollas.titular.profissao);
		
		Conta contaNayara = new Conta();
		contaNayara.titular = new Cliente();
		contaNayara.titular.nome = "Nayara Marra";
		contaNayara.titular.cpf = "111.111.111-22";
		contaNayara.titular.profissao = "Nenhuma";
		
		System.out.println("O nome do titular é: " + contaNayara.titular.nome);
		System.out.println("O CPF do titular é: " + contaNayara.titular.cpf);
		System.out.println("A profissao é: " + contaNayara.titular.profissao);
	}
}
