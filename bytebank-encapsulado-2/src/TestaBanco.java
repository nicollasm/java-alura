
public class TestaBanco {

	public static void main(String[] args) {
		Conta contaNicollas = new Conta(1337, 20200);
		Cliente nicollas = new Cliente();
		contaNicollas.setTitular(nicollas);
		contaNicollas.getTitular().setNome("Nicollas Martins");
		contaNicollas.deposita(1000);
		contaNicollas.setAgencia(1337);

		Conta contaNayara = new Conta(1337, 20201);
		Cliente nayara = new Cliente();
		contaNayara.setTitular(nayara);
		contaNayara.getTitular().setNome("Nayara Marra");
		
		Conta conta1 = new Conta(123, 123);
		Conta conta2 = new Conta(123, 123);
		Conta conta3 = new Conta(-123, 123);
		Conta conta4 = new Conta(123, 123);
		
		contaNicollas.transfere(800, contaNayara);
		System.out.println("O saldo da conta é: " + contaNicollas.getSaldo());
		System.out.println(contaNayara.getSaldo());
		System.out.println(Conta.getTotal());
		
		
		
	}
}
