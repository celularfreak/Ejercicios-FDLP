package poo1;

import java.util.Scanner;

public class PruebaInstrumentCorda {

	public static void main(String[] args) {
		
		InstrumentCorda miGuitarra = new InstrumentCorda("Guitarra","Yamaha");
		InstrumentCorda miGuitarra2 = new InstrumentCorda();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quin tipus de guitarra  tens?: ");
		miGuitarra2.tipus = sc.nextLine();
		//miGuitarra.tipus = "Guitarra";
		System.out.print("De quina marca es?: ");
		miGuitarra2.marca = sc.nextLine();
		//miGuitarra.marca = "Yamaha";
		System.out.println(miGuitarra.tipus);
		System.out.println(miGuitarra.marca);
		System.out.println(miGuitarra2.tipus);
		System.out.println(miGuitarra2.marca);
		/*System.out.print("Quina nota vols tocar?: ");
		miGuitarra.tocarNota = sc.nextLine();
		System.out.print("Quin acord vols tocar?: ");
		miGuitarra.tocarAcord = sc.nextLine();*/
		
		miGuitarra.tocarNota("Sol");
		miGuitarra.tocarAcord("DO#");
	sc.close();
	}

}
