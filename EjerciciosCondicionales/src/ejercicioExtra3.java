import java.util.Scanner;

public class ejercicioExtra3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int dividend, divisor;
		
		System.out.print("\tIntrodueix el dividend ");
		dividend= sc.nextInt();
		System.out.print("\n\tIntrodueix el divisor ");
		divisor= sc.nextInt();
		
		if (divisor >2 && divisor <= 7) {
			
		
			if (dividend%divisor == 0 ) {
				
				System.out.print("\n\t" +dividend +" es multiple de "+divisor);
				
			} else { System.out.print("\n\t" +dividend +" no es multiple de "+divisor);}
			
		} else {System.out.print("\n\tNo es pot executar el programa");
			
		}
		
		sc.close();
		

	}
}