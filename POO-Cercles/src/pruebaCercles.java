import java.util.Scanner;

public class pruebaCercles {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Definirem el primer Cercle");
		System.out.println("Introdueix el centre del primer Cercle");
		System.out.println("Introdueix la coordenada X: ");
		double x1 = sc.nextDouble();
		System.out.println("Introdueix la coordenada Y: ");
		double y1 = sc.nextDouble();
		System.out.println("Introdueix el radi delCercle: ");
		double rad1 =sc.nextDouble();
		System.out.println("Definirem el segon Cercle");
		System.out.println("Introdueix el centre del segon Cercle");
		System.out.println("Introdueix la coordenada X: ");
		double x2 = sc.nextDouble();
		System.out.println("Introdueix la coordenada Y: ");
		double y2 = sc.nextDouble();
		System.out.println("Introdueix el radi delCercle: ");
		double rad2 =sc.nextDouble();
		
		Cercle cercle1 = new Cercle(new Punt(x1,y1),rad1);
		Cercle cercle2 = new Cercle(new Punt(x2,y2),rad2);
		
	
		System.out.println("La distancia entre els dos centres es "+cercle1.distanciaAltreCercle(cercle2));
		System.out.println("Els dos cercles son iguals? "+cercle1.equalsAltreCercle(cercle2));
		System.out.println("Els dos cercles son concentrics? " +cercle1.sonConcentrics(cercle2));
		System.out.println("Els dos cercles tenen el mateix radi? "+cercle1.tenenIgualRadi(cercle2));
		System.out.println("Els dos cercles son tangents? "+cercle1.sonTangents(cercle2));
		System.out.println("Els dos cercles son Secants? "+cercle1.sonSecants(cercle2));
		System.out.println("Els dos cercles es toquen? "+cercle1.noEsToquen(cercle2));
		sc.close();
	}
}
