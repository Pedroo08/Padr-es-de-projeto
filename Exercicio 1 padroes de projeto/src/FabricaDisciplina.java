
public class FabricaDisciplina  extends FabricaProdutos{

	@Override
	public Produto criarProduto( String nome, String codigo) {
		Disciplina disciplina =  new Disciplina();
		disciplina.setCodigo(codigo);
		disciplina.setNome(nome);
		return disciplina;
	}

}
