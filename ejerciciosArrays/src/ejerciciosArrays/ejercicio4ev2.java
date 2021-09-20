package ejerciciosArrays;

import java.util.ArrayList;

public class ejercicio4ev2 {

	public static void main(String[] args) {
	
		int inferior=1000;
		int superior=9999;
		int aleatori = (int)(Math.random()  * (superior - inferior + 1)) + inferior;
		
		int aleatorioriginal = aleatori;
		
		ArrayList<Integer>descomposicio=new ArrayList<Integer>();
		
		for (int x= 0; x<4; x++) {
			int numero = aleatori%10;
			descomposicio.add(numero);
			aleatori = aleatori/10;
		}
		
		int multiplicador = 10;
		
		for (int y = 1; y<4; y++) {
			
			descomposicio.get(y);
			int multiplicado= y*multiplicador;
			descomposicio.set(y, multiplicado);
			multiplicador= multiplicador*10;	
			
		} 
		System.out.print("Descomposició del nombre "+aleatorioriginal+"\n- Unitat : \t\t" + descomposicio.get(0)+"\n- Desena : \t" + descomposicio.get(1)+"\n- Centena: \t" + descomposicio.get(2)+"\n- Milers : \t\t" + descomposicio.get(3));

	}
}
