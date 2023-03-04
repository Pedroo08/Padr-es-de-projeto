package prototype;

public class Retangulo extends Shape {
	
	int largura;
	int altura;
	
	
	public Retangulo() {
		
	}
	
	public Retangulo(Retangulo retangulo) {
		super();
		if (retangulo != null) {
			this.altura =retangulo.altura;
			this.largura = retangulo.largura;
			this.cor = retangulo.cor;
			}
	}
	
	@Override
	public Retangulo clone() {
		return new Retangulo(this);
	}
	

	//////Getters e setters
	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
	
	

}
