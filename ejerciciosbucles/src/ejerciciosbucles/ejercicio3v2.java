package ejerciciosbucles;

import java.util.Scanner;
public class ejercicio3v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numAleat = (int) Math.ceil((Math.random()*10));
		
		int numUsr=0;
		
		while  (numUsr != numAleat); {
			System.out.print("Introdueix un numero entre 0 i 10 : ");
			numUsr = sc.nextInt(); 
			}
		
			System.out.print("Enhorabona, el número era " +numAleat);
		
		sc.close();
		
	}

}
