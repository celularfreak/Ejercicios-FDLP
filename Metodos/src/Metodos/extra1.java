package Metodos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class extra1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		metodo1();
		
		ArrayList <Integer> numeros = new ArrayList <Integer>();
		for (int x = 1; x < 6; x++) {
			System.out.print("Introdueix el nombre numero "+x+" : ");
			int numero = sc.nextInt();
			numeros.add(numero);
		}
		 int z = metodo2(numeros);
		 System.out.println("Numero mes petit "+numeros.get(z));
		 
		 ArrayList <String> nombres = new ArrayList <String>();
		 for (int x = 1; x < 6; x++) {
				System.out.print("Introdueix el nom numero: "+x+" : ");
				String nom = sc.next();
				nombres.add(nom);
				}
			System.out.println("Nom mes llarg: "+nombres.get(metodo3(nombres)));
			
		System.out.println("Introdueix el primer nombre: ");
		int numero1 = sc.nextInt();
		System.out.println("Introdueix el segon nombre: ");
		int numero2 = sc.nextInt();
			
		System.out.print(metodo4(numero1, numero2));
		sc.close();
			
		}
		

		static void metodo1 () {
			System.out.println("Soc un metode");
			
		}
		
		static int metodo2(ArrayList<Integer> numeros) {
			System.out.println("Numero mes gran "+Collections.max(numeros));
			return numeros.indexOf(Collections.min(numeros));
		}
		
		static int metodo3(ArrayList<String> nombres) {
			return nombres.indexOf(Collections.max(nombres));
		}
		
		static ArrayList<Integer> metodo4(int numero1, int numero2) {
			ArrayList <Integer>numerosComp = new ArrayList <Integer>();
			if (numero1 < numero2) {
			for (int x = numero1+1; x <numero2;x++ ) {
				numerosComp.add(x); }
			}else if (numero1 > numero2) {
				for (int x = numero2+1; x <numero1;x++ ) {
				numerosComp.add(x); }
			}
			return numerosComp;
		}
			
}


