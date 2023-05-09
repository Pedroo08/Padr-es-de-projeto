import java.util.ArrayList;
import java.util.List;

//Prototipo concreto / Concrate Prototype
// objeto do contruido pelo builder
public class Curso extends Produto implements Prototipo{
	
	
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
	
	
	Curso (Curso prototipo){
		this.disciplinas = new ArrayList<>();
		this.livros = new ArrayList<>();
		
		
		this.setNome( prototipo.getNome());
		this.setCodigo( prototipo.getCodigo());
		this.disciplinas =  prototipo.disciplinas;
		this.livros =  prototipo.livros;
		
		
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
	
	@Override
	public Curso clone () {
		
		
		return new Curso(this);
		
	};
	

}
