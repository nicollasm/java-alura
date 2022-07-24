
public class TestaContas {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 23334);

		// System.out.println(conta.getAgencia());

		Conta conta2 = new Conta(1337, 24227);
		Conta conta3 = new Conta(1337, 24228);
		Conta conta4 = new Conta(1337, 24229);
		Conta conta5 = new Conta(1337, 24230);

		System.out.println(Conta.getTotal());
	}
}
