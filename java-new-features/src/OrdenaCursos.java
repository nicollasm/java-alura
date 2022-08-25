import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		cursos.add(new CursoEx("C#", 15));
		cursos.add(new CursoEx("Python", 121));
		cursos.add(new CursoEx("Java", 219));

//		cursos.sort(Comparator.comparing(CursoEx::getAlunos).reversed());

//		cursos.stream().map(CursoEx::getAlunos).forEach(System.out::println);

//		cursos.stream().filter(c -> c.getAlunos() > 50).map(CursoEx::getAlunos).forEach(System.out::println);

//		System.out.println("----");

//		cursos.stream().filter(c -> c.getAlunos() > 50).map(c -> c.getNome()).forEach(System.out::println);
//		cursos.stream().filter(c -> c.getAlunos() > 50).map(CursoEx::getAlunos).forEach(System.out::println);

//		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getAlunos()));

//		System.out.println("----");

//		cursos.stream().map(CursoEx::getNome).forEach(System.out::println);

//		OptionalDouble average = cursos.stream().mapToInt(CursoEx::getAlunos).average();
//		System.out.println(average);

//		Stream<CursoEx> stream = cursos.stream().filter(c -> c.getAlunos() > 50);
//		
//		List<CursoEx> stream = cursos.stream()
//				   .filter(c -> c.getAlunos() > 50)
//				   .collect(Collectors.toList())
//				   .forEach(System.out::println);
		
		List<CursoEx> cursosFiltrados = cursos.stream()
				   .filter(c -> c.getAlunos() > 50)
				   .collect(Collectors.toList());
		System.out.println(cursosFiltrados);
				
		
	}

}
