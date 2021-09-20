package Metodos;
import java.util.Scanner;

public class extra3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introdueix el missatge que vols convertir: ");
		String text = sc.nextLine();
		
		conversio(text);
		sc.close();
	}
	static void conversio (String text) {
	
		text = text.toUpperCase();
		char letra;
		char letraSig = ' '; 
		
		for (int x =0; x < text.length(); x++) {
			letra = text.charAt((x));
			if (x==text.length()-1) { 
				 letraSig =' ';
			}else letraSig = text.charAt((x+1));
			
			switch (letra) {
				case 'A' : System.out.print("2");if (letraSig == 'B' || letraSig == 'C' || letraSig == 'A') {System.out.print("_");}else System.out.print(" ");break;
				case 'B' : System.out.print("22");if (letraSig == 'A' || letraSig == 'B' || letraSig == 'C') {System.out.print("_");}else System.out.print(" ");break;
				case 'C' : System.out.print("222");if (letraSig == 'B' || letraSig == 'A'|| letraSig == 'C') {System.out.print("_");}else System.out.print(" ");break;
				case 'D' : System.out.print("3");if (letraSig == 'E' || letraSig == 'D' || letraSig == 'F') {System.out.print("_");}else System.out.print(" ");break;
				case 'E' : System.out.print("33");if (letraSig == 'D' || letraSig == 'E' || letraSig == 'F') {System.out.print("_");}else System.out.print(" ");break;
				case 'F' : System.out.print("333");if (letraSig == 'E' || letraSig == 'D' || letraSig == 'F') {System.out.print("_");}else System.out.print(" ");break;
				case 'G' : System.out.print("4");if (letraSig == 'H' || letraSig == 'G' || letraSig == 'I') {System.out.print("_");}else System.out.print(" ");break;
				case 'H' : System.out.print("44");if (letraSig == 'G' || letraSig == 'H' || letraSig == 'I') {System.out.print("_");}else System.out.print(" ");break;
				case 'I' : System.out.print("444");if (letraSig == 'H' || letraSig == 'G' || letraSig == 'I') {System.out.print("_");}else System.out.print(" ");break;
				case 'J' : System.out.print("5");if (letraSig == 'K' || letraSig == 'J' ||  letraSig == 'L') {System.out.print("_");}else System.out.print(" ");break;
				case 'K' : System.out.print("55");if (letraSig == 'J' || letraSig == 'K' || letraSig == 'L') {System.out.print("_");}else System.out.print(" ");break;
				case 'L' : System.out.print("555");if (letraSig == 'J' || letraSig == 'K'|| letraSig == 'L') {System.out.print("_");}else System.out.print(" ");break;
				case 'M' : System.out.print("6");if (letraSig == 'N' || letraSig == 'M' || letraSig == 'O') {System.out.print("_");}else System.out.print(" ");break;
				case 'N' : System.out.print("66");if (letraSig == 'M' || letraSig == 'N' || letraSig == 'O') {System.out.print("_");}else System.out.print(" ");break;
				case 'O' : System.out.print("666");if (letraSig == 'M' || letraSig == 'N'|| letraSig == 'O') {System.out.print("_");}else System.out.print(" ");break;
				case 'P' : System.out.print("7");if (letraSig == 'P' || letraSig == 'Q' || letraSig == 'R' || letraSig == 'S') {System.out.print("_");}else System.out.print(" ");break;
				case 'Q' : System.out.print("77");if (letraSig == 'Q' ||letraSig == 'P' || letraSig == 'R' || letraSig == 'S') {System.out.print("_");}else System.out.print(" ");break;
				case 'R' : System.out.print("777");if (letraSig == 'R' || letraSig == 'P' || letraSig == 'Q' || letraSig == 'S') {System.out.print("_");}else System.out.print(" ");break;
				case 'S' : System.out.print("7777");if (letraSig == 'Q' || letraSig == 'P' || letraSig == 'R' || letraSig == 'S') {System.out.print("_");}else System.out.print(" ");break;
				case 'T' : System.out.print("8");if (letraSig == 'T' || letraSig == 'U' || letraSig == 'V') {System.out.print("_");}else System.out.print(" ");break;
				case 'U' : System.out.print("88");if (letraSig == 'U' || letraSig == 'T' || letraSig == 'V') {System.out.print("_");}else System.out.print(" ");break;
				case 'V' : System.out.print("888");if (letraSig == 'T' || letraSig == 'U' || letraSig == 'V') {System.out.print("_");}else System.out.print(" ");break;
				case 'W' : System.out.print("9");if (letraSig == 'W' || letraSig == 'X' || letraSig == 'Y' || letraSig == 'Z') {System.out.print("_");}else System.out.print(" ");break;
				case 'X' : System.out.print("99");if (letraSig == 'X' || letraSig == 'W' || letraSig == 'Y' || letraSig == 'Z') {System.out.print("_");}else System.out.print(" ");break;
				case 'Y' : System.out.print("999");if (letraSig == 'Y' || letraSig == 'W' || letraSig == 'X' || letraSig == 'Z') {System.out.print("_");}else System.out.print(" ");break;
				case 'Z' : System.out.print("9999");if (letraSig == 'W' || letraSig == 'X' || letraSig == 'Y' || letraSig == 'Z') {System.out.print("_");}else System.out.print(" ");break;
				case ' ': System.out.print("0"); if (letraSig == ' ') {System.out.print("_");}else System.out.print(" ");break;
			}			
		}
	}
}
