import java.util.ArrayList;
import java.util.List;

public class Curso extends Produto{
	
	
	private List<Disciplina> disciplinas;
	private List<Livro>livros;
	

	@Override
	public void fale() {
		System.out.println("Curso criado: " + this.nome + "-" +this.codigo);
		String st = this.toString();
		System.out.println(st);
		
	}
	
	
	Curso (){
		this.disciplinas = new ArrayList<>();
		this.livros = new ArrayList<>();
		
		
	}
	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	public List<Livro> getLivros() {
		return livros;
	}
	
	public void setLivro(Livro livro) {
		this.livros.add(livro);
	}
	
	
	@Override
	public String toString() {
		return "Curso [disciplinas=" + disciplinas + ", livros=" + livros + ", codigo=" + codigo + ", nome=" + nome
				+ "]";
	}
	
	

}
