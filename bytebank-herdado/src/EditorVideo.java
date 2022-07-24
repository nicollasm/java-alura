// Gerente é um funcionário (herda da classe funcionário)
public class EditorVideo extends Funcionario {
	

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Editor de Video");
		return 150;
	}

}
