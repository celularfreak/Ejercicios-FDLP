package apracticar3;

import java.util.Scanner;

public class exercici5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Introdueix una frase: ");
		String frase = sc.nextLine();
		
		int mayuscula = 0;
		int minuscula = 0;
		
		for (int x = 0; x < frase.length(); x++) {
			if (Character.isUpperCase(frase.charAt(x))) mayuscula++;
			if (Character.isLowerCase(frase.charAt(x))) minuscula++;
		}
		
		if (mayuscula >0 && minuscula >0) {
			System.out.print("La frase esta formada per majúscules i minúscules");
		}else if (mayuscula > 0 && minuscula == 0) {
			System.out.print("La frase esta formada només per majúscules");
		}else if (mayuscula == 0 && minuscula > 0) {
			System.out.print("La frase esta formada només per minúscules");
		}
		sc.close();
	}
}