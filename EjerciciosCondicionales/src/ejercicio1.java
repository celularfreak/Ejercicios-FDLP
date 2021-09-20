import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String  nom, cognom;
		int  edat;
		System.out.print("\tIntrodueix el teu nom: ");
		nom = sc.nextLine();
		System.out.print("\tIntrodueix el teu cognom: ");
		cognom = sc.nextLine();
		System.out.print("\tQuina es la teva edat? : ");
		edat = sc.nextInt();
		
		if (edat <= 18 ) {
			
			System.out.println("\t" + nom +" "+ cognom + " Ets MENOR d'edat");
			
		}
		else {
		
		System.out.println("\t" + nom +" "+ cognom + " Ets MAJOR d'edat");
		}
		sc.close();
		

	}
}