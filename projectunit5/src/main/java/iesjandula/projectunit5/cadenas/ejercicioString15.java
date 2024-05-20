package iesjandula.projectunit5.cadenas;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ejercicioString15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe algo para comprobar la cantidad de vocales.");
		
		String cadena = input.nextLine();
		
		char[] arrayLetras=cadena.toCharArray();
		System.out.println(arrayLetras);
		int vocalA=0;
		int vocalE=0;
		int vocalO=0;
		
		for (int i=0; i<arrayLetras.length; i++) {
			if (arrayLetras[i]=='a' || arrayLetras[i]=='A') {
				vocalA++;
			}
			else if (arrayLetras[i]=='e' || arrayLetras[i]=='E') {
				vocalE++;
			}
			else if (arrayLetras[i]=='o' || arrayLetras[i]=='O') {
				vocalO++;
			}
		}
		
		if (vocalA>10) {
			System.out.println("Exceso de a (más de 10)");
		}
		if (vocalO>5) {
			System.out.println("Exceso de o (más de 5)");
		}
		if (vocalE>3) {
			System.out.println("Exceso de e (más de 3)");
		}
		
	}

}
