
public class Treballador {

	private String nom;
	private String primerCognom;
	private int edat;
	private int antiguitatEscuderia;
	int souBase;
	
	
	public Treballador(String nom, String primerCognom, int edat, int antiguitatEscuderia) {
		
		this.nom = nom;
		this.primerCognom = primerCognom;
		this.edat = edat;
		this.antiguitatEscuderia = antiguitatEscuderia;
		this.souBase = 50000;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrimerCognom() {
		return primerCognom;
	}
	public void setPrimerCognom(String primerCognom) {
		this.primerCognom = primerCognom;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	public int getAntiguitatEscuderia() {
		return antiguitatEscuderia;
	}
	public void setAntiguitatEscuderia(int antiguitatEscuderia) {
		this.antiguitatEscuderia = antiguitatEscuderia;
	}
	public int getSouBase() {
		return souBase;
	}
	public void setSouBase(int souBase) {
		this.souBase = souBase;
	}
	@Override
	public String toString() {
		return "Treballador [nom=" + nom + ", primerCognom=" + primerCognom + ", edat=" + edat
				+ ", antiguitatEscuderia=" + antiguitatEscuderia + ", souBase=" + souBase + ", getNom()=" + getNom()
				+ ", getPrimerCognom()=" + getPrimerCognom() + ", getEdat()=" + getEdat()
				+ ", getAntiguitatEscuderia()=" + getAntiguitatEscuderia() + ", getSouBase()=" + getSouBase()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
