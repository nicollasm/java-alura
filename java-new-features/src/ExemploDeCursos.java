import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
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

public class ExemploDeCursos {

	public static void main(String[] args) {

		List<CursoEx> cursos = new ArrayList<CursoEx>();

		cursos.add(new CursoEx("Python ", 45));
		cursos.add(new CursoEx("JavaScript ", 150));
		cursos.add(new CursoEx("Java 8 ", 113));
		cursos.add(new CursoEx("C ", 55));

		cursos.sort(Comparator.comparingInt(CursoEx::getAlunos));

		int sum = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.mapToInt(CursoEx::getAlunos)
			.sum();

		System.out.println(sum);
		
	}
}
