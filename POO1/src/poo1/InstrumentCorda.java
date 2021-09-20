package poo1;

public class InstrumentCorda {

	String tipus;
	String marca;
	
	public InstrumentCorda() { }
	
	public InstrumentCorda (String tipus, String marca) {
		this.tipus=tipus;
		this.marca=marca;
	
	}
		public void tocarNota(String nota) {
			System.out.println("Tocant la nota " + nota);
		}
		public void tocarAcord(String acord) {
			System.out.println("Tocant l'acord "+ acord);
			
		}
}
