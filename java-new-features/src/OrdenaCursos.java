import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CursoEx {

	private String nome;
	private int alunos;
	
	public CursoEx(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}


public class OrdenaCursos {

	public static void main(String[] args) {

		List<CursoEx> cursos = new ArrayList<CursoEx>();
		cursos.add(new CursoEx("HTML", 33));
		cursos.add(new CursoEx("C#", 5));
		cursos.add(new CursoEx("Python", 121));
		cursos.add(new CursoEx("Java", 219));
		
//		cursos.sort(Comparator.comparing(CursoEx::getAlunos).reversed());
		
//		cursos.stream().map(CursoEx::getAlunos).forEach(System.out::println);
		
		cursos.stream().filter(c -> c.getAlunos() > 50).map(CursoEx::getAlunos).forEach(System.out::println);
		
		System.out.println("----");
		
//		cursos.stream().filter(c -> c.getAlunos() > 50).map(c -> c.getNome()).forEach(System.out::println);
		cursos.stream().filter(c -> c.getAlunos() > 50).map(CursoEx::getAlunos).forEach(System.out::println);
		
//		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getAlunos()));
		
		System.out.println("----");
		
		cursos.stream().map(CursoEx::getNome).forEach(System.out::println);
		
		
		

	}

}

