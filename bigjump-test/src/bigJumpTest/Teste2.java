package bigJumpTest;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int alturaBandeira = sc.nextInt();
		int bigJump = sc.nextInt();
		
		if (bigJump == 1) {
			int resultado = alturaBandeira/bigJump;
			System.out.println(resultado);
		} else {
			int quantidadeSaltos = alturaBandeira/bigJump;
			int diferenca = alturaBandeira % bigJump;
			int totalSaltos = diferenca + quantidadeSaltos;
			System.out.println(totalSaltos);
		}
		
		sc.close();
		
	}

}