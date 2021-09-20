package ejerciciosArrays;


public class cadenas {
	 public static void main(String[] args) {
		 String cadena = "IT Academy";
		 
		 System.out.println("Veamos las posiciones:");
		 for (int i=0; i<cadena.length(); i++) {
			 System.out.println(i + "= " +cadena.charAt(i));
		 }
		 
		 System.out.println("Recorrido al revés...");
		 for (int i=cadena.length()-1; i>=0; i--) {
			 System.out.println(i + "= " +cadena.charAt(i));
		 }
		 
		 System.out.println("El largo de la cadena es " + cadena.length());
		 int posicion = cadena.indexOf(" ");
		 
		 System.out.println("El espacio en blanco se encuentra en la posición " + posicion);
		 
		 //la primera letra de una cadena de texto siempre tiene el índice 0
		 
		 String subCadena = cadena.substring(posicion+1, cadena.length());
		 //Extraemos Academy a subcadena
		 System.out.println("Subcadena en minúsculas: " + subCadena.toLowerCase());
		 System.out.println("Cadena en mayúsculas: " + cadena.toUpperCase());
		 
		 // Reemplazamos I por E (reemplaza todas las I por E
		 System.out.println(cadena.replace('I', 'E'));
		 // Los métodos se pueden encadenar...
		 System.out.println(cadena.toUpperCase().replace('A', 'O'));
		 
	 }
}