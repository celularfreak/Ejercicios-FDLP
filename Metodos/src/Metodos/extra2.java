package Metodos;
import java.util.Scanner;

public class extra2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introdueix el dia de naixement: ");
		String dia = sc.next();
		System.out.println("Introdueix el mes de naixement: ");
		String mes = sc.next();
		System.out.println("Introdueix l'any de naixement: ");
		String any = sc.next();
		
		System.out.print("El teu numero de la sort es el "+calculaNumero(dia,mes,any));
		sc.close();
	}
		static int calculaNumero (String dia, String mes, String any) {
		String suma = dia + mes + any;
		
		int sumaTotal = 0;
		int sumaTotal2 = 0;
		for (int x =0; x< suma.length(); x++) {
			int num = Integer.parseInt(suma.charAt(x)+"");
			sumaTotal = sumaTotal + num;
		}
		if (sumaTotal == 11|| sumaTotal == 22 || sumaTotal == 33 || sumaTotal == 44) {
			return sumaTotal;
		} else 
			 while (sumaTotal != 0) { 
				sumaTotal2 += sumaTotal % 10;
				sumaTotal = sumaTotal / 10;
			}
		
				if (sumaTotal2 == 10) {
					sumaTotal2 =1;
					}
			return sumaTotal2;
		}
}
