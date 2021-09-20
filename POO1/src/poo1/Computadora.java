package poo1;

public class Computadora {
	
	String marca;
	String model;
	String procesador;
	String memoriaRAM;
	String capacitatHDD;
	
	public Computadora() {
		
	}

	public Computadora(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}

	public Computadora(String marca, String model, String procesador, String memoriaRAM, String capacitatHDD) {
		this.marca = marca;
		this.model = model;
		this.procesador = procesador;
		this.memoriaRAM = memoriaRAM;
		this.capacitatHDD = capacitatHDD;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(String memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public String getCapacitatHDD() {
		return capacitatHDD;
	}

	public void setCapacitatHDD(String capacitatHDD) {
		this.capacitatHDD = capacitatHDD;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", model=" + model + ", procesador=" + procesador + ", memoriaRAM="
				+ memoriaRAM + ", capacitatHDD=" + capacitatHDD + "]";
	}
	
	
}
