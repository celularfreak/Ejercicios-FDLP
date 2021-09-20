package ejerciciosbucles;

import java.util.Scanner;
import java.util.ArrayList;
public class extra3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer>numFib = new ArrayList <Integer> ();
		
		System.out.print("Introdueix cuants nombres vols mostrar de la sèrie de Fibonacci");
		int numDem =sc.nextInt();
		
		numFib.add(0);
		numFib.add(1);
		
		int num;
		int num2;
		
		for (int x = 2; x <= numDem -1; x++) {
				num = numFib.get(x-1);
				num2 = numFib.get(x-2);
				num = num + num2;
				numFib.add(num);
				}

		for (int y= 0; y<= numDem -1; y++) {
		System.out.print(" " + numFib.get(y));
	}
	sc.close();
	}
}
