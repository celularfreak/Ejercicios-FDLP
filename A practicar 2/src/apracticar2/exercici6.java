package apracticar2;
import java.util.Scanner;

public class exercici6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		boolean primer = false;
		int nombre;
		
		do {
			
			System.out.print("Introdueix un nombre: ");
			nombre = sc.nextInt();
			
				if (nombre < 0) {	
					System.out.print("Aquest nombre no es valid");
				} else if (nombre == 0 || nombre == 1) { 
					primer = false;
				}else if (nombre== 2 || nombre == 3) {
					primer = true;  
				}else if ((nombre * nombre - 1) % 24 == 0) {
					primer = true;
				}else
					primer = false;
			
		}while (primer!=true);
		
		System.out.print("Exacte, el número "+nombre+" és primer!");
		sc.close();
	}
}