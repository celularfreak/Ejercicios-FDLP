

public class Mecanic extends Treballador {
	private boolean estudisSuperiors;
	private int sou;
	


	public Mecanic(String nom, String primerCognom, int edat, int antiguitatEscuderia, boolean estudisSuperiors) {
		super(nom, primerCognom, edat, antiguitatEscuderia);
		this.estudisSuperiors = estudisSuperiors;
		this.sou = calculSouMecanic();
	}

	public boolean isEstudisSuperiors() {
		return estudisSuperiors;
	}

	public void setEstudisSuperiors(boolean estudisSuperiors) {
		this.estudisSuperiors = estudisSuperiors;
	}
	public int getSou() {
		return sou;
	}
	
	public int calculSouMecanic() {
	int souMecanic = getSouBase()+(10000*getAntiguitatEscuderia()); //10000 per any
	return souMecanic;
	}
	public String devuelveEstudisSuperiors() {
		if (isEstudisSuperiors()==true) {
			return "Si";
		}else return "No";
	
}
	@Override
	public String toString() {
		return "\nMecanic "+ getNom()+ " " +getPrimerCognom()+"."+"\nTe "+getEdat()+" anys.\n"+devuelveEstudisSuperiors()+" te estudis de mecanica.\nTe un sou de " + sou +" euros i una antigitat de " + getAntiguitatEscuderia() + " anys.\n";
	}


}