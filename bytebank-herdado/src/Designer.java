// Gerente é um funcionário (herda da classe funcionário)
public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Designer");
		return 200;
	}

}
