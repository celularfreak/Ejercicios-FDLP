import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;


public class ProbarEdificios {
	static ArrayList<Hospital> hospitals = new ArrayList<Hospital>();
	static ArrayList<Hotel> hotels = new ArrayList<Hotel>();
	static ArrayList<Cinema> cinemes = new ArrayList<Cinema>();
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		iniciarEdificis();
	   
		boolean sortir = false;
	       
	        do{
	            switch(menuPrincipal()){
	                case 1: crearEdificis();
	                        break;
	                case 2: veureEdificis();
	                        break;
	                case 3: eliminarEdificis();
	                        break;
	                case 0: System.out.println("Gràcies per utilitzar l'aplicació");
	                		sortir = true;
	                        break;
	            }
	        }while(!sortir);   
	    }
	

	public static byte menuPrincipal(){
	        Scanner entrada = new Scanner(System.in);
	        byte opcio;
	        final byte MINIMO = 0;
	        final byte MAXIMO = 3;

	        do{
	            System.out.println("\nMENú PRINCIPAL");
	            System.out.println("1. Crear edificis.");
	            System.out.println("2. Veure edificis.");
	            System.out.println("3. Eliminar edificis.");
	            System.out.println("0. Sortir de l'aplicació.\n");
	            opcio = entrada.nextByte();
	            entrada.nextLine();
	            if(opcio < MINIMO || opcio > MAXIMO){
	                System.out.println("Escull una opció vàlida");
	            }
	        }while(opcio < MINIMO || opcio > MAXIMO);
	        return opcio;
	    }
	   
	
	static void iniciarEdificis() {
		
		String nom =  "L’Hospital General de Catalunya";
		int plantes = 10;
		int superficie = 25350;
		int malalts = 315;
		
		Hospital hospital1= new Hospital(nom,plantes,superficie,malalts);
		hospitals.add(hospital1);
		
		
		nom = "Hotel Hilton";
		plantes = 22;
		superficie = 73858;
		int habs = 583;
		Hotel hotel1 = new Hotel(nom,plantes,superficie,habs);
		hotels.add(hotel1);
		
		
		
		nom ="Cinema Montecarlo";
		plantes =1;
		superficie = 3180;
		int aforamentMaxim= 500;
		Cinema cinema1 = new Cinema(nom,plantes,superficie,aforamentMaxim);
		cinemes.add(cinema1);
		}
	static void crearEdificis () {
		
		  boolean sortir1 = false;
	       
	        do{
	            switch(menuCrear()){
	                case 1: 
	                System.out.println("Introdueix el nom del Hospital: ");
	        		String nom1 = sc.nextLine(); 
	        		System.out.println("Introdueix el numero de plantes: ");
	        		int numPlant1 = sc.nextInt();
	        		System.out.println("Introdueix la superficie: ");
	        		int superf1 = sc.nextInt();
	        		System.out.println("Introdueix el numero de malalts: ");
	        		int malalts = sc.nextInt();

	        		Hospital hospital = new Hospital(nom1, numPlant1, superf1, malalts);
	        		hospitals.add(hospital);
	                        break;
	                case 2: 
	                	System.out.println("Introdueix el nom de l'Hotel: ");
		        		String nom2 = sc.nextLine(); 
		        		System.out.println("Introdueix el numero de plantes: ");
		        		int numPlant2 = sc.nextInt();
		        		System.out.println("Introdueix la superficie: ");
		        		int superf2 = sc.nextInt();
		        		System.out.println("Introdueix el numero d'habitacions: ");
		        		int habs = sc.nextInt();

		        		Hotel hotel = new Hotel(nom2, numPlant2, superf2, habs);
		        		hotels.add(hotel);
	                        break;
	                case 3: 
	                	System.out.println("Introdueix el nom del Cinema: ");
		        		String nom3 = sc.nextLine(); 
		        		System.out.println("Introdueix el numero de plantes: ");
		        		int numPlant3 = sc.nextInt();
		        		System.out.println("Introdueix la superficie: ");
		        		int superf3 = sc.nextInt();
		        		System.out.println("Introdueix l'aforament Maxim: ");
		        		int aforo = sc.nextInt();

		        		Cinema cinema = new Cinema(nom3, numPlant3, superf3, aforo);
		        		cinemes.add(cinema);
	                        break;
	              
	                case 0: //System.out.println("Gràcies per utilitzar l'aplicació");
	                		sortir1 = true;
	                        break;
	            }
	        }while(!sortir1);   
	       
	    }
	
	public static byte menuCrear(){
	        Scanner entrada1 = new Scanner(System.in);
	        byte opcio1;
	        final byte MINIMO1 = 0;
	        final byte MAXIMO1 = 3;

	        do{
	            System.out.println("\nMENÚ CREACIO EDIFICIS");
	            System.out.println("1. Crea un Hospital.");
	            System.out.println("2. Crea un Hotel.");
	            System.out.println("3. Crea un Cinema.");
	            System.out.println("0. Tornar menu principal.\n");
	            opcio1 = entrada1.nextByte();
	            entrada1.nextLine();
	            if(opcio1 < MINIMO1 || opcio1 > MAXIMO1){
	                System.out.println("Escull una opció vàlida");
	            }
	        }while(opcio1 < MINIMO1 || opcio1 > MAXIMO1);
	        return opcio1;
	    }
	static void veureEdificis() {
		  boolean sortir = false;
	       
	        do{
	            switch(menuConsultar()){
	                case 1: 
	                	ListIterator <Hospital> listaHospital =hospitals.listIterator();
	                	
	            		boolean encontrado = false;
	            	
	            		System.out.println("Quin hospital vols consultar?: ");
	            		String nomBuscar = sc.nextLine();
	            		
	            		while(listaHospital.hasNext()) {
	            			Hospital h = (Hospital) listaHospital.next();
	            				if (h.getNom().equalsIgnoreCase(nomBuscar)) {
	            					encontrado = true;
	            					System.out.print(h.toString());
	            					System.out.println("\nEl cost de vigilancia es de "+h.calcularCostVigilancia()+" euros.");	
	            				}
	            		} if (!encontrado) {System.out.println(nomBuscar + " no trobat"); }
	                        break;
	                case 2: 
	                	ListIterator <Hotel> listaHotel =hotels.listIterator();
	                	
	            		boolean encontrado2 = false;
	            	
	            		System.out.println("Quin hotel vols consultar?: ");
	            		String nomBuscar2 = sc.nextLine();

	            		while(listaHotel.hasNext()) {
	            			Hotel h2 = (Hotel) listaHotel.next();
	            				if (h2.getNom().equalsIgnoreCase(nomBuscar2)) {
	            					encontrado2 = true;
	            					System.out.print(h2.toString());
	            					System.out.println();
	            					h2.serveiHabitacions();
	            					System.out.println("El cost de vigilancia es de "+h2.calcularCostVigilancia()+" euros.");
	            				}
	            		} if (!encontrado2) {System.out.println(nomBuscar2 + " no trobat"); }
	                        break;
	                case 3: 
	                	ListIterator <Cinema> listaCinema =cinemes.listIterator();
	                	
	            		boolean encontrado3 = false;
	            	
	            		System.out.println("Quin cinema vols consultar?: ");
	            		String nomBuscar3 = sc.nextLine();

	            		while(listaCinema.hasNext()) {
	            			Cinema h3 = (Cinema) listaCinema.next();
	            				if (h3.getNom().equalsIgnoreCase(nomBuscar3)) {
	            					encontrado3 = true;
	            					System.out.println("Cuanta gent asisteix a la sessio? :");
	            					int asist =sc.nextInt();
	            					System.out.println("Quin preu te la sessio? :");
	            					Float preu =sc.nextFloat();				
	            					System.out.print(h3.toString());
	            					System.out.println("El cost de vigilancia es de "+h3.calcularCostVigilancia()+" euros.");
	            					h3.projectarSessio(asist,preu);
	            				}
	            		} if (!encontrado3) {System.out.println(nomBuscar3 + " no trobat"); }
	                        break;
	              
	                case 0: //System.out.println("Gràcies per utilitzar l'aplicació");
	                		sortir = true;
	                        break;
	            }
	        }while(!sortir);   
	}
	public static byte menuConsultar(){
		        Scanner entrada2 = new Scanner(System.in);
		        byte opcio2;
		        final byte MINIMO2 = 0;
		        final byte MAXIMO2 = 3;

		        do{
		            System.out.println("\nMENÚ CONSULTA EDIFICIS");
		            System.out.println("1. Consulta Hospitals.");
		            System.out.println("2. Consulta Hotels.");
		            System.out.println("3. Consulta Cinemes.");
		            System.out.println("0. Tornar menu principal.\n");
		            opcio2 = entrada2.nextByte();
		            entrada2.nextLine();
		            if(opcio2 < MINIMO2 || opcio2 > MAXIMO2){
		                System.out.println("Escull una opció vàlida");
		            }
		        }while(opcio2 < MINIMO2 || opcio2 > MAXIMO2);
		        return opcio2;
	}
	static void eliminarEdificis() {
		  boolean sortir = false;
	       
	        do{
	            switch(menuEliminar()){
	                case 1: 
	                	Iterator<Hospital> it = hospitals.iterator();
	            		
	            		boolean encontrado = false;
	            	
	            		System.out.println("Quin hospital vols eliminar?: ");
	            		String nomElim = sc.nextLine();
	            		
	            				while (it.hasNext() && !encontrado) {
	            					  Hospital hospital = it.next();
	            	                    if((hospital.getNom()).equals(nomElim)) {
	            							encontrado = true;
	            							it.remove();
	            							}
	            				}
	            				if (!encontrado) {System.out.println(nomElim + " no trobat"); }
	            				else { System.out.println(nomElim + " ha sigut eliminat");}
	                        break;
	                case 2: 
	                	Iterator<Hotel> it2 = hotels.iterator();
	            		
	            		boolean encontrado2 = false;
	            	
	            		System.out.println("Quin hospital vols eliminar?: ");
	            		String nomElim2 = sc.nextLine();
	            		
	            				while (it2.hasNext() && !encontrado2) {
	            					  Hotel hotel= it2.next();
	            	                    if((hotel.getNom()).equals(nomElim2)) {
	            							encontrado2 = true;
	            							it2.remove();
	            							}
	            				}
	            				if (!encontrado2) {System.out.println(nomElim2 + " no trobat"); }
	            				else { System.out.println(nomElim2 + " ha sigut eliminat");}
	                        break;
	                case 3: 
	                	Iterator<Cinema> it3 = cinemes.iterator();
	            		
	            		boolean encontrado3 = false;
	            	
	            		System.out.println("Quin Cinema vols eliminar?: ");
	            		String nomElim3 = sc.nextLine();
	            		
	            				while (it3.hasNext() && !encontrado3) {
	            					  Cinema cinema= it3.next();
	            	                    if((cinema.getNom()).equals(nomElim3)) {
	            							encontrado3 = true;
	            							it3.remove();
	            							}
	            				}
	            				if (!encontrado3) {System.out.println(nomElim3 + " no trobat"); }
	            				else { System.out.println(nomElim3 + " ha sigut eliminat");}
	                        break;
	              
	                case 0: //System.out.println("Gràcies per utilitzar l'aplicació");
	                		sortir = true;
	                        break;
	            }
	        }while(!sortir);   
}
	public static byte menuEliminar(){
    Scanner entrada3 = new Scanner(System.in);
    byte opcio3;
    final byte MINIMO3 = 0;
    final byte MAXIMO3 = 3;

    do{
        System.out.println("\nMENÚ Eliminar EDIFICIS");
        System.out.println("1. Eliminar Hospitals.");
        System.out.println("2. Eliminar Hotels.");
        System.out.println("3. Eliminar Cinemes.");
        System.out.println("0. Tornar menu principal.\n");
        opcio3 = entrada3.nextByte();
        entrada3.nextLine();
        if(opcio3 < MINIMO3 || opcio3 > MAXIMO3){
            System.out.println("Escull una opció vàlida");
        }
    }while(opcio3 < MINIMO3 || opcio3 > MAXIMO3);
    return opcio3;
}
}