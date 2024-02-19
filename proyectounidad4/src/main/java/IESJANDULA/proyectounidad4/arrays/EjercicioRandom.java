package IESJANDULA.proyectounidad4.arrays;

import java.util.Random;
import java.util.Scanner;

public class EjercicioRandom {
	public static int[] crearArray(int tamaño) {
		
		int[]array = new int[tamaño];
		return array;
		

	}
	
	public static int[] rellenarArray(int[] array) {
		
		int i=0;
		Scanner inputi = new Scanner(System.in);
		while (i<array.length) {
			
			 Random r = new Random();
			array[i] = r.nextInt(100);
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
		System.out.println("Rellenando de manera aleatoria...");
		rellenarArray(array);
		pintarArrayEnteros(array);
		}

}
