import java.util.Scanner;

public class ejercicio9e {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Juguem a pedra, paper o tisora:\n1. Pedra\n2. Paper\n3. Tisora\nTria (1-3): ");
		int tria= sc.nextInt();
		
		int inferior=1;
		int superior=3;
		int triaRival = (int)(Math.random()  * (superior - inferior + 1)) + inferior;
		
		if (tria ==0 || tria > 3) {System.out.print("Entenc que no vols jugar. Adéu");
		} else {
						switch (triaRival) {
							case 1 : System.out.print("Jo pedra ");break;
							case 2 : System.out.print("Jo paper ");break;
							case 3 : System.out.print("Jo tisora ");break;}
		
						switch (tria) {
							case 1 : System.out.print(" i tu pedra. ");break;
							case 2 : System.out.print(" i tu paper. ");break;
							case 3 : System.out.print(" i tu tisora. ");break;}
		
						if (tria == triaRival) {System.out.print("Empat!");
						} 	else if ((tria == 1 && triaRival == 2)) {System.out.print("He Guanyat!");
						}	else if ((tria == 1 && triaRival == 3)) {System.out.print("Has Guanyat!");
						}	else if ((tria == 2 && triaRival == 1)) {System.out.print("Has Guanyat!");
						}	else if ((tria == 2 && triaRival == 3)) {System.out.print("He Guanyat!");
						} 	else if ((tria == 3 && triaRival == 1)) {System.out.print("He Guanyat!");
						} 	else if ((tria ==3 && triaRival == 2)) {System.out.print("Has Guanyat!"); 
						} else sc.close(); 
			}
	}
}
