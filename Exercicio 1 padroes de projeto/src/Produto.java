
public abstract class Produto {
	
	public String codigo;
	public String nome;
	
	
	
	public abstract void fale();
		
	
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
	
	

}
