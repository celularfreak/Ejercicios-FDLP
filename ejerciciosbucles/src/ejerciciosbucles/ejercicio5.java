package ejerciciosbucles;

import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio5 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	ArrayList<String>nombres = new ArrayList <String> ();
	
	int numBecas = 0;
	
	do {	
		
		System.out.print ("Quin es el teu nom? ");
		String nom = sc.nextLine();
		
		System.out.println("Quina es la teva edat? ");
		byte edat = sc.nextByte();
	
		sc.nextLine();
	
		System.out.println("Tens titul universitari? (S/N)");
		String estudis = sc.nextLine();
		estudis = estudis.toUpperCase();
	
		System.out.println ("Estas a l'atur (S/N)");
		String atur = sc.nextLine();
		atur = atur.toUpperCase();
	
			if ((edat >= 18 && estudis.equals("S")) || (atur.equals("S"))) {
		
					System.out.println("Tens Beca"); 
					numBecas = numBecas +1;
					nombres.add(nom);
					
			} else { System.out.println("No tens Beca");
				}
			
	} while (numBecas < 5);
		System.out.print("Els cinc alumnes que tenen beca son : ");
		
		for (int x = 0; x < nombres.size(); x++)
			System.out.print("\t" + nombres.get(x));
	
	sc.close();
	

	}
}
	
			
			