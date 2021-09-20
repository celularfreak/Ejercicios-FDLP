package apracticar3;

import java.util.Scanner;
import java.lang.Math;

public class exercici1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int eleccio =0;
		
		do {
		System.out.print("Indica quina area vols calcular: \n1.-Quadrat\n2.-Triangle\n3.-Rectangle\n4.-Cercle\n0.-Sortir del programa: ");
		eleccio = sc.nextInt();
		
		}while (eleccio <0||eleccio>4);
		
		switch (eleccio){
	
		case 0:
			System.out.print("Adeu!"); break;
		case 1: 
			System.out.print("Introdueix la mesura del costat: ");
			float costat = sc.nextFloat();
			float area1 = costat*costat;
			System.out.print("L'area del Quadrat es "+area1);
			break;
		case 2:
			System.out.print("Introdueix la mesura de la base: ");
			float base = sc.nextFloat();
			System.out.print("Introdueix l'alçada: ");
			float alçada =  sc.nextFloat();
			float area2 = (base*alçada)/2;
			System.out.print("L'area del Triangle es "+area2);
			break;
		case 3:
			System.out.print("Introdueix la mesura de la base: ");
			float base2 = sc.nextFloat();
			System.out.print("Introdueix l'alçada: ");
			float alçada2 =  sc.nextFloat();
			float area3 = base2*alçada2;
			System.out.print("L'area del Rectangle es "+area3);
			break;
		case 4:
			System.out.print("Introdueix la mesura del radi: ");
			float radi = sc.nextFloat();
			float area4 = (float) (radi *Math.PI);
			System.out.print("L'area del Cercle es "+area4);
			break;
		}
		sc.close();	

	}
}
