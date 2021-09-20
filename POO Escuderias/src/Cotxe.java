
public class Cotxe {
	int potencia;
	int velocitatMax;
	String color;
	int preuMercat;
	
	
	public Cotxe(int potencia, int velocitatMax, String color, int preuMercat) {
	
		this.potencia = potencia;
		this.velocitatMax = velocitatMax;
		this.color = color;
		this.preuMercat = preuMercat;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getVelocitatMax() {
		return velocitatMax;
	}
	public void setVelocitatMax(int velocitatMax) {
		this.velocitatMax = velocitatMax;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPreuMercat() {
		return preuMercat;
	}
	public void setPreuMercat(int preuMercat) {
		this.preuMercat = preuMercat;
	}
	@Override
	public String toString() {
		return "El Cotxe te una potencia de "+ potencia + " caballs.\nLa seva velocitat maxima es de " + velocitatMax + " Km/h.\nEs de color " + color + " i el seu preu de mercat es de "
				+ preuMercat + " euros.\n";
	}

	
	
}
