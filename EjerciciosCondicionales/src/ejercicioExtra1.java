import java.util.Scanner;

public class ejercicioExtra1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nombre;
		
		System.out.print("\tIntrodueix un nombre enter: ");
		nombre = sc.nextInt();
		if (nombre % 2 == 0) {
		
		System.out.print("\t" +nombre +" es parell");
		}
		
		else {System.out.print("\t" +nombre +" es imparell");}
		
		sc.close();
		

	}
}