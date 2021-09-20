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
		
		
		System.out.println("\n\t\tAquestes son les dades introduides:");
		System.out.println("\tNom: " + nom);
		System.out.println("\tCognom: " + cognom);
		System.out.println("\tEdat: " + edat);  
		

	}

}
