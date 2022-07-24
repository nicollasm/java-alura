
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Nicollas Martins");
		g1.setCpf("111.111.111-22");
		g1.setSalario(2560.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		System.out.println(g1.getSenha());
		
		
	}

}
