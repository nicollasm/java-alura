package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String vazio = "        Alura  ";
//		String outrovazio = vazio.trim();
		
//		System.out.println(vazio.contains("Alura"));
//		System.out.println(outrovazio);
		
		String nome = "Alura";  
		String outro = new String("Alura");

		System.out.println(nome.length());
		int b = 0;
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
			b+=1;
			System.out.println(b);
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(0);
//		System.out.println(c);
		
//		char c = 'A';
//		char d = 'a';
//		String outra = nome.replace(c, d);

//		String outra = nome.toUpperCase();
		
//		nome.toLowerCase( );
		
//		System.out.println(nome);
//		System.out.println(outra);

	}

}
