package IESJANDULA.proyectounidad4.arrays;

import java.util.Scanner;


public class Ejercicio5 {

	public static int[] crearArray(int tamaño) {
	
		int[]array = new int[tamaño];
		return array;
		

	}
	
	public static int[] rellenarArray(int[] array) {
		
		int i=0;
		Scanner inputi = new Scanner(System.in);
		while (i<array.length) {
			System.out.println("Dime un numero para añadir en la posicion " + i);
			int numeroAMeter = inputi.nextInt();
			array[i] = numeroAMeter;
			i++;
		}
		return array;
		

	}
	
	public static void pintarArrayEnteros(int[] array) {
		
		for (int i=0 ; i< array.length ; i++) {
			
			if (i==array.length-1)
				System.out.format("|%-4d|", + array[i]);
			else
				System.out.format("|%4d", + array[i]);
	}
		System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Dime de cuanto quieres el array");
		
		Scanner input = new Scanner(System.in);
		
		int tamaño = input.nextInt();
		int[]array= crearArray(tamaño);
		rellenarArray(array);
		pintarArrayEnteros(array);
		}

}
