package bigJumpTest;

import java.util.Scanner;

public class bigJumpSemIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a altura da bandeira: ");
		int alturaBandeira = sc.nextInt();

		System.out.println("Qual o valor do jump? ");
		int intensidadePulo = sc.nextInt();

		int resultado = alturaBandeira / intensidadePulo;
		int resto = alturaBandeira % intensidadePulo;
		int total = resultado + resto;
		
		System.out.println(total);
		
		sc.close();
	}

}
