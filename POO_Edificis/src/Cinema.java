
public class Cinema extends Edificio {
	int aforamentMaxim;
	
	public Cinema(String nom, int plantes, int superficie, int aforamentMaxim) {
		super(nom, plantes, superficie);
		this.aforamentMaxim = aforamentMaxim;
	}
	public int getAforamentMaxim() {
		return aforamentMaxim;
	}
	public void setAforamentMaxim(int aforamentMaxim) {
		this.aforamentMaxim = aforamentMaxim;
	}
	public double calcularCostVigilancia() {
		double coste;
		coste = Math.ceil(getSuperficie()/3000);
		coste = coste * (1300); 
		return coste;
	}
	public void projectarSessio(int asist, float preu) {
	
		if (asist <= this.aforamentMaxim) {
		float recaudacio = asist*preu;
		System.out.print("S'han recaptat "+ recaudacio +" euros");
		} else System.out.print("No es pot superar l'aforament maxim");
	}
	public String toString() {
		String resultado = getNom() + ", de "+getSuperficie() + " m2 i "+getPlantes()+" plantes.";
		resultado = resultado + "\nTé "+getAforamentMaxim()+ " persones d'aforament maxim.";
		return resultado;
	}
	
}