import java.util.Scanner;

public class ejericio3 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Quina es la teva edat? ");
	byte edat = sc.nextByte();
	
	sc.nextLine();
	
	System.out.println("Tens titul universitari? (S/N)");
	String estudis = sc.nextLine();
	estudis = estudis.toUpperCase();
	
	System.out.println ("Estas a l'atur (S/N)");
	String atur = sc.nextLine();
	atur = atur.toUpperCase();
	
	if ((edat >= 18 && estudis.equals("S")) || (atur.equals("S"))) {
		
		System.out.println("Tens Beca");
		
	} else { System.out.println("No tens Beca");}
	
	sc.close();
	}

	
}
	
			
			


