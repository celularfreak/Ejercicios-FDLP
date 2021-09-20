import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x, y, z;
		
		System.out.print("\tIntrodueix la primera nota: ");
		x = sc.nextInt();
		System.out.print("\tIntrodueix la segona nota: ");
		y = sc.nextInt();
		System.out.print("\tIntrodueix la tercera nota: ");
		z = sc.nextInt();
		
		
		float media = (float)(x + y + z) / 3;
		
		System.out.println("\n\t\tLa mitjana de les notes es:" + media );
		

	}

}
