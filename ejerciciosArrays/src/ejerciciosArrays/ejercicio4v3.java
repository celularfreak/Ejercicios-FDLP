package ejerciciosArrays;

import java.util.ArrayList;

public class ejercicio4v3 {

	public static void main(String[] args) {
	
		int inferior=1000;
		int superior=9999;
		int aleatori = (int)(Math.random()  * (superior - inferior + 1)) + inferior;
		
		int aleatorioriginal = aleatori;
		int divisor = 10;
		
		ArrayList<Integer>descomposicio=new ArrayList<Integer>();
		
		for (int x= 0; x<4; x++) {
			int numero = (aleatori%divisor);
			aleatori=aleatori -numero;
			descomposicio.add(numero);
			divisor =divisor*10;
		}
		
		System.out.print("Descomposició del nombre "+aleatorioriginal+"\n- Unitat :\t\t " + descomposicio.get(0)+"\n- Desena : \t" + descomposicio.get(1)+"\n- Centena: \t" + descomposicio.get(2)+"\n- Milers : \t\t" + descomposicio.get(3));

	}
}
