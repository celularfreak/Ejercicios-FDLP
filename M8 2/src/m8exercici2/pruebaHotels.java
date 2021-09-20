package m8exercici2;

import java.util.*;

public class pruebaHotels {
	
	static ArrayList<Hotels> hoteles = new ArrayList<Hotels>();
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		cargaHoteles();
		  boolean sortir = false;
	       
	        do{
	            switch(menu()){
	                case 1: crearHotel();
	                        break;
	                case 2: donarDeBaixaHotel();
	                        break;
	                case 3: veureHotel();
	                        break;
	                case 4: modificarHotel();
                    break;
	                case 0: System.out.println("Gràcies per utilitzar l'aplicació");
	                		sortir = true;
	                        break;
	            }
	        }while(!sortir);   
	       
	    }
	
	public static byte menu(){
	        Scanner entrada = new Scanner(System.in);
	        byte opcio;
	        final byte MINIMO = 0;
	        final byte MAXIMO = 4;

	        do{
	            System.out.println("\nMENú PRINCIPAL");
	            System.out.println("1. Crea un Hotel.");
	            System.out.println("2. Dona de baixa un Hotel.");
	            System.out.println("3. Veure un Hotel.");
	            System.out.println("4. Modificar un Hotel.");
	            System.out.println("0. Sortir de l'aplicació.\n");
	            opcio = entrada.nextByte();
	            if(opcio < MINIMO || opcio > MAXIMO){
	                System.out.println("Escull una opció vàlida");
	            }
	           
	        }while(opcio < MINIMO || opcio > MAXIMO);
	        return opcio;
	   
	    }
	 
	static void cargaHoteles() {
		
		Hotels hotel = new Hotels("Pelayo", 40, 20, "1000 metros");
		hoteles.add(hotel);
		hotel = new Hotels("Ilusion", 30, 25, "1500 metros");
		hoteles.add(hotel);
		hotel = new Hotels("Sunshine", 60, 70, "20000 metros");
		hoteles.add(hotel);
		hotel = new Hotels("Sheraton", 12, 34, "1200 metros");
		hoteles.add(hotel);
	}
	static void crearHotel () {
		
	
		System.out.println("Introdueix el nom del hotel: ");
		String nom1 = sc.nextLine(); 
		System.out.println("Introdueix el numero d'habitacions: ");
		int numHab1 = sc.nextInt();
		System.out.println("Introdueix el numero de plantes: ");
		int numPlant1 = sc.nextInt();
		System.out.println("Introdueix la superficie del hotel: ");
		String supTotal1 = sc.next();

		Hotels hotel = new Hotels(nom1, numHab1, numPlant1, supTotal1);
		hoteles.add(hotel);
	
	}

	static void donarDeBaixaHotel () {
	Iterator<Hotels> it = hoteles.iterator();
	
		boolean encontrado = false;
	
		System.out.println("Quin hotel vols eliminar?: ");
		String nomElim = sc.nextLine();
		
				while (it.hasNext() && !encontrado) {
					  Hotels hotel = it.next();
	                    if((hotel.getNom()).equals(nomElim)) {
							encontrado = true;
							it.remove();
							}
				}
				if (!encontrado) {System.out.println(nomElim + " no trobat"); }
				else { System.out.println(nomElim + " ha sigut eliminat");}
			
	
	}
			
	static void veureHotel() {
	
		ListIterator <Hotels> listaHoteles =hoteles.listIterator();
	
		boolean encontrado = false;
	
		System.out.println("Quin hotel vols veure?: ");
		String nomBuscar = sc.nextLine();

		while(listaHoteles.hasNext()) {
			Hotels h = (Hotels) listaHoteles.next();
				if (h.getNom().equalsIgnoreCase(nomBuscar)) {
					encontrado = true;
					System.out.print(h.toString());
				}
		} if (!encontrado) {System.out.println(nomBuscar + " no trobat"); }
	}

	static void modificarHotel() {
		ListIterator <Hotels> listaHoteles =hoteles.listIterator();
		
		boolean encontrado = false;

		System.out.println("Quin hotel vols modificar?: ");
		String nomBuscar = sc.nextLine();

		while(listaHoteles.hasNext()) {
			Hotels h = (Hotels) listaHoteles.next();
				if (h.getNom().equalsIgnoreCase(nomBuscar)) {
					encontrado = true;
					System.out.print("Vols modificar el nombre d'habitacions?: ");
					char habitacions = sc.next().charAt(0);
					if (habitacions !='n') {
						System.out.print("Introdueix el nou nombre d'habitacions: ");
						int habNum = sc.nextInt();
						h.setNumHab(habNum);
						}
					System.out.print("Vols modificar el nombre de plantes?: ");
					char plantes = sc.next().charAt(0);
					if (plantes !='n') {
						System.out.print("Introdueix el nou nombre de plantes: ");
						int plantesNum = sc.nextInt();
						h.setNumPlant(plantesNum);	
					}
					System.out.print("Vols modificar la superficie?: ");
					char superficie = sc.next().charAt(0);
					if (superficie !='n') {
						System.out.print("Introdueix la nova superficie: ");
						String superf = sc.nextLine();
						h.setSupTotal(superf);	
					
					}
					break;
				}
				
			}if (!encontrado) {System.out.println(nomBuscar + " no trobat");
			} else { System.out.println(nomBuscar +" modificat");}
		}
	}
