import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestaCursos {

	public static void main(String[] args) {
		List<Cursos> cursos = new ArrayList<Cursos>();
		cursos.add(new Cursos("Python ", 45));
		cursos.add(new Cursos("JavaScript ", 150));
		cursos.add(new Cursos("Java 8 ", 113));
		cursos.add(new Cursos("C ", 55));

//		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
//		System.out.println(cursos);

//		Stream<Curso> streamDeCurso = cursos.stream();
//		streamDeCurso.filter(c -> c.getAlunos() > 100).forEach(c -> System.out.println(c.getNome()));

//		cursos.stream().filter(c -> c.getAlunos() > 100).forEach(c -> System.out.println(c.getAlunos()));
//		cursos.stream().filter(c -> c.getAlunos() > 100).forEach(System.out::println);
//		cursos.stream().filter(c -> c.getAlunos() > 100).map(c -> c.getAlunos()).forEach(c -> System.out.println(c)); // using lambda
//		cursos.stream().filter(c -> c.getAlunos() > 100).map(Curso::getAlunos).forEach(System.out::println);; // using method reference

//		IntStream stream = cursos.stream().filter(c -> c.getAlunos() > 100).mapToInt(Curso::getAlunos);
//		int soma = cursos.stream()
//				   .filter(c -> c.getAlunos() > 100)
//				   .mapToInt(Curso::getAlunos)
//				   .sum();
		
		
		int somaQtdeDeAlunosNosCursos = cursos.stream().filter(c -> c.getAlunos() > 100).mapToInt(Cursos::getAlunos).sum();
		System.out.println(somaQtdeDeAlunosNosCursos);
	}
	
}
