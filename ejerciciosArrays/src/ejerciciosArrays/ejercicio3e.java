package ejerciciosArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3e {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int inferior=10;
		int superior=100;
		int aleatori = (int)(Math.random()  * (superior - inferior + 1)) + inferior;
		
		ArrayList<Integer> respostes = new ArrayList<Integer>();
	
		for (int x=0 ; x<5; x++) {	
			
		System.out.print("Introdueix un nombre entre 0 i 100 : ");
		int numero = sc.nextInt();
			
			if (numero > 100 ) {System.out.println("Nombre introduit fora de rang, intenta de nou") ;
			x-- ;
			} else respostes.add(numero);
		}
		
		boolean resposta= respostes.contains(aleatori);
		
		if (resposta) {
			System.out.print("Excel.lent! Has endevinat");
		} else {
				System.out.print("Ho sento, has perdut!");
			}
		System.out.print("\nEl numero aleatori era : " +aleatori +" i les teves respostes eren : ");
		
		for (int y=0; y< respostes.size(); y++) {
			System.out.print(respostes.get(y) + "  ");
	
		}
		sc.close();
	}
}
