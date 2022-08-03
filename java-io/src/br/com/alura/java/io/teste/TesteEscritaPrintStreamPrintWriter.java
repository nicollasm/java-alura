package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));

		PrintWriter ps = new PrintWriter("lorem2.txt");
		ps.println("Olá, estou testando a inserção de linhas aqui.");
		ps.println();
		ps.println();
		ps.println();
		ps.println("just inserting another line");

		ps.close();

	}

}
