package IESJANDULA.proyectounidad4.claseArrays;

import java.util.Arrays;

public class EjemploClaseUtilidadArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArr[] = { 10, 20, 15, 22, 35 };
		int intArr1[] = { 10, 15, 22 };

		int intKey = 22;

		// Print the key and corresponding index
		System.out.println(intKey + " encontrado en el indice = " + Arrays.binarySearch(intArr, intKey));

		System.out.println(intKey + " encontrado en el indice = " + Arrays.binarySearch(intArr, 1, 3, intKey));

		System.out.println("intArray a comparar: " + Arrays.toString(intArr));

		System.out.println("intArray1 a comparar: " + Arrays.toString(intArr));

		System.out.println("Comparando dos arrays: " + Arrays.compare(intArr, intArr1));

		System.out.println("comparando dos arrays sin signo: " + Arrays.compareUnsigned(intArr, intArr1));

		System.out.println("\nNew Arrays by copyOf:\n");

		int[] intArray2 = Arrays.copyOf(intArr, 10);

		System.out.println("intArray2 copiado: " + Arrays.toString(intArray2));
		int[] intArrRelleno = new int[20];

		Arrays.fill(intArrRelleno, 0);
		// To fill the arrays
		System.out.println("Integer Array on filling: " + Arrays.toString(intArrRelleno));

	}

}
