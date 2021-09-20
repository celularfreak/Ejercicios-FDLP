
public class Cercle {

	private Punt centre;
	private double radi;
	
	

	public Cercle(Punt centre, double radi) {
	
		this.centre = centre;
		this.radi = radi;
	}
	
	public Punt getCentre() {
		return centre;
	}

	public void setCentre(Punt centre) {
		this.centre = centre;
	}

	public double getRadi() {
		return radi;
	}

	public void setRadi(double radi) {
		this.radi = radi;
	}

	public double distanciaAltreCercle(Cercle altreCercle) {
		
		double x1 = this.centre.getPosicioX();
		double x2 = altreCercle.centre.getPosicioX();
		double y1 = this.centre.getPosicioY();
		double y2 =altreCercle.centre.getPosicioY();
		
		double distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return distancia;

	}
	public boolean equalsAltreCercle(Cercle altreCercle) {
		if (this.centre.equals(altreCercle.centre)) {
			return true;
		}else return false;
	}
	
	public boolean sonConcentrics(Cercle altreCercle) {
		 if (this.distanciaAltreCercle(altreCercle)== 0) {
			 return true;
		 }else return false;
	}
	public boolean tenenIgualRadi(Cercle altreCercle) {
		if (this.distanciaAltreCercle(altreCercle)>(altreCercle.radi+(this.radi))){
			return true;
		}else return false;
	}
	public boolean sonTangents(Cercle altreCercle) {
		if (this.distanciaAltreCercle(altreCercle)==(altreCercle.radi+(this.radi))) {
			return true;
		}else return false;
	}
	public boolean sonSecants(Cercle altreCercle) {
		if(this.distanciaAltreCercle(altreCercle)<(altreCercle.radi+(this.radi)) && this.distanciaAltreCercle(altreCercle)>Math.abs(altreCercle.radi-(this.radi))) {
			return true;
		}else return false;
	}
	public boolean noEsToquen(Cercle altreCercle) {
		if(this.sonTangents(altreCercle)==false) {
			return true;
		}else return false;
	}
	
	@Override
	public String toString() {
		return "Cercle [centre=" + centre + ", radi=" + radi + "]";
	}


}