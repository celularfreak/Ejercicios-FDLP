import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introdueix el numero d'un mes : ");
		int mes = sc.nextInt();
		
		int diasMes = 0;
		String nombreMes = null;
		
		switch(mes) {
			case 1: 
				diasMes = 31;
				nombreMes = "Gener";
				break;
			case 2: 
				diasMes = 28;
				nombreMes = "Febrer";
				break;
			case 3: 
				diasMes = 31;
				nombreMes = "Març";
				break;
			case 4: 
				diasMes = 30;
				nombreMes = "Abril";
				break;
			case 5: 
				diasMes = 31;
				nombreMes = "Maig";
				break;
			case 6: 
				diasMes = 30;
				nombreMes = "Juny";
				break;
			case 7: 
				diasMes = 31;
				nombreMes = "Juliol";
				break;
			case 8: 
				diasMes = 31;
				nombreMes = "Agost";
				break;
			case 9: 
				diasMes = 30;
				nombreMes = "Septembre";
				break;
			case 10: 
				diasMes = 31;
				nombreMes = "Octubre";
				break;
			case 11: 
				diasMes = 30;
				nombreMes = "Novembre";
				break;
			case 12: 
				diasMes = 31;
				nombreMes = "Desembre";
				break;}
			
			System.out.println("El mes de " +nombreMes +" te " +diasMes +" dies");
			sc.close();
	}

}
