
public class Edificio {
	private String nom;
	private int plantes;
	private int superficie;
	
	public Edificio(String nom, int plantes, int superficie) {
		this.nom = nom;
		this.plantes = plantes;
		this.superficie = superficie;
	}

	public String getNom() {
		return nom;
	}

	public int getPlantes() {
		return plantes;
	}

	public int getSuperficie() {
		return superficie;
	}
	
	public double netejar() {
		double coste; 
		coste = Math.ceil(this.superficie/5);
		coste = coste + (this.plantes+0.5);
		return coste;
	}
}
