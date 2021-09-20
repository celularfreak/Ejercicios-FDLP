

import java.util.List;

public class Cliente {
	private String nombre;
	private String apellido;
	private List <Cuenta> cuentas;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	public void agregarCuenta(Cuenta cuenta) {
		this.cuentas.add(cuenta);
	}

	@Override
	public String toString() {
		return "Client " + nombre + " " + apellido + "\nComptes:\n" + cuentas+"\n";
	}


	

	
	
}
