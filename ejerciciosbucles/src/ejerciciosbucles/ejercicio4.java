package ejerciciosbucles;

import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer>respostes=new ArrayList<Integer>();
		
		int numAleat = (int) Math.ceil((Math.random()*10));
		//int numUsr =0;
		
		int numUsr;
		
		do {
			System.out.print("Introdueix un numero entre 0 i 10 : ");
			numUsr = sc.nextInt();
			respostes.add(numUsr);
			if (numUsr == numAleat) {break;}
			
		} while  (respostes.size() < 4); 
		
		if ( numUsr == numAleat) {
			System.out.print("Enhorabona, el número era " +numAleat + " i has necessitat " +respostes.size() +" intents per encertar-lo");
		} else System.out.print("Has utilitzat massa intents! El número és " +numAleat);
		
		sc.close();
		
	}

}
