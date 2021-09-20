package ejerciciosArrays;

import java.util.Scanner;
import java.util.ArrayList; 

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantes paraules vol introduir? : ");
		int num = sc.nextInt();
		sc.nextLine();
		ArrayList<String> paraules = new ArrayList<String>();
		
		for (int x=0;x<num; x++) {System.out.print("Introdueix la paraula: ");
		String paraula = sc.nextLine();
		paraules.add(paraula);
		}
		
		for (int y=0;y< paraules.size(); y++) {
			System.out.println(paraules.get(y));
		}
		sc.close();
	}

}
