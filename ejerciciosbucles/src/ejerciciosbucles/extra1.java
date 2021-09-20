package ejerciciosbucles;

import java.util.Scanner;

public class extra1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	int numAleatori = (int) ((Math.random() * 500)+1);
	int numUsuari = 0;
	
	
	do  {
		System.out.println("Introdueix un numero entre 1 i 500 :  ");
		numUsuari = sc.nextInt();
		
		if (numUsuari < 1 || numUsuari >500) {
			System.out.println("Error, introdueix un numero entre 1 i 500:");
		} else {
		
		if (numAleatori > numUsuari) {
				if (numAleatori-numUsuari >= 50) {
					System.out.println("Fred, Fred: el teu numero es mes Petit");
				} else if  ( numAleatori - numUsuari < 50 && numAleatori - numUsuari >14) {
					System.out.println("Tebi, Tebi: el teu numero es mes Petit"); 
				} else if ( numAleatori - numUsuari <15) {
					System.out.println("Calent, Calent: el teu numero es mes Petit");}
		} else {
			
			if (numUsuari - numAleatori >= 50) {
				System.out.println("Fred, Fred: el teu numero es mes Gran");
			} else if  ( numUsuari - numAleatori < 50 && numUsuari - numAleatori >14) {
				System.out.println("Tebi, Tebi: el teu numero es mes Gran"); 
			} else if ( numUsuari - numAleatori < 15) {
				System.out.println("Calent, Calent: el teu numero es mes Gran");
					}	} }
	} while (numAleatori != numUsuari) ;
			
		System.out.println("El numero es "+numUsuari +",  has encertat!");
		
	sc.close();
	
	}
}

