
public class TestaBanco {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.nome = "Nicollas Martins";
		c.cpf = "123.123.123-22";
		c.profissao = "Desenvolvedor";
		
		Conta contaDoNicollas = new Conta();
		contaDoNicollas.deposita(100);
		
		contaDoNicollas.titular = c;
		System.out.println(contaDoNicollas.titular.nome);
	}
}
