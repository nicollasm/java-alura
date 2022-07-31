package bigJumpTest;


import java.util.Scanner;

public class bigJump {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura da bandeira: ");
		int flagHeight = sc.nextInt();
		System.out.println("Qual o valor do bigjump?");
		int bigJump = sc.nextInt();
		
		if (bigJump == 1) {
			int resultado = flagHeight / bigJump;
			System.out.println(resultado);
		} else {
			int parcial = flagHeight / bigJump;
			int rest = flagHeight % bigJump;
			int resultado = parcial + rest;
			System.out.println(resultado);
			System.out.println(rest);
		}
		sc.close();

	}
	

}
