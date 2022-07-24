
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("223.355.646-99");
		nico.setSalario(2590.80);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}

}
