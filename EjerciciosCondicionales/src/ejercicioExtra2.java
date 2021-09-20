import java.util.Scanner;

public class ejercicioExtra2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int any;
		
		System.out.print("\tQuin es el teu any de naixement: ");
		any = sc.nextInt();
		
		if (any % 4 == 0) {
		
		System.out.print("\t" +any +" es any de traspas");
		}
		
		else {System.out.print("\t" +any +" es any de traspas");}
		
		sc.close();
		

	}
}