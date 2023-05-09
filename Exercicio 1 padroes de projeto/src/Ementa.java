import java.util.ArrayList;
import java.util.List;

//objeto do builder
public class Ementa  {

	
	
	public String codigo;
	public String nome;
	private List<Disciplina> disciplinas;
	private List<Livro>livros;
	
	Ementa (){
		this.disciplinas = new ArrayList<>();
		this.livros = new ArrayList<>();
		
		
	}
	
	public void mostrarEmenta() {
		System.out.println("Ementa criado: " + this.nome + "-" +this.codigo);
		String st = this.toString();
		System.out.println(st);
	}

	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
