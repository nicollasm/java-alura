
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta contaNicollas = new Conta(1337, 22123);
		Cliente nicollas = new Cliente();
		contaNicollas.setTitular(nicollas);
		contaNicollas.getTitular().setNome("Nicollas Martins");
		contaNicollas.getTitular().setCpf("111.111.111-11");
		contaNicollas.getTitular().setProfissao("Desenvolvedor");
		contaNicollas.deposita(1200);
		
		Conta contaNayara = new Conta(1337, 22124);
		Cliente nayara = new Cliente();
		contaNayara.setTitular(nayara);
		contaNayara.getTitular().setNome("Nayara Marra");
		contaNayara.getTitular().setCpf("222.222.222-22");
		contaNayara.getTitular().setProfissao("Administradora");
		contaNayara.deposita(1000);
		
		contaNayara.transfere(200, contaNicollas);
		
		System.out.println(contaNicollas.getSaldo());
		System.out.println(contaNayara.getSaldo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Conta conta = new Conta();
//		// conta.numero = 1337;
//		conta.setNumero(1337);
//		System.out.println(conta.getNumero());
//
//		Cliente paulo = new Cliente();
//		// conta.titular = paulo;
//		paulo.setNome("paulo silveira");
//		conta.setTitular(paulo);
//		conta.deposita(300);
//
//		System.out.println(conta.getTitular().getNome());
//
//		conta.getTitular().setProfissao("programador");
//		// em duas linhas:
//		Cliente titularDaConta = conta.getTitular();
//		titularDaConta.setProfissao("programador");
//
//		System.out.println(titularDaConta);
//		System.out.println(paulo);
//		System.out.println(conta.getTitular());
//
//		Cliente nayara = new Cliente();
//		nayara.setNome("nayara marra");
//		conta.setTitular(nayara);
//		
//		System.out.println(conta.getTitular().getNome());
//		
//		conta.deposita(200);
//		System.out.println(conta.getSaldo());
		
		
		
		
	}
}
