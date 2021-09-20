
public class Cuenta {
	private int numCuenta;
	private int saldo;
	private String nombre;
	private String apellido;
	
	
	public Cuenta() {
		
	}
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
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public Cuenta(int numCuenta, String nombre, String apellido) {
	
		this.numCuenta = numCuenta;
		this.saldo = 0;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void ingresar(int cantidad){
		saldo = saldo + cantidad;
		}
		public void retirar(int cantidad){
		saldo = saldo - cantidad;
		}


		@Override
		public String toString() {
			return "Cuenta " + numCuenta + ". Saldo=" + saldo +"\n";
		}
}


