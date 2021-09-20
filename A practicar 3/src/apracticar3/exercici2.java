package apracticar3;

import java.util.Scanner;

public class exercici2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Introdueix una paraula o frase: ");
		String cadena = sc.nextLine();
		
		 for (int i=cadena.length()-1; i>=0; i--) {
			 System.out.print(cadena.charAt(i));
		 }
		 sc.close();
}
}