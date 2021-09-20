import java.util.Scanner;
public class extra1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero entre 0 y 99: ");
		int numero= sc.nextInt();
		
		int unidades, decenas;
		
		decenas = numero/10;
		unidades = numero%10;
		
		if ((numero >=10 && numero < 21)) {
			switch (numero) {
			
				case 10: System.out.print("Diez");break;
				case 11: System.out.print("Once"); break;
				case 12: System.out.print("Doce"); break;
				case 13: System.out.print("Trece"); break;
				case 14: System.out.print("Catorze"); break;
				case 15: System.out.print("Quince"); break;
				case 16: System.out.print("Dieciseis"); break;
				case 17: System.out.print("Diecisiete"); break;
				case 18: System.out.print("Dieciocho"); break;
				case 19: System.out.print("Diecinueve"); break;
				case 20: System.out.print("Veinte");break;
				}
			
			}else if ((numero < 10 || numero > 20))
				{ switch (decenas) {
						case 2: System.out.print("Veinti");break;
						case 3: System.out.print("Treinta"); break;
						case 4: System.out.print("Cuarenta"); break;
						case 5: System.out.print("Cincuenta"); break;
						case 6: System.out.print("Sesenta"); break;
						case 7: System.out.print("Setenta"); break;
						case 8: System.out.print("Ochenta"); break;
						case 9: System.out.print("Noventa"); break;
						}
				 if ((numero > 29 && !(unidades == 0))) { System.out.print(" y ");}
				 	switch(unidades) {
				 		case 1: System.out.print("uno"); break;
				 		case 2: System.out.print("dos"); break;
				 		case 3: System.out.print("tres"); break;
				 		case 4: System.out.print("cuatro"); break;
				 		case 5: System.out.print("cinco"); break;
				 		case 6: System.out.print("seis"); break;
				 		case 7: System.out.print("siete"); break;
				 		case 8: System.out.print("ocho"); break;
				 		case 9: System.out.print("nueve"); break;
				 		}
					
				}
				sc.close();
		}		
}
