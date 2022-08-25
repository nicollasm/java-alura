import java.time.LocalDate;

public class Datas {

	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		
		LocalDate hoje = LocalDate.now();
		
		LocalDate aniversario = LocalDate.of(2022, 9, 7);
		
		int intervalo = hoje.getDayOfMonth() - aniversario.getDayOfMonth();
		
		System.out.println(intervalo);
		
		
	}

}
