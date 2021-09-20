package apracticar1;

import java.util.Scanner;

public class exercici4 {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introdueix 2 numeros positius o negatius segons la teva elecció:");
		
		System.out.println("Primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Segon numero: ");
		int num2 = sc.nextInt();
		
		if (num1 < 0 && num2 > 0) {
			System.out.print("Un dels dos numeros es negatiu");
		}else if (num2 < 0 && num1 >0) {
			System.out.print("Un dels dos numeros es negatiu");
		} else
		sc.close();
	}

}
