package apracticar2;
import java.util.Scanner;

public class exercici4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int factorial = 1;
		
		System.out.println("Introdueix el numero del que vols calcular el factorial: ");
		int numero = sc.nextInt();
		
		for (int x =1; x<= numero; x++) {
			factorial = factorial*x;
		}
		System.out.println("El factorial de " +numero+" es: "+factorial);
		sc.close();
	}
}
