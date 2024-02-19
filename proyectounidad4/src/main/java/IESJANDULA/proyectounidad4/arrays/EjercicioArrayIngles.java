package IESJANDULA.proyectounidad4.arrays;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioArrayIngles {


		public static int[] crearArrayEnteros(int tamaño) {
		
			int[]array = new int[tamaño];
			return array;
			

		}
		
		public static String[] crearArrayCadenas(int tamaño) {
			
			String[]array = new String[tamaño];
			return array;
			

		}
		
		public static int[] rellenarArrayEnteros(int[] array) {
			
			int i=0;
			Scanner inputi = new Scanner(System.in);
			while (i<array.length) {
				System.out.println("Tell me a number to add in position " + i);
				int numeroAMeter = inputi.nextInt();
				array[i] = numeroAMeter;
				i++;
			}
			return array;
			

		}
		public static String[] rellenarArrayCadenas(String[] array) {
			
			int i=0;
			Scanner inputi = new Scanner(System.in);
			while (i<array.length) {
				System.out.println("Tell me a name to add to position " + i);
				String nombreAMeter = inputi.nextLine();
				array[i] = nombreAMeter;
				i++;
			}
			return array;
			

		}
		
	public static int[] rellenarArraySoloPares(int array) {
			int[]arr= new int[array];
			int posicion=0;
			int i=0;
			Scanner inputi = new Scanner(System.in);
			while (i<arr.length) {
				System.out.println("Tell me a number to add in position " + i);
				int numeroAMeter = inputi.nextInt();
				if (numeroAMeter%2==0) {
					arr[i] = numeroAMeter;
					i++;
				}
				
				
			}
			return arr;
			

		}
	public static void pintarArrayCadenas(String[] array) {
		
		for (int i=0 ; i< array.length; i++) {
			
			if (i==array.length-1)
				System.out.format("| " + array[i] + " |");
			else
				System.out.format("| " + array[i]);
	}
		System.out.println();
}
		
		public static double mediaArray(int[] array ) {
			double sum =0;
			
			for (int i=0; i<array.length; i++) {
				sum += array[i];
			}
			
			return sum / array.length;
		}
		
	public static void main(String[] args) {
		
		System.out.println("Give me the array length");
		
		Scanner input = new Scanner(System.in);
		
		
		String[]arrayNom=crearArrayCadenas(4);
		rellenarArrayCadenas(arrayNom);
		pintarArrayCadenas(arrayNom);
		
		
		
		
		
		
	}

}
