import java.util.Scanner;

public class ejercicioExtra4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int topping;
		final double preuGelat = 1.9;
		
		System.out.print("\n\tBon dia, indica el topping per al teu gelat: \n\t0. Sense topping \n\t1. Per a topping d’Oreo \n\t2. Per a topping de Kitkat\n\t3. Per a topping de Brownie\n\t4. Per a topping de M&M\n\tQue topping desitges?");
		topping= sc.nextInt();
		
		if (topping > 4 ) { System.out.println("\n\t <<No tenim aquest topping, ho sentim. >>");}
		
		else if (topping == 0 ) {System.out.println("El preu del gelat sense topping es: "+preuGelat);}
		
		else if (topping == 1 ) {System.out.println("El preu del gelat amb topping d'Oreo es: "+(preuGelat+1));}
		
		else if (topping == 2 ) {System.out.println("El preu del gelat amb topping de KitKat es: "+(preuGelat+1.5));}
		
		else if (topping == 3 ) {System.out.println("El preu del gelat amb topping de Brownie es: "+(preuGelat+0.75));}
		
		else   {System.out.printf("\n\tEl preu del gelat amb topping de M&M es: "+(preuGelat+0.95));}
		
		sc.close();
		}
	
}