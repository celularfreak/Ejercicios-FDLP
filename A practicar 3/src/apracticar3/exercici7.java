package apracticar3;

import java.util.Scanner;

public class exercici7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introdueix el numero de persones: ");
		float persones =sc.nextFloat();
		System.out.print("Quin preu tenen els fideus?: ");
		float preuFideus = sc.nextFloat();
		System.out.print("Quin preu tenen les gambes?: ");
		float preuGambes = sc.nextFloat();
		System.out.print("Quin preu tenen els calamar?: ");
		float preuCalamar = sc.nextFloat();
	
		float quantitatFideus = (float) (0.125*persones);
		float quantitatGambes = (float) (0.05*persones);
		float quantitatCalamars = (float) (0.1*persones);
		
		float preuIngredients = (preuFideus*quantitatFideus)+ (preuGambes*quantitatGambes)+(preuCalamar*quantitatCalamars);
		float preuPerpersona = preuIngredients/persones;
		
		System.out.println("Necesitarem les seguents quantitats:");
		System.out.println("Fideus: "+quantitatFideus+" kilos");
		System.out.println("Gambes: "+quantitatGambes+" kilos");
		System.out.println("Calamars: "+quantitatCalamars+" kilos");
		System.out.println("El preu per persona sera de "+preuPerpersona+" euros");
		System.out.println("El preu total son "+preuIngredients+" euros");
	
	sc.close();
	}

	
		
		
	

}
