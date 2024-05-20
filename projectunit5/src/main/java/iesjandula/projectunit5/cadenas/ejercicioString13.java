package iesjandula.projectunit5.cadenas;

import java.util.Scanner;

public class ejercicioString13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe algo para comprobar longitud.");
		
		String cadena = input.nextLine();
		//medimos la longitud de la cadena con length y hacemos una condicion para cada caso
		if (cadena.length()<5) {
			System.out.println("El texto tiene menos de 5 caracteres.");
		}
		else if (cadena.length()>15) {
			System.out.println("El texto tiene más de 15 caracteres, siendo los caracteres del 5 al 15: "+ cadena.substring(4, 16));
		}
		
		else {
			System.out.println("El texto tiene entre 5 y 15 cacracteres." );
		}
		//Con substring aislamos la primera letra de la cadena en una variable, aunque tambien hay un metodo lo que lo hace
		String primeraLetra=cadena.substring(0, 1);
		
		//Con contains devuelve verdadero si la variable contiene la letra
		if (primeraLetra.contains("A") || primeraLetra.contains("a")) {
			System.out.println("El texto empieza por A." + primeraLetra );
		}
		else {
			System.out.println("El texto no empieza por A." );
		}
	}

}
