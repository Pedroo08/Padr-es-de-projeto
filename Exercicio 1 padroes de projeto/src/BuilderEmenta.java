
public class BuilderEmenta implements Builder{
	
	Ementa ementa;
	
	
	
	

	BuilderEmenta(){
		this.resetar();
	}

	@Override
	public void resetar() {
		this.ementa = new Ementa();
		
	}
	
	
	public void addDisciplina(Disciplina disciplina){
		this.ementa.setDisciplinas(disciplina);
		
	}
	public void addLivro(Livro livro){
		this.ementa.setLivro(livro);
	}
	
	public void setNome(String Nome) {
		this.ementa.setNome(Nome);
	}

	
	public void setCodigo(String codigo) {
		this.ementa.setCodigo(codigo);;
	}
	
	public Ementa getResultado() {
		
		return this.ementa;
		
	}
	
	

}
