package Metodos;

import java.util.Scanner;


public class ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
			System.out.println("Quantes persones participen?");
			int numero = sc.nextInt();
		
		
			System.out.println("La mitjana es " + calculos(numero));
			sc.close();
	}
		
	static int calculos (int numero) {
			Scanner sc = new Scanner (System.in);
			
			 int numeroIntermedio = 0;
			 int total = 0;
			
			 for (int x = 0; x < numero; x++) {
				
				 	do {
				 			System.out.println("Introdueix l'edat de la persona numero " +(x+1)+"\n");
				 				numeroIntermedio = sc.nextInt();
				
				 		}
				 		while (numeroIntermedio >120 || numeroIntermedio < 0);
				 	
				 total = total + numeroIntermedio;
				 
			 }
			 	sc.close();
				return (total/numero); 
		}
	
}
