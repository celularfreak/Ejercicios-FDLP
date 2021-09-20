package ejerciciosArrays;

import java.util.Scanner;

public class extra2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("De quina altura vols la L? : ");
		int altura = sc.nextInt();
		
		for (int x=1;x < altura; x++) {
		System.out.println("*");
		}	
		for (int y = 0; y <= ((altura/2)+1); y++) {
			System.out.print("*");
		}
		sc.close();
	}
}
