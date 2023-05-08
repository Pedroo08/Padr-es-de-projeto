public abstract class FabricaProdutos {
	
	public Produto getProduto (Tipo tipo,String nome,String codigo) {
		
		FabricaProdutos fabrica =  tipo.getFabrica();
		Produto produto = fabrica.criarProduto(nome, codigo);
		return produto;
		
	}
	
	abstract public Produto criarProduto(String nome,String codigo);
}