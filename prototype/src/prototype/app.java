package prototype;

public class app {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		r1.altura= 2;
		r1.largura = 4;
		r1.cor ="Rosa";
		
		Circulo c1 = new Circulo();
		c1.raio = 3;
		c1.cor ="Vermelho";
		
		
		Retangulo rClone = r1.clone();
		Circulo cClone = c1.clone();
		
		System.out.println("Prototipo Circulo: " + "Raio: " +c1.raio +" Cor: "+ c1.cor+ 
				"\nClone: "+ "Raio " + cClone.raio + " Cor: "+ cClone.cor);
		
		System.out.println(" " );
		System.out.println("Prototipo Retângulo: " + "Largura: " +r1.largura + " Altura: " + r1.altura
				+" Cor: "+ r1.cor+
				
				"\nClone: "+ "Largura " + rClone.largura + " Altura: "+rClone.altura +  " Cor: "+ rClone.cor);
				
				
			

	}

}
