package arrays;

import java.util.Locale;

public class Arraytemperaturas {
	
	public static void pintarArray(double[] array) {
		
		
		for (int i=0 ; i< array.length ; i++) {
			
		if (i==array.length-1)
			System.out.format(Locale.ENGLISH,"|%-4.4f|", + array[i]);
		else
			System.out.format(Locale.ENGLISH,"|%-4.4f", + array[i]);
		}
		System.out.println();
	}
	
	public static void rellenarConUnos(double[] array) {
		
		for (int i=0 ; i< array.length ; i++) {
			array[i]=1.0;
			
			}
		}
	public static int crearArrayConNumerosAleatorios(int[] tam) {
		
		int[]array = new int[tam];
		
		return array;
		
		
	}
		
	
	
	
	public static void main(String[] args) {
		double [] temperatures = new double[20];
		
		pintarArray(temperatures);
		rellenarConUnos(temperatures);
		
		pintarArray(temperatures);
	}
	
}


