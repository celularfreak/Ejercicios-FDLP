
public class Hotel extends Edificio {
	private int habitacion;

	public Hotel(String nom, int plantes, int superficie, int habitacion) {
		super(nom, plantes, superficie);
		this.habitacion = habitacion;
	}
	
	public int getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}

	public double calcularCostVigilancia() {
		double coste;
		coste = Math.ceil(getSuperficie()/1000);
		coste = coste * (1300+500); //1300 sou i plus de 500 perillositat
		return coste;
	}
	public void serveiHabitacions() {
		int persones;
		int coste;
		String mensaje;
		persones = (int) Math.ceil(getHabitacion()/20);
		coste = persones*1000;
		mensaje = "Es necesiten "+ persones+ " persones per netejar aquest hotel.\n";
		mensaje = mensaje + "El coste de la limpieza será de "+coste+".";
				
		System.out.println(mensaje);
		
		
	}

	@Override
	public String toString() {
		String resultado = getNom() + ", de "+getSuperficie() + " m2 i "+getPlantes()+" plantes.";
		resultado = resultado + "\nTé "+getHabitacion()+ " habitacions.";
		
		return resultado;
	}
}
