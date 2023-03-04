package prototype;

public class Circulo extends Shape {
	
int raio;
	
	public Circulo() {
		
	}
	
	 public Circulo(Circulo circulo) {
		super();
		if (circulo != null) {
			this.raio = circulo.raio;
			this.cor = circulo.cor;
		}
	}

	@Override
	public Circulo clone() {
		return new Circulo(this);
	}
	
	
	
	//////Getters e setters
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	
	
	
	
}
