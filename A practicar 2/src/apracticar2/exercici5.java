package apracticar2;
import java.util.Scanner;

public class exercici5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introdueix un nombre: ");
		int nombre = sc.nextInt();
	
		if (nombre < 0) {
			System.out.print("Aquest nombre no es valid");
			} else if (nombre == 0 || nombre == 1) { 
				System.out.print("El nombre "+nombre+" no es primer");  
			}else if (nombre== 2 || nombre == 3) {
				System.out.print ("El nombre "+nombre+" es primer");  
			}else if ((nombre * nombre - 1) % 24 == 0) {
				System.out.print("El nombre "+nombre+" es primer");
			}else
				System.out.print("El nombre "+nombre+" no es primer"); 
		sc.close();
	}
}