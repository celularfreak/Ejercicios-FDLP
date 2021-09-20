package ejerciciosArrays;

import java.util.ArrayList;


public class ejercicio4e {

	public static void main(String[] args) {
	
		
		int inferior=1000;
		int superior=9999;
		int aleatori = (int)(Math.random()  * (superior - inferior + 1)) + inferior;
		
		ArrayList<Integer>descomposicio=new ArrayList<Integer>();
		
		int unitat = aleatori%10;
		descomposicio.add(unitat);
		
		int desena = (aleatori%100) - unitat;
		descomposicio.add(desena);
	
		int centena = (aleatori%1000) - desena - unitat;
		descomposicio.add(centena);
		
		int milers = (aleatori%10000) - desena - unitat - centena;
		descomposicio.add(milers);
		
		System.out.print("Descomposició del nombre "+aleatori+"\n- Unitat : " + descomposicio.get(0)+"\n- Desena : " + descomposicio.get(1)+"\n- Centena: " + descomposicio.get(2)+"\n- Milers : " + descomposicio.get(3));
		
	}
}
