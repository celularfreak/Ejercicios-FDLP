package ejerciciosbucles;

import java.util.Scanner;


public class extra4 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		int y  = 0;
		int x = 0;
		int y2 = 0;
		
		for (  x =0; y <= 10000; x++) {
			System.out.print("introduce un nombre; ");
			y2 = sc.nextInt();
			y += y2;
		}
		
System.out.print((y-y2) +" " + (x-1) +" "+ ((double)(y-y2)/(x-1)));
	
		
		
		sc.close();
	}
	}
