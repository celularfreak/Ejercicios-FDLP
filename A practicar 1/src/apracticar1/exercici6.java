package apracticar1;

import java.util.Scanner;

public class exercici6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introdueix un numero: ");
		int tabla = sc.nextInt();
		 
            System.out.println("\n Tabla del " + tabla);
            System.out.println("-------------");
 
            for(int numero = 1;numero<=10;numero++){
                System.out.println(tabla + " x " + numero + " = " + (tabla*numero));
            }
            sc.close();
        }
    }


