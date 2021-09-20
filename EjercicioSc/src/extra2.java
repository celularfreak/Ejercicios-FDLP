import java.util.Scanner;

public class extra2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int  x;
		int varInt;
		
		System.out.print("\tIntrodueix un nombre: ");
		x = sc.nextInt();
		
		varInt = (x > 10) ? x : 1 ;
		

		System.out.println(varInt + " x 1: " + (varInt*1));
		System.out.println(varInt + " x 2: " + (varInt*2));
		System.out.println(varInt + " x 3: " + (varInt*3));
		System.out.println(varInt + " x 4: " + (varInt*4));
		System.out.println(varInt + " x 5: " + (varInt*5));
		System.out.println(varInt + " x 6: " + (varInt*6));
		System.out.println(varInt + " x 7: " + (varInt*7));
		System.out.println(varInt + " x 8: " + (varInt*8));
		System.out.println(varInt + " x 9: " + (varInt*9));
		System.out.println(varInt + " x 10: " + (varInt*10));
		

	}

}
