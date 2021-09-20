package apracticar1;
import java.util.Scanner;
public class exercici8 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introdueix la temperatura en ºC : ");
		float grausC = sc.nextFloat();
		
		float grausF = (grausC * 9/5) + 32;
		
		System.out.print(grausC +" ºC son " +grausF+ " ºF");
		sc.close();
	}
}
