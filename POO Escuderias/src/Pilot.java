
public class Pilot extends Treballador{
	private double alçada;
	private double pes;
	private int sou;
	


	public Pilot(String nom, String primerCognom, int edat, int antiguitatEscuderia, double alçada, double pes) {
		super(nom, primerCognom, edat, antiguitatEscuderia);
		this.alçada = alçada;
		this.pes = pes;
		this.sou = calculSouPilot();
	}
	public double getAlçada() {
		return alçada;
	}
	public void setAlçada(double alçada) {
		this.alçada = alçada;
	}
	public double getPes() {
		return pes;
	}
	public void setPes(double pes) {
		this.pes = pes;
	}
	public int getSou() {
	return sou;
	}
	public int calculSouPilot() {
	int souPilot = getSouBase()+(10000*getAntiguitatEscuderia())+50000; //50000 de perillositat y 10000 per any
	return souPilot;
	}
	@Override
	public String toString() {
		return "\nPilot "+ getNom()+ " " +getPrimerCognom()+"."+"\nTe "+getEdat()+" anys. Medeix "+ alçada + "metres i pesa " + pes + " kilos. \nTe un sou de " + sou +" i una antigitat de " + getAntiguitatEscuderia() + " anys.\n";
	}
}