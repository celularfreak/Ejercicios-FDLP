package Metodos;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Introdueix el primer numero: ");
	int x= sc.nextInt();

	System.out.println("Introdueix el segon numero: ");
	int y= sc.nextInt();
	
	System.out.println("Quina operacio vols realitzar? : \n 1. Suma \n 2. Resta \n 3. Multiplicació \n 4.Divisió \n 6. Modul");
	int operador = sc.nextInt();
	
System.out.print("El resultat es " + calculos(x,y,operador));
	sc.close();
	}
	
static int calculos (int num1, int num2, int operacion) {
	
		switch(operacion) {
		
		case 1: return num1+num2;
		case 2: return num1-num2; 
		case 3: return num1*num2;
		case 4: return num1 / num2; 
		case 5: return num1%num2;
		};
			
		return operacion;
			
				}
		}
	



	
	
	