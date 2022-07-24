
public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		Gerente nico = new Gerente();
		nico.setNome("Nicollas Martins");
		nico.setCpf("111.111.111-23");
		nico.setSalario(2600.00);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

		// nico.salario = 300.00;

	}

}
