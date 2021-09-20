package apracticar1;
import java.util.Scanner;

public class exercici2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Benvingut al programa de calcul de mitja de notes!: ");
		System.out.println("Quantes persones participen?");
		int numero = sc.nextInt();
		
		int total = 0;
		
		for (int x =0 ;  x<numero ; x++) {
		
			System.out.println("Introdueix la nota numero "+(x+1));
			int notaIntermedia = sc.nextInt();
			 total = total + notaIntermedia;
		}
		float media =((float)total/(float)numero);
		
		if (media < 5) {
			System.out.println("La teva mitja es "+media+" La nota mitjana de la classe està suspesa. Els alumnes haurien de preguntar els seus dubtes i treballar més");
		}else if (media >=5 && media <=7) {
			System.out.println("La teva mitja es "+media+" La nota mitjana de la classe és bona, però els alumnes haurien de millorar el treball personal");
		}else
			System.out.println("La teva mitja es "+media+" Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat");
		
		sc.close();
	}
	
}
