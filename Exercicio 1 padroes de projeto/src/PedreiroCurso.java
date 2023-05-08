


public class PedreiroCurso implements Pedreiro{
	
	Curso curso;
	
	
	PedreiroCurso(){
		this.resetar();
	}

	@Override
	public void resetar() {
		this.curso = new Curso();
		
	}
	
	
	public void addDisciplina(Disciplina disciplina){
		this.curso.setDisciplinas(disciplina);
		
	}
	public void addLivro(Livro livro){
		this.curso.setLivro(livro);
	}
	
	public void setNome(String Nome) {
		this.curso.setNome(Nome);
	}

	
	public void setCodigo(String codigo) {
		this.curso.setCodigo(codigo);;
	}
	
	public Curso getResultado() {
		
		return this.curso;
		
	}

}
