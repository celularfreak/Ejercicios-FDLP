package apracticar2;
import java.util.Scanner;
public class exercici3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introdueix un numero: ");
		int numero = sc.nextInt();
		
		for (int x=0; x<numero;x++) 
		{
			for (int y=0; y<=x; y++) 
			{
				System.out.print("*");
			}	
			System.out.println();
		}
		for (int x=numero; x>0;x--) 
		{
			for (int y=2; y<=x; y++) 
			{
				System.out.print("*");
			}	
			System.out.println();
			
			sc.close();
		}
	}

}