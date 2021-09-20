
public class Punt {
	
	private double posicioX;
	private double posicioY;
	
	
	public double getPosicioX() {
		return posicioX;
	}
	public void setPosicioX(double posicioX) {
		this.posicioX = posicioX;
	}
	public double getPosicioY() {
		return posicioY;
	}
	public void setPosicioY(double posicioY) {
		this.posicioY = posicioY;
	}
	
	public Punt(double posicioX, double posicioY) {
		
		this.posicioX = posicioX;
		this.posicioY = posicioY;
	}
	@Override
	public String toString() {
		return "Punt [posicioX=" + posicioX + ", posicioY=" + posicioY + "]";
	}
	

	
	
	
}
