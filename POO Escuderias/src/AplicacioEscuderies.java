import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AplicacioEscuderies {
	static ArrayList<Escuderia>escuderies = new ArrayList<Escuderia>();
	//static ArrayList<Pilot>pilots = new ArrayList<Pilot>();
	//static ArrayList<Mecanic>mecanics = new ArrayList<Mecanic>();
	//static ArrayList<Cotxe>cotxes = new ArrayList<Cotxe>();
	
	public static void main(String[] args) {
		
			iniciaEscuderiaCotxe();
		
			boolean sortir = false;
	    
	    do{
	        switch(menu()){
	            case 1: altaPilot();
	                    break;
	            case 2: consultaPilot();
	                    break;
	            case 3: eliminaPilot();
	                    break;
	            case 4: altaMecanic();
	            	break;
	            case 5: consultaMecanic();
	            	break;
	            case 6: eliminaMecanic();
	            	break;
	            case 7: consultaEscuderia();
	            	break;
	            case 8: consultaCotxes();
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
	    final byte MAXIMO = 8;

	    do{
	        System.out.println("\nMENú PRINCIPAL");
	        System.out.println("0. Sortir de l'aplicació.");
	        System.out.println("1. Crear pilot.");
	        System.out.println("2. Consulta pilot.");
	        System.out.println("3. Elimina pilot.");
	        System.out.println("4. Crear mecanic.");
	        System.out.println("5. Consulta mecanic.");
	        System.out.println("6. Elimina mecanic.");
	        System.out.println("7. Consulta Escuderia.");
	        System.out.println("8. Consulta Cotxes.");
	        opcio = entrada.nextByte();
	        if(opcio < MINIMO || opcio > MAXIMO){
	            System.out.println("Escull una opció vàlida");
	        }
	    }while(opcio < MINIMO || opcio > MAXIMO);
	    return opcio;
	}

	static void iniciaEscuderiaCotxe() {
	
	Escuderia escuderia = new Escuderia("Ferrari",100000000,"Italia");
	escuderies.add(escuderia);
	
	escuderia.setPilots(new ArrayList<Pilot>());
	Pilot pilot = new Pilot("Charles","Leclerc",23,3,1.71,65.0);
	Pilot pilot1 = new Pilot("Carlos","Sainz",25,1,1.75,67.0);
	escuderia.agregarPilot(pilot);
	escuderia.agregarPilot(pilot1);
	
	escuderia.setMecanics(new ArrayList<Mecanic>());
	Mecanic mecanic = new Mecanic("Luis","Lopez",45,10,true);
	Mecanic mecanic1 = new Mecanic("Sergio","Perez",41,5,false);
	escuderia.agregarMecanic(mecanic);
	escuderia.agregarMecanic(mecanic1);
	
	escuderia.setCotxes(new ArrayList<Cotxe>());
	Cotxe cotxe = new Cotxe(400,332,"Vermell",20000000);
	escuderia.agregarCotxe(cotxe)
	;
	Escuderia escuderia2 = new Escuderia("Williams",50000000,"Anglaterra");
	escuderies.add(escuderia2);
	
	escuderia2.setPilots(new ArrayList<Pilot>());
	Pilot pilot2 = new Pilot("Nicholas","Latifi",27,5,1.51,55.0);
	Pilot pilot3 = new Pilot("George","Russell",22,4,1.65,61.0);
	escuderia2.agregarPilot(pilot2);
	escuderia2.agregarPilot(pilot3);
	
	escuderia2.setMecanics(new ArrayList<Mecanic>());
	Mecanic mecanic2 = new Mecanic("Xavi","Loro",24,2,true);
	Mecanic mecanic3 = new Mecanic("Silvia","Pera",30,7,true);
	escuderia2.agregarMecanic(mecanic2);
	escuderia2.agregarMecanic(mecanic3);
	
	escuderia2.setCotxes(new ArrayList<Cotxe>());
	Cotxe cotxe2 = new Cotxe(387,315,"Blau",15000000);
	escuderia2.agregarCotxe(cotxe2);
	
	Escuderia escuderia3 = new Escuderia("Alpine",100000000,"França");
	escuderies.add(escuderia3);
	
	escuderia3.setPilots(new ArrayList<Pilot>());
	Pilot pilot4 = new Pilot("Fernando","Alonso",41,1,1.61,55.0);
	Pilot pilot5 = new Pilot("Esteban","Ocon",27,4,1.65,61.0);
	escuderia3.agregarPilot(pilot4);
	escuderia3.agregarPilot(pilot5);
	
	escuderia3.setMecanics(new ArrayList<Mecanic>());
	Mecanic mecanic4 = new Mecanic("Maria","Serra",45,14,true);
	Mecanic mecanic5 = new Mecanic("Pedro","Sanchez",30,7,false);
	escuderia3.agregarMecanic(mecanic4);
	escuderia3.agregarMecanic(mecanic5);
	
	escuderia3.setCotxes(new ArrayList<Cotxe>());
	Cotxe cotxe3 = new Cotxe(397,325,"Groc",17000000);
	escuderia3.agregarCotxe(cotxe3);
	
}
	static void altaPilot() {
		ListIterator <Escuderia> listaEscuderies = escuderies.listIterator();
	
		boolean encontrado = false;
		boolean encontrado2 = false;
		
		String escuderia = Teclado.leerString("Introdueix la escuderia on fitxara el pilot: ");
		while(listaEscuderies.hasNext()) {
			Escuderia e = (Escuderia) listaEscuderies.next();
				if (e.getNom().equalsIgnoreCase(escuderia)) {
					encontrado = true;
					System.out.println("La escuderia te aquets pilots:\n"+e.getPilots());
				
					Iterator<Pilot> it = e.getPilots().listIterator();
					String nombre = Teclado.leerString("Introdueix el nom del pilot: ");
					String apellido = Teclado.leerString("Introdueix el cognom del pilot: ");
					
					while(it.hasNext()&&!encontrado2) {
						Pilot pilot = it.next();
						if (pilot.getNom().equalsIgnoreCase(nombre)&&pilot.getPrimerCognom().equalsIgnoreCase(apellido)) {
								encontrado2 = true;
								System.out.println("El pilot ja existeix");
								}
							}if (!encontrado2) {
								int edat = Teclado.leerInt("Introdueix l'edat del pilot: ");
								int antiguitat = Teclado.leerInt("Introdueix l'antiguitat a la escuderia:" );
								double alçada = Teclado.leerDouble("Introdueix l'alçada del pilot: ");
								double pes = Teclado.leerDouble("Introdueix el pes del pilot: ");
							
								Pilot pilot =new Pilot(nombre,apellido,edat,antiguitat,alçada,pes);
								e.agregarPilot(pilot);
								System.out.println("Pilot "+nombre+" "+apellido+" creat");
							}	
				}
			}if (!encontrado) {System.out.println("La escuderia "+escuderia+" no existeix");}
			Teclado.leerString("Pulsa per retornar al menu");
		}
	static void consultaPilot() {
		ListIterator <Escuderia> listaEscuderies = escuderies.listIterator();
		
		boolean encontrado = false;
		boolean encontrado2 = false;
		
		String escuderia = Teclado.leerString("Introdueix la escuderia del pilot que vols consultar: ");
		while(listaEscuderies.hasNext()) {
			Escuderia e = (Escuderia) listaEscuderies.next();
				if (e.getNom().equalsIgnoreCase(escuderia)) {
					encontrado = true;
				
					Iterator<Pilot> it = e.getPilots().listIterator();
					String nombre = Teclado.leerString("Introdueix el nom del pilot: ");
					String apellido = Teclado.leerString("Introdueix el cognom del pilot: ");
					
					while(it.hasNext()&&!encontrado2) {
						Pilot pilot = it.next();
						if (pilot.getNom().equalsIgnoreCase(nombre)&&pilot.getPrimerCognom().equalsIgnoreCase(apellido)) {
								encontrado2 = true;
								System.out.println(pilot);
								}
							}if (!encontrado2) {
								
								System.out.println("Pilot "+nombre+" "+apellido+" no existeix");
							}	
				}
			}if (!encontrado) {System.out.println("La escuderia "+escuderia+" no existeix");}
			Teclado.leerString("Pulsa per retornar al menu");
		}
	static void eliminaPilot() {
ListIterator <Escuderia> listaEscuderies = escuderies.listIterator();
		
		boolean encontrado = false;
		boolean encontrado2 = false;
		
		String escuderia = Teclado.leerString("Introdueix la escuderia del pilot que vols eliminar: ");
		while(listaEscuderies.hasNext()) {
			Escuderia e = (Escuderia) listaEscuderies.next();
				if (e.getNom().equalsIgnoreCase(escuderia)) {
					encontrado = true;
					System.out.println("La escuderia te aquets pilots:\n"+e.getPilots());
					Iterator<Pilot> it = e.getPilots().listIterator();
					String nombre = Teclado.leerString("Introdueix el nom del pilot: ");
					String apellido = Teclado.leerString("Introdueix el cognom del pilot: ");
					
					while(it.hasNext()&&!encontrado2) {
						Pilot pilot = it.next();
						if (pilot.getNom().equalsIgnoreCase(nombre)&&pilot.getPrimerCognom().equalsIgnoreCase(apellido)) {
								encontrado2 = true;
								it.remove();
								System.out.print("Pilot eliminat");
								}
							}if (!encontrado2) {
								
								System.out.println("Pilot "+nombre+" "+apellido+" no existeix");
							}	
				}
			}if (!encontrado) {System.out.println("La escuderia "+escuderia+" no existeix");}
			Teclado.leerString("Pulsa per retornar al menu");
		}
	static void altaMecanic() {
		ListIterator <Escuderia> listaEscuderies = escuderies.listIterator();
	
		boolean encontrado = false;
		boolean encontrado2 = false;
		
		String escuderia = Teclado.leerString("Introdueix la escuderia on treballara el mecanic: ");
		while(listaEscuderies.hasNext()) {
			Escuderia e = (Escuderia) listaEscuderies.next();
				if (e.getNom().equalsIgnoreCase(escuderia)) {
					encontrado = true;
					System.out.println("La escuderia te aquets mecanics:\n"+e.getMecanics());
					
					Iterator<Mecanic> it = e.getMecanics().listIterator();
					String nombre = Teclado.leerString("Introdueix el nom del mecanic: ");
					String apellido = Teclado.leerString("Introdueix el cognom del mecanic: ");
					
					while(it.hasNext()&&!encontrado2) {
						Mecanic mecanic = it.next();
						if (mecanic.getNom().equalsIgnoreCase(nombre)&&mecanic.getPrimerCognom().equalsIgnoreCase(apellido)) {
								encontrado2 = true;
								System.out.println("El mecanic ja existeix");
								}
							}if (!encontrado2) {
								int edat = Teclado.leerInt("Introdueix l'edat del mecanic: ");
								int antiguitat = Teclado.leerInt("Introdueix l'antiguitat a la escuderia:" );
								boolean estudis = Teclado.leerSiNo("Te estudis (s/n) ?: ");
							
								Mecanic mecanic =new Mecanic(nombre,apellido,edat,antiguitat,estudis);
								e.agregarMecanic(mecanic);
								System.out.println("Mecanic "+nombre+" "+apellido+" creat");
							}	
				}
			}if (!encontrado) {System.out.println("La escuderia "+escuderia+" no existeix");}
			Teclado.leerString("Pulsa per retornar al menu");
		}
	static void consultaMecanic() {
		ListIterator <Escuderia> listaEscuderies = escuderies.listIterator();
		
		boolean encontrado = false;
		boolean encontrado2 = false;
		
		String escuderia = Teclado.leerString("Introdueix la escuderia del mecanic que vols consultar: ");
		while(listaEscuderies.hasNext()) {
			Escuderia e = (Escuderia) listaEscuderies.next();
				if (e.getNom().equalsIgnoreCase(escuderia)) {
					encontrado = true;
				
					Iterator<Mecanic> it = e.getMecanics().listIterator();
					String nombre = Teclado.leerString("Introdueix el nom del mecanic: ");
					String apellido = Teclado.leerString("Introdueix el cognom del mecanic: ");
					
					while(it.hasNext()&&!encontrado2) {
						Mecanic mecanic = it.next();
						if (mecanic.getNom().equalsIgnoreCase(nombre)&&mecanic.getPrimerCognom().equalsIgnoreCase(apellido)) {
								encontrado2 = true;
								System.out.println(mecanic);
								}
							}if (!encontrado2) {
								
								System.out.println("Mecanic "+nombre+" "+apellido+" no existeix");
							}	
				}
			}if (!encontrado) {System.out.println("La escuderia "+escuderia+" no existeix");}
			Teclado.leerString("Pulsa per retornar al menu");
		}
	static void eliminaMecanic() {
ListIterator <Escuderia> listaEscuderies = escuderies.listIterator();
		
		boolean encontrado = false;
		boolean encontrado2 = false;
		
		String escuderia = Teclado.leerString("Introdueix la escuderia del pilot que vols eliminar: ");
		while(listaEscuderies.hasNext()) {
			Escuderia e = (Escuderia) listaEscuderies.next();
				if (e.getNom().equalsIgnoreCase(escuderia)) {
					encontrado = true;
					System.out.println("La escuderia "+e+" te aquets mecanics:\n"+e.getMecanics());
					
					Iterator<Mecanic> it = e.getMecanics().listIterator();
					String nombre = Teclado.leerString("Introdueix el nom del mecanic: ");
					String apellido = Teclado.leerString("Introdueix el cognom del mecanic: ");
					
					while(it.hasNext()&&!encontrado2) {
						Mecanic mecanic = it.next();
						if (mecanic.getNom().equalsIgnoreCase(nombre)&&mecanic.getPrimerCognom().equalsIgnoreCase(apellido)) {
								encontrado2 = true;
								it.remove();
								System.out.print("Mecanic eliminat");
								}
							}if (!encontrado2) {
								
								System.out.println("Mecanic "+nombre+" "+apellido+" no existeix");
							}	
				}
			}if (!encontrado) {System.out.println("La escuderia no existeix");}
			Teclado.leerString("Pulsa per retornar al menu");
		}
	static void consultaEscuderia() {
		ListIterator <Escuderia> listaEscuderies = escuderies.listIterator();
		
		boolean encontrado = false;
		
		String escuderia = Teclado.leerString("Introdueix la escuderia que vols consultar: ");
		while(listaEscuderies.hasNext()) {
			Escuderia e = (Escuderia) listaEscuderies.next();
				if (e.getNom().equalsIgnoreCase(escuderia)) {
					encontrado = true;
					System.out.println("La escuderia "+e+" te aquets Mecanics:\n"+e.getMecanics());
					System.out.println("La escuderia "+e+" te aquets pilots:\n"+e.getPilots());
					
				}
			}if (!encontrado) {System.out.println("La escuderia no existeix");}
		Teclado.leerString("Pulsa per retornar al menu");
	}	static void consultaCotxes() {
		ListIterator <Escuderia> listaEscuderies = escuderies.listIterator();
		
		boolean encontrado = false;
		
		String escuderia = Teclado.leerString("Introdueix la escuderia que vols consultar: ");
		while(listaEscuderies.hasNext()) {
			Escuderia e = (Escuderia) listaEscuderies.next();
				if (e.getNom().equalsIgnoreCase(escuderia)) {
					encontrado = true;
					System.out.println("La escuderia "+e+" te aquet cotxe.\n"+e.getCotxes());
					
				}
			}if (!encontrado) {System.out.println("La escuderia no existeix");}
			Teclado.leerString("Pulsa per retornar al menu");
	}
	
}