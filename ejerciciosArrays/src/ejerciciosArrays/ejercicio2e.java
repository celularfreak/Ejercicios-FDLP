package ejerciciosArrays;

public class ejercicio2e{

	public static void main(String[] args) {

		
		System.out.print("Numeros comprendidos entre 320 y 160 contando de 20 en 20 : ");
		
		int resultado = 320;
				
		for (int x = 0; resultado >= 160 ; x--){
			
			System.out.print("  " + resultado);
			resultado = resultado -20;
			
			}
		
	}
}