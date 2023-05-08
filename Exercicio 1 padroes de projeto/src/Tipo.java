

public enum Tipo {
	LIVRO(new FabricaLivro()),
	DISCIPLINA(new FabricaDisciplina());

	
	FabricaProdutos fabrica;
	
	Tipo (FabricaProdutos fabrica){
		this.fabrica = fabrica;
	}
	
	
	public FabricaProdutos getFabrica() {
		
		return this.fabrica;
	}
}
