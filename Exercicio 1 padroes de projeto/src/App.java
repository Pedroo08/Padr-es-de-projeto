
public class App {

	public static void main(String[] args) {
		//Factory Method
		FabricaProdutos fabrica = new FabricaLivro();
		
		
		Produto produto = fabrica.getProduto(Tipo.DISCIPLINA, "Criacionais", "2456");
		Produto produto2 = fabrica.getProduto(Tipo.LIVRO, "DP-vol1", "7566");
		
		Livro Dp2 = (Livro) fabrica.getProduto(Tipo.LIVRO, "DP-vol2", "7566");
		Disciplina comportamentais =  (Disciplina) fabrica.getProduto(Tipo.DISCIPLINA, "Comportamentais", "7566");
		
		produto.fale();
		produto2.fale();
	//Builder
		PedreiroCurso BCurso = new PedreiroCurso();
		PedreiroEmenta BEmenta = new PedreiroEmenta();
		
		BCurso.resetar();
		BCurso.setNome("Redesign Partterns ");
		BCurso.setCodigo("78456");
		BCurso.addDisciplina(comportamentais);
		BCurso.addLivro(Dp2);
		BCurso.addDisciplina((Disciplina) produto);
		Curso curso1 = BCurso.getResultado();
		curso1.fale();
		
		
		BEmenta.resetar();
		BEmenta.setNome("Redesign Partterns ");
		BEmenta.setCodigo("78456");
		BEmenta.addDisciplina(comportamentais);
		BEmenta.addLivro(Dp2);
		BEmenta.addDisciplina((Disciplina) produto);
		Ementa ementa1 = BEmenta.getResultado();
		ementa1.mostrarEmenta();
	
		
		
	}

}
