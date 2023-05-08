public class FabricaLivro extends FabricaProdutos {

	@Override
	public Produto criarProduto( String nome, String codigo) {
		
		Livro livro =  new Livro();
		livro.setCodigo(codigo);
		livro.setNome(nome);
		return livro;
	}


	

}
