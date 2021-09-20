package poo1;

public class Ordinador {

	String marca;
	String model;
	String procesador;
	String memoriaRAM;
	String capacitatHDD;
	
		public Ordinador(String marca, String model) {
			this.marca=marca;
			this.model=model;
		}
		public Ordinador(String marca, String model, String procesador, String memoriaRAM, String capacitatHDD) {
			this.marca=marca;
			this.model=model;
			this.procesador=procesador;
			this.memoriaRAM=memoriaRAM;
			this.capacitatHDD=capacitatHDD;		
		}
		public String getMarca () {return this.marca;}
		public String getModel () {return this.model;}
		public String getProcesador () {return this.procesador;}
		public String getMemoriaRAM () {return this.memoriaRAM;}
		public String getCapacitatHDD () {return this.capacitatHDD;}
		
		public void setMarca (String marca) {this.marca=marca;}
		public void setModel (String model) {this.model=model;}
		public void setProcesador (String procesador) {this.procesador=procesador;}
		public void setMemoriaRAM (String memoriaRAM) {this.memoriaRAM=memoriaRAM;}
		public void setCapacitatHDD (String capacitatHDD) {this.capacitatHDD=capacitatHDD;}
		
		public void frase (String sistema) {System.out.println("En aquests moments s'està executant: "+sistema);}
		
		public void descripcio() {System.out.println("Marca: "+marca);
			System.out.println("Model: "+model);
			System.out.println("Procesador: "+procesador);
			System.out.println("Memoria RAM: "+memoriaRAM);
			System.out.println("Capacitat HDD:"+capacitatHDD);
		}
		
}
