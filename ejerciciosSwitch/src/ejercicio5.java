import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introdueix el primer numero: ");
		int x= sc.nextInt();

		System.out.println("Introdueix el segon numero: ");
		int y= sc.nextInt();
		
		System.out.println("Introdueix un operador (+,-,*,/) ");
		String operador= sc.next();
		
		int resultado;
		
		switch(operador) {
		
		case "+":
			resultado = x+y;
			System.out.print("El resultat de " + x +" + " + y + " es: " +resultado); break;
		
		case "-":
			resultado = x-y;
			System.out.print("El resultat de " + x +" - " + y + " es: " +resultado);break;
			
		case "*":
			resultado = x*y;
			System.out.print("El resultat de " + x +" * " + y + " es: " +resultado);break;
			
		case "/":
			
			if (y == 0) { System.out.print("No es pot resalitzar la divisió per 0");
			
			} else {
				System.out.print("El resultat de " + x +" / " + y + " es: " + ((double) x / y));} break;}
			
		sc.close();
		
		}
	

}
