import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introdueix el dia que vas neixer: ");
		int dia= sc.nextInt();

		System.out.println("Introdueix el numero del mes que vas neixer: ");
		int mes= sc.nextInt();
		
		switch (mes) {
			case 1:
				if (dia < 20) {
				System.out.print("El teu signe del zoodiac es Capricorn");
				} else {
					System.out.print("El teu signe del zoodiac es Aquari");}
				break;
			case 2:
				if (dia < 19) {
				System.out.print("El teu signe del zoodiac es Aquari");
				} else {
					System.out.print("El teu signe del zoodiac es Piscis");}
				break;
			case 3:
				if (dia < 21) {
				System.out.print("El teu signe del zoodiac es Peixos");
				} else {
					System.out.print("El teu signe del zoodiac es Àries");}
				break;
			case 4:
				if (dia < 20) {
				System.out.print("El teu signe del zoodiac es Àries");
				} else {
					System.out.print("El teu signe del zoodiac es Taure");}
				break;
			case 5:
				if (dia < 22) {
				System.out.print("El teu signe del zoodiac es Taure");
				} else {
					System.out.print("El teu signe del zoodiac es Bessons");}
				break;
			case 6:
				if (dia < 20) {
				System.out.print("El teu signe del zoodiac es Bessons");
				} else {
					System.out.print("El teu signe del zoodiac es Cranc");}
				break;
			case 7:
				if (dia < 23) {
				System.out.print("El teu signe del zoodiac es Cranc");
				} else {
					System.out.print("El teu signe del zoodiac es Lleó");}
				break;
			case 8:
				if (dia < 23) {
				System.out.print("El teu signe del zoodiac es Lleó");
				} else {
					System.out.print("El teu signe del zoodiac es Verge");}
				break;
			case 9:
				if (dia < 23) {
				System.out.print("El teu signe del zoodiac es Verge");
				} else {
					System.out.print("El teu signe del zoodiac es Libra");}
				break;
			case 10:
				if (dia < 23) {
				System.out.print("El teu signe del zoodiac es Libra");
				} else {
					System.out.print("El teu signe del zoodiac es Escorpí");}
				break;
			case 11:
				if (dia < 22) {
				System.out.print("El teu signe del zoodiac es Escorpí");
				} else {
					System.out.print("El teu signe del zoodiac es Sagitari");}
				break;
			case 12:
				if (dia < 22) {
				System.out.print("El teu signe del zoodiac es Sagitari");
				} else {
					System.out.print("El teu signe del zoodiac es Capricorn");}
				break;
				}
		sc.close();
				}
		

}

