package ejerciciosbucles;

import java.util.Scanner;


public class extra4v2 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		int x  = 0;
		int x2 = 0;
		int y = 0;
	
		
while (x2 < 10000) {
	System.out.print("Introdueix el nombre: ");
	x = sc.nextInt();
	x2 += x;
	y++;
}
System.out.print(x2 +" "+y +" "+(x2/y));
	}
	}
