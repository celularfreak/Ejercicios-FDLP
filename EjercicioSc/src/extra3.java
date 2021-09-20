import java.util.Scanner;

public class extra3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float  x , y, z, area, litros;
		final int coberturaLitro = 12;
		
		System.out.print("\n\tIntrodueix alçada: ");
		x = sc.nextFloat();
		System.out.print("\n\tIntrodueix amplada: ");
		y = sc.nextFloat();
		System.out.print("\n\tCuantes mans vols donar?: ");
		z = sc.nextInt();
		
		area = x*y;
		
		litros = (float)(area/coberturaLitro)*z;
		
		System.out.println("\n\tNecesites " + litros + " litres de pintura");
		
	}

}
