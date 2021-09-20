
public class Revolver {
	private static int posicioActual;
	private static int  posicioBala;
	
	public Revolver() {
		posicioActual = (int)Math.random()*6+1;
		posicioBala = (int)Math.random()*6+1;
	}

	public static int getPosicioActual() {
		return posicioActual;
	}

	public static int getPosicioBala() {
		return posicioBala;
	}

	public boolean disparar() {
		boolean disparo = false;
		if (getPosicioActual()==getPosicioBala()) {
			disparo = true;
			return disparo;
		}else return disparo;
		}
	 
}

