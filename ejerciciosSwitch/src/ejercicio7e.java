import java.util.Scanner;

public class ejercicio7e {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("\n\tIndica el nombre que correspon al dia de setmana: \n\t(1) dilluns \n\t(2) dimarts\n\t(3) dimecres\n\t(4) dijous\n\t(5) divendres\n\t(6) dissabte \n\t(7) diumenge : ");
		int diaSetmana = sc.nextInt();
		
		switch(diaSetmana){
			case 1: System.out.print("Falten 5 dies per al cap de setmana: dilluns, dimarts, dimecres, dijous i divendres."); break;
			case 2: System.out.print("Falten 4 dies per al cap de setmana: dimarts, dimecres, dijous i divendres."); break;
			case 3: System.out.print("Falten 3 dies per al cap de setmana: dimecres, dijous i divendres."); break;
			case 4: System.out.print("Falten 2 dies per al cap de setmana: dijous i divendres."); break;
			case 5: System.out.print("Falta 1 dia per al cap de setmana: divendres."); break;
			case 6: System.out.print("Ja estàs en el cap de setmana!»"); break;
			case 7: System.out.print("Ja estàs en el cap de setmana!»"); break;
			default: System.out.print("El nombre no correspon a cap dia de la setmana."); break;
		}
		sc.close();
		
}
}