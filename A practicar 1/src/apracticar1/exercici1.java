package apracticar1;
import java.util.Scanner;

public class exercici1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Benvingut al programa de calcul de mitja de notes!: ");
		
		int total = 0;
		
		for (int x =0 ;  x<3 ; x++) {
		
			System.out.println("Introdueix la nota numero "+(x+1));
			int notaIntermedia = sc.nextInt();
			 total = total + notaIntermedia;
		}
		float media =((float)total/3);
		
		if (media < 5) {
			System.out.println("La teva mitja es "+media+" No has superat el curs. Has de recuperar");
		}else if (media >=5 && media <=7) {
			System.out.println("La teva mitja es "+media+" “Enhorabona! Has aprovat però hauries de seguir practicant");
		}else if (media > 7) {
			System.out.println("La teva mitja es "+media+" “Enhorabona! Has superat el curs! Passa ja al següent nivell!");
		}
		sc.close();
	}
	
}
