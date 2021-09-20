package apracticar3;
 import java.util.Scanner;
 import java.util.ArrayList;
 
public class exercici4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		ArrayList<Character>letras=new ArrayList<Character>( );
		String galimatias = "TRWAGMYFPDXBNJZSQVHLCKE";

		for (int x=0; x<=galimatias.length()-1; x++) {
			letras.add(galimatias.charAt(x));	
		}
		
		System.out.print("Introdueix un numero de DNI. Primer les 8 xifres: ");
		int numeroDni = sc.nextInt();
		
		System.out.print("Ara introdueix la lletra: ");
		char letraDni = sc.next().charAt(0);
		letraDni = Character.toUpperCase(letraDni);
		
		int buscaLetra = numeroDni%23;
		
		if (letraDni == letras.get(buscaLetra)) {
			System.out.print("La lletra que has introduit es correcta");
		}else 
			System.out.print("La lletra que has introduit no es correcta, la lletra correcta es: "+letras.get(buscaLetra));
		
		sc.close();
	}
}
