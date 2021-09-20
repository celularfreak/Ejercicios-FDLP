package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introdueix el primer numero enter? : ");
		int num1 = sc.nextInt();
		System.out.print("Introdueix el segon numero enter? : ");
		int num2 = sc.nextInt();
		
		int resultado =0;
		
		if (num1 == num2) { 
			System.out.print("Los numeros son iguales");
			} else {
				System.out.print("La suma de: ");}
		
		if (num1 < num2) {
			for (int x = num1;  x <= num2; x++ ) {
			resultado +=x;
			System.out.print(+x +" + ");
			}
			System.out.println(" = "+resultado);
			
		
		} else if (num2 < num1) {
			for (int x = num2;  x <= num1; x++ ) {
			resultado +=x;
			System.out.print(+x +" + ");
			}
			System.out.println(" = " + resultado);}
		
		sc.close();
	}
}

