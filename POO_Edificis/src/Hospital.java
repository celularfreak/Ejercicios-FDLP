
public class Hospital extends Edificio {
		private int malalts;

		public Hospital(String nom, int plantes, int superficie, int malalts) {
			super(nom, plantes, superficie);
			this.malalts = malalts;
		}

		public int getMalalts() {
			return malalts;
		}

		public void setMalalts(int malalts) {
			this.malalts = malalts;
		}
		
		public double calcularCostVigilancia() {
			double coste;
			coste = Math.ceil(getSuperficie()/1000);
			coste = coste * 1300;
			return coste;
		}
		public String repartirDinar() {
			int  raciones;
			raciones = 3*this.malalts;
			return "S’estan repartint "+raciones+" racions.";
		}

		@Override
		public String toString() {
			String resultado;
			resultado = getNom() + ", de "+getSuperficie() + " m2 i "+getPlantes()+" plantes.";
			resultado = resultado +"\nEn aquest momente té "+getMalalts()+ " malalts.";
			resultado = resultado + "\n" +repartirDinar();
			return resultado;
		}
}