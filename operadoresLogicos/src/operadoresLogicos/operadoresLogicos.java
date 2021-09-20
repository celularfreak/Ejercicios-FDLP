package operadoresLogicos;

public class operadoresLogicos {

	public static void main(String[] args) {
		
		boolean X=true, Y=false, Z=true;
		
		
		System.out.println("\n\t\t Exercici 1: \n");
		System.out.print("(X && Y) || (X && Z) = "); 
		System.out.println((X && Y) || (X && Z));
		System.out.print("(X || !Y) && (!X || Z) = ");
		System.out.println((X || !Y) && (!X || Z));
		System.out.print("X || Y && Z = ");
		System.out.println(X || Y && Z);
		System.out.print("!(X || Y) && Z = ");
		System.out.println(!(X || Y) && Z);
		System.out.print("X || Y || X && !Z && !Y = ");
		System.out.println(X || Y || X && !Z && !Y);
		System.out.print("!X || !Y || Z && X && !Y = ");
		System.out.println(!X || !Y || Z && X && !Y);
		
	}

}
