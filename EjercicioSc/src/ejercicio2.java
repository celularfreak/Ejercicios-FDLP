import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double  x, y;
		
		System.out.print("\tIntrodueix el primer nombre: ");
		x = sc.nextDouble();
		System.out.print("\tIntrodueix el segon nombre: ");
		y = sc.nextDouble();
		
		
		System.out.println("\n\t\tAquestes son les dades introduides:");
		System.out.println("\tEl valor de la suma és " + (x+y));
		System.out.println("\tEl valor de la resta és " + (x-y));
		System.out.println("\tEl valor de la multiplicació és " + (x*y));
		System.out.println("\tEl valor de la suma divisió " + (x/y));
		

	}

}
