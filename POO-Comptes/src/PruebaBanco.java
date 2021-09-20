import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class PruebaBanco {
	static ArrayList<Cliente>clientes = new ArrayList<Cliente>();
	//static ArrayList<Cuenta>cuentas = new ArrayList<Cuenta>();
	
public static void main(String[] args) {
	
	iniciarClientesCuentas();
	
	
	boolean sortir = false;
    
    do{
        switch(menu()){
            case 1: crearCliente();
                    break;
            case 2: eliminarCliente();
                    break;
            case 3: crearCuentaCliente();
                    break;
            case 4: mostrarCuentaCliente();
            	break;
            case 5: eliminarCuentaCliente();
            	break;
            case 6: ingresarSaldo();
            	break;
            case 7: retirarSaldo();
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
    final byte MAXIMO = 7;

    do{
        System.out.println("\nMENú PRINCIPAL");
        System.out.println("0. Sortir de l'aplicació.");
        System.out.println("1. Crear client.");
        System.out.println("2. Eliminar client.");
        System.out.println("3. Crear compte d'un client.");
        System.out.println("4. Mostrar les comptes d'un client.");
        System.out.println("5. Eliminar una compta d'un client.");
        System.out.println("6. Ingresar euros en una compta d'un client.");
        System.out.println("7. Retirar euros en una compta d'un client.");
        opcio = entrada.nextByte();
        if(opcio < MINIMO || opcio > MAXIMO){
            System.out.println("Escull una opció vàlida");
        }
    }while(opcio < MINIMO || opcio > MAXIMO);
    return opcio;
}

static void crearCliente(){
	ListIterator <Cliente> listaClientes = clientes.listIterator();
	boolean encontrado = false;
	System.out.println("Actualment tenim aquest clientes i comptes al banc:\n" +clientes);
	Teclado.leerString("Pulsa per continuar");	
	  String nombre = Teclado.leerString("Introdueix el nom del client: ");
	  String apellido = Teclado.leerString("Introdueix el cognom del client: ");
	
		
		while(listaClientes.hasNext()) {
			Cliente c = (Cliente) listaClientes.next();
				if (c.getNombre().equalsIgnoreCase(nombre)&&c.getApellido().equalsIgnoreCase(apellido)) {
					encontrado = true;
					System.out.println("El Client ja existeix.");
					
				}
		} if (!encontrado) {
			Cliente cliente =new Cliente(nombre,apellido);
			clientes.add(cliente);
			cliente.setCuentas(new ArrayList<Cuenta>());
			System.out.println("Client "+nombre+" "+apellido+" creat");}
			Teclado.leerString("Pulsa per retornar al menu");	
}
static void crearCuentaCliente(){
	
	ListIterator <Cliente> listaClientes =clientes.listIterator();
	
	boolean encontrado = false;
	System.out.println("Actualment tenim aquest clientes i comptes al banc:\n" +clientes);
	Teclado.leerString("Pulsa per continuar");	
	
	String nombre = Teclado.leerString("Introdueix el nom del client: ");
	String apellido = Teclado.leerString("Introdueix el cognom del client: ");
	
		
		while(listaClientes.hasNext()) {
			Cliente c = (Cliente) listaClientes.next();
				if (c.getNombre().equalsIgnoreCase(nombre)&&c.getApellido().equalsIgnoreCase(apellido)) {
					encontrado = true;
					int numAleat =(int) Math.floor(Math.random()*100+10);
					Cuenta cuenta = new Cuenta();
					cuenta.setNumCuenta(numAleat);
					cuenta.setNombre(nombre);
					cuenta.setApellido(apellido);
					c.agregarCuenta(cuenta);
				}
		} if (!encontrado) {System.out.println("Client no trobat"); }
			else { System.out.println("El compte ha sigut creat");}
		Teclado.leerString("Pulsa per retornar al menu");
}
static void eliminarCliente(){
	Iterator<Cliente> it = clientes.iterator();
	
	boolean encontrado = false;
	
	System.out.println("Actualment tenim aquest clientes i comptes al banc:\n" +clientes);
	Teclado.leerString("Pulsa per continuar");	
	
	 String nombre = Teclado.leerString("Introdueix el nom del client a eliminar: ");
	 String apellido = Teclado.leerString("Introdueix el cognom del client a eliminar: ");
	
			while (it.hasNext() && !encontrado) {
				  Cliente cliente= it.next();
                    if((cliente.getNombre()).equalsIgnoreCase(nombre)&&cliente.getApellido().equalsIgnoreCase(apellido)) {
						encontrado = true;
						it.remove();
						}
			}
			if (!encontrado) {System.out.println(nombre+" "+apellido + " no trobat"); }
			else { System.out.println(nombre+" "+apellido + " ha sigut eliminat");}
			Teclado.leerString("Pulsa per retornar al menu");
}
static void mostrarCuentaCliente() {
	ListIterator <Cliente> listaClientes = clientes.listIterator();
	boolean encontrado = false;

	  String nombre = Teclado.leerString("Introdueix el nom del client: ");
	  String apellido = Teclado.leerString("Introdueix el cognom del client: ");
	
		
		while(listaClientes.hasNext()) {
			Cliente c = (Cliente) listaClientes.next();
				if (c.getNombre().equalsIgnoreCase(nombre)&&c.getApellido().equalsIgnoreCase(apellido)) {
					encontrado = true;
					System.out.println(c.getCuentas());
					
				}
		} if (!encontrado) {System.out.println("Client no trobat"); }
		Teclado.leerString("Pulsa per retornar al menu");
			
}
static void eliminarCuentaCliente(){
	
	ListIterator <Cliente> listaClientes = clientes.listIterator();
	
	
	boolean encontrado = false;
	boolean encontrado2 = false;
	System.out.println("Actualment tenim aquest clientes i comptes al banc:\n" +clientes);
	Teclado.leerString("Pulsa per continuar");	
	  String nombre = Teclado.leerString("Introdueix el nom del client de qui vols eliminar el compte: ");
	  String apellido = Teclado.leerString("Introdueix el cognom del client de qui vols eliminar el compte: ");
	
	  while(listaClientes.hasNext()) {
			Cliente c = (Cliente) listaClientes.next();
				if (c.getNombre().equalsIgnoreCase(nombre)&&c.getApellido().equalsIgnoreCase(apellido)) {
					encontrado = true;
					System.out.println(c.getCuentas());
					Iterator<Cuenta> it2 = c.getCuentas().iterator();
					int pregunta = Teclado.leerInt("Quin compte vols eliminar?: ");
					while (it2.hasNext() && !encontrado2) {
						  Cuenta cuenta = it2.next();
		                    if (pregunta == cuenta.getNumCuenta()){
								encontrado2 = true;
								it2.remove();
								}
					}
					if (!encontrado2) {System.out.println("Compte"+ pregunta+" no trobat"); }
					else { System.out.println("El compte "+pregunta+" ha sigut eliminat");}
						}
			}
			if (!encontrado) {System.out.println(nombre+" "+apellido + " no trobat"); }
			Teclado.leerString("Pulsa per retornar al menu");

	}
static void ingresarSaldo() {
	
	ListIterator <Cliente> listaClientes = clientes.listIterator();
	
	
	boolean encontrado = false;
	boolean encontrado2 = false;
	System.out.println("Actualment tenim aquest clientes i comptes al banc:\n" +clientes);
	Teclado.leerString("Pulsa per continuar");	
	  String nombre = Teclado.leerString("Introdueix el nom del client a qui vols ingresar saldo: ");
	  String apellido = Teclado.leerString("Introdueix el cognom del client a qui vols ingresar saldo: ");
	
	  while(listaClientes.hasNext()) {
			Cliente c = (Cliente) listaClientes.next();
				if (c.getNombre().equalsIgnoreCase(nombre)&&c.getApellido().equalsIgnoreCase(apellido)) {
					encontrado = true;
					System.out.println(c.getCuentas());
					Iterator<Cuenta> it2 = c.getCuentas().iterator();
					int pregunta = Teclado.leerInt("A Quin compte vols ingresar saldo?: ");
					while (it2.hasNext() && !encontrado2) {
						  Cuenta cuenta = it2.next();
		                    if (pregunta == cuenta.getNumCuenta()){
								encontrado2 = true;
								int cuantitat = Teclado.leerInt("Quina cuantitat vols ingresar?" );
								cuenta.ingresar(cuantitat);
								System.out.println("El saldo actual es: "+cuenta.getSaldo()+" euros.");
								}
					}
					if (!encontrado2) {System.out.println("Compte"+ pregunta+" no trobat"); }
					else { System.out.println("El compte "+pregunta+" ha sigut actualitzat");}
						}
			}
			if (!encontrado) {System.out.println(nombre+" "+apellido + " no trobat"); }
			Teclado.leerString("Pulsa per retornar al menu");
}
static void retirarSaldo() {
		
		ListIterator <Cliente> listaClientes = clientes.listIterator();
		
		boolean encontrado = false;
		boolean encontrado2 = false;
		int cuantitat = 0;
		System.out.println("Actualment tenim aquest clientes i comptes al banc:\n" +clientes);
		Teclado.leerString("Pulsa per continuar");	
		  String nombre = Teclado.leerString("Introdueix el nom del client a qui vols retirar saldo: ");
		  String apellido = Teclado.leerString("Introdueix el cognom del client a qui vols retirar saldo: ");
		
		  while(listaClientes.hasNext()) {
				Cliente c = (Cliente) listaClientes.next();
					if (c.getNombre().equalsIgnoreCase(nombre)&&c.getApellido().equalsIgnoreCase(apellido)) {
						encontrado = true;
						System.out.println(c.getCuentas());
						Iterator<Cuenta> it2 = c.getCuentas().iterator();
						int pregunta = Teclado.leerInt("A Quin compte vols retirar saldo?: ");
						while (it2.hasNext() && !encontrado2) {
							  Cuenta cuenta = it2.next();
			                    if (pregunta == cuenta.getNumCuenta()){
									encontrado2 = true;
										do {
											cuantitat = Teclado.leerInt("Quina cuantitat vols retirar?" );
											System.out.println("El saldo actual del compte "+pregunta+" es de"+cuenta.getSaldo()+" euros.\nNo pots retirar mes de "+cuenta.getSaldo());
										}while (cuantitat>cuenta.getSaldo()); {
									cuenta.retirar(cuantitat);}
									System.out.println("El saldo actual es: "+cuenta.getSaldo()+" euros.");
									}
						}
						if (!encontrado2) {System.out.println("Compte"+ pregunta+" no trobat"); }
						else { System.out.println("El compte "+pregunta+" ha sigut actualitzat");}
							}
				}
				if (!encontrado) {System.out.println(nombre+" "+apellido + " no trobat"); }
				Teclado.leerString("Pulsa per retornar al menu");
	}
static void iniciarClientesCuentas() {
 	
Cliente cliente =new Cliente("David","Nuñez");
clientes.add(cliente);
cliente.setCuentas(new ArrayList<Cuenta>());
Cuenta cuenta = new Cuenta(1,"David","Nuñez");
cliente.agregarCuenta(cuenta);
cuenta.setSaldo(1500);

Cuenta cuenta1 = new Cuenta();
cuenta1.setNumCuenta(2);
cuenta1.setNombre("David");
cuenta1.setApellido("Nuñez");
cuenta1.setSaldo(200);
cliente.agregarCuenta(cuenta1);

Cuenta cuenta2 = new Cuenta();
cuenta2.setNumCuenta(3);
cuenta2.setNombre("David");
cuenta2.setApellido("Nuñez");
cuenta2.setSaldo(1000);
cliente.agregarCuenta(cuenta2);

Cuenta cuenta3 = new Cuenta();
cuenta3.setNumCuenta(4);
cuenta3.setNombre("David");
cuenta3.setApellido("Nuñez");
cliente.agregarCuenta(cuenta3);

Cliente cliente2 =new Cliente("Rita","De la Torre");
clientes.add(cliente2);
cliente2.setCuentas(new ArrayList<Cuenta>());
Cuenta cuenta4 = new Cuenta();
cuenta4.setNumCuenta(4);
cuenta4.setNombre("Rita");
cuenta4.setApellido("De la Torre");
cuenta4.setSaldo(4000);
cliente2.agregarCuenta(cuenta4);

Cliente cliente3 =new Cliente("Toni","Aguilar");
clientes.add(cliente3);
cliente3.setCuentas(new ArrayList<Cuenta>());
Cuenta cuenta5 = new Cuenta();
cuenta5.setNumCuenta(5);
cuenta5.setNombre("Toni");
cuenta5.setApellido("Aguilar");
cuenta5.setSaldo(4500);
cliente3.agregarCuenta(cuenta5);

Cliente cliente4 =new Cliente("Xavier","Pilasi");
clientes.add(cliente4);
cliente4.setCuentas(new ArrayList<Cuenta>());
Cuenta cuenta6 = new Cuenta();
cuenta6.setNumCuenta(6);
cuenta6.setNombre("Xavier");
cuenta6.setApellido("Pilasi");
cuenta6.setSaldo(560);
cliente4.agregarCuenta(cuenta6);
	}
}

