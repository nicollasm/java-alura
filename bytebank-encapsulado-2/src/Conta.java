
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {

		if (agencia <= 0 || numero <= 0) {
			System.out.println("Conta invalida");
			return;
		}

		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
		System.out.println("Conta " + this.numero + " aberta com sucesso! " + Conta.total);

	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("O valor de saque é maior que o valor disponivel");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("A transferência foi realizada com sucesso.");
			return true;
		} else {
			System.out.println("Saldo insuficiente. Operação não concluida.");
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getConta() {
		return this.numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setConta(int numero) {
		if (numero <= 0) {
			return;
		}
		this.numero = numero;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("O valor da agência precisa ser positivo");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}
}
