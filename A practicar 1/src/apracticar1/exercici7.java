package apracticar1;

import java.util.Scanner;

public class exercici7 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introdueix el caracter que vols representar: ");
		String caracter = sc.next();
		
		System.out.print("Introdueix un numero: ");
		int numero = sc.nextInt();
		
		for (int x=0; x<numero; x++){
			System.out.print(caracter+" ");
			for (int y =1; y<numero;y++) {
				System.out.print(caracter+" ");
			}
			System.out.println();
		}
		sc.close();
		
		
}
}