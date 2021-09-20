package m8exercici2;

public class Hotels {

	private String nom;
	private int numHab;
	private int numPlant;
	private String supTotal;
	
	
	public Hotels(String nom, int numHab, int numPlant, String supTotal) {
		this.nom = nom;
		this.numHab = numHab;
		this.numPlant = numPlant;
		this.supTotal = supTotal;
	}
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	
	public int getNumHab() {return numHab;}
	public void setNumHab(int numHab) {this.numHab = numHab;}
	
	public int getNumPlant() {return numPlant;}
	public void setNumPlant(int numPlant) {this.numPlant = numPlant;}
	
	public String getSupTotal() {return supTotal;}
	public void setSupTotal(String supTotal) {this.supTotal = supTotal;}

	public int calcularManteniment() {
		int persNes = (numPlant*numHab)/20 ;
		persNes = persNes*1500;
		return persNes;
	}
	@Override
	public String toString() {
		return "Nom: " + nom + "\n Numero d'habitacions: " + numHab + "\n Numero de plantes: " + numPlant + "\n Superficie Total: " + supTotal
				+ "\n Calcul cost manteniment: " + calcularManteniment();
	}
	
}

