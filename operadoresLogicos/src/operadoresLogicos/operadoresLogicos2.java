package operadoresLogicos;

public class operadoresLogicos2 {

	public static void main(String[] args) {
		
		boolean W=true, X=true, Y=true, Z=false;
		
		System.out.println("\n\t\t Exercici 2: \n");
		System.out.print("W || Y && X && W || Z = "); 
		System.out.println(W || Y && X && W || Z);
		System.out.print("X && !Y && !X || !W && Y = ");
		System.out.println( X && !Y && !X || !W && Y);
		System.out.print("!(W || !Y) && X || Z = ");
		System.out.println( !(W || !Y) && X || Z);
		System.out.print("X && Y && W || Z || X = ");
		System.out.println(X && Y && W || Z || X);
		System.out.print("Y || !(Y || Z && W) = ");
		System.out.println(Y || !(Y || Z && W));
		System.out.print("!X || !Y || Z && X && !Y = ");
		System.out.println( !X && Y && (!Z || !X));
	}

}
