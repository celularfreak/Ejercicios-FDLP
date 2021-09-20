package apracticar3;

import java.util.Scanner;
import java.util.ArrayList;

public class exercici6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		ArrayList <Integer> numeros = new ArrayList <Integer>();
		
		int numero;	
		int pares = 0;
		int impares =0;
		char resposta ='s';
		
		do {
			System.out.print("Introdueix un numero:");
			numero = sc.nextInt();
			numeros.add(numero);
			
			System.out.print("Vols introduir un altre numero (s/n)");
			resposta = sc.next().charAt(0);
			
		} while (resposta != 'n' );
		
		for (int x=0; x < numeros.size();x++) {
			int e = numeros.get(x);
			if (e%2 == 0 ) {
				pares += e;
			} else
				impares += e;	
		}
		
		System.out.println("La suma dels numeros parell es : "+pares);
		System.out.println("La suma dels numeros imparells es : " +impares);
		
		sc.close();
	}
}
