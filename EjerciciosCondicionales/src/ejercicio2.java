import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		int  edat;
		System.out.print("\tQuina es la teva edat? : ");
		edat = sc.nextInt();
		
		if (edat <= 5 ) {
			
			System.out.println("\tPreescolar");
			
			
		} else if (edat <= 11) {

			System.out.println("\tPrimaria");
				
			
		} else if (edat <= 15) {

				System.out.println("\tESO");
			
		} else if (edat <= 17) {

			System.out.println("\tBatxillerat");
		
		
		} else  { System.out.println("\tFP o Universitat");}
				
				sc.close();
		

	}
}