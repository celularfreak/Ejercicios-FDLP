package poo1;

import java.util.Scanner;

public class PruebaOrdinador {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		Ordinador ordinador1 = new Ordinador("Lenovo", "Thinkpad");
		Ordinador ordinador2 = new Ordinador("Asus","Vivobook Pro","I7","16 Gb","500 Gb");
		
		System.out.println("Usarem els getters: ");
		System.out.println();
		System.out.println("Ordinador 1: ");
		System.out.println(ordinador1.getMarca());
		System.out.println(ordinador1.getModel());
		System.out.println();
		System.out.println("Ordinador 2: ");
		System.out.println(ordinador2.getMarca());
		System.out.println(ordinador2.getModel());
		System.out.println(ordinador2.getProcesador());
		System.out.println(ordinador2.getMemoriaRAM());
		System.out.println(ordinador2.getCapacitatHDD());
		
		System.out.println();
		System.out.println("Usaremos el metodo descripció: ");
		System.out.println();
		System.out.println("Ordinador 1: ");
		ordinador1.descripcio();
		System.out.println();
		System.out.println("Ordinador 2: ");
		ordinador2.descripcio();
		System.out.println();
		
		System.out.println("Usaremos los setters");
		ordinador2.setMarca("Spectrum");
		ordinador2.setModel("ZX");
		ordinador2.setProcesador(" Zilog Z80A");
		ordinador2.setMemoriaRAM("128kb");
		ordinador2.setCapacitatHDD(null);
		
		System.out.println();
		System.out.println("Usamos de nuevo descripció: ");
		ordinador2.descripcio();
		
		System.out.println();
		System.out.println("Probaremos el metodo frase");
		System.out.println();
		System.out.println("¿Que programa estas ejecutando el ordenador 1?: ");
		String programa = sc.nextLine();
		System.out.println();
		ordinador1.frase(programa);
		
		sc.close();
	}

	
}
