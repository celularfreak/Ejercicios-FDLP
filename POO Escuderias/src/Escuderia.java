import java.util.List;

public class Escuderia {
	private String nom;
	private int presupost;
	private String paisOrigen;
	private List <Cotxe> cotxes;
	private List <Pilot> pilots;
	private List <Mecanic> mecanics;
	
	
	public Escuderia(String nom, int presupost, String paisOrigen) {
		this.nom = nom;
		this.presupost = presupost;
		this.paisOrigen = paisOrigen;
	}
	public void agregarPilot(Pilot pilot) {
        this.pilots.add(pilot);     
	}	
	public void agregarMecanic(Mecanic mecanic) {
        this.mecanics.add(mecanic);
	}
	public void agregarCotxe(Cotxe cotxe) {
        this.cotxes.add(cotxe);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPresupost() {
		return presupost;
	}
	public void setPresupost(int presupost) {
		this.presupost = presupost;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public List<Cotxe> getCotxes() {
		return cotxes;
	}
	public void setCotxes(List<Cotxe> cotxes) {
		this.cotxes = cotxes;
	}
	public List<Pilot> getPilots() {
		return pilots;
	}
	public void setPilots(List<Pilot> pilots) {
		this.pilots = pilots;
	}
	public List<Mecanic> getMecanics() {
		return mecanics;
	}
	public void setMecanics(List<Mecanic> mecanics) {
		this.mecanics = mecanics;
	}
	@Override
	public String toString() {
		return "" +nom +  " amb pais d'origen " + paisOrigen +"";
	}

	
}