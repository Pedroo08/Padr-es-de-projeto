import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Registro de prototipo
public class Registro {
	
	static Registro registro;
	int id;
	
	private List<Prototipo> prototipos = new ArrayList<>();
	
	private Registro() {}
	
	public static Registro getRegistro(){
		
		if(registro == null) {
			registro = new Registro();
			registro.id = 1;
		}
		
		return registro;
	}
	
	public void indeficarSe() {
		System.out.println("Id do Registro: " + this.id);
	}
	
	public void Registrar(Prototipo prototipo) {
		this.prototipos.add(prototipo);
	}
	
	public Prototipo getPrototipo(String nome) {
		for(Prototipo p:prototipos) {
		
			if(p.getNome().equals(nome)) {
				return p;
				}
		}
		return null;
		
	}

}
