package apracticar3;

import java.util.Scanner;

public class exercici3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Introdueix una frase: ");
		String frase = sc.nextLine();
		String fraseReves ="";
		
		frase=frase.replace(" ","");

		 for (int x=frase.length()-1; x>=0; x--) {
			 fraseReves = fraseReves + frase.charAt(x);
		 }
		
		if (frase.equalsIgnoreCase(fraseReves)){
			System.out.println("Es un palindrom. ");
		}else
			System.out.println("No es un palindrom.");
		
		sc.close();
	}
}