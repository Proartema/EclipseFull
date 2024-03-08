package IESJANDULA.proyectounidad4.matrices.exercises;

import java.util.Random;

public class matrizirre {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[][] irregularLlaves = { { 1, 2, 3 }, { 1 }, { 3, 4 }, { 5, 6, 7, 8 } };

		printArray(irregularLlaves);

		int[][] irregularNew = new int[3][];

		irregularNew[0] = new int[4];
		irregularNew[0][0] = 5;
		irregularNew[0][1] = 2;
		irregularNew[0][2] = 4;
		irregularNew[0][3] = 7;

		irregularNew[1] = new int[2];

		irregularNew[1][0] = 7;
		irregularNew[1][1] = 8;

		irregularNew[2] = new int[3];

		irregularNew[2][0] = 10;
		irregularNew[2][1] = 15;
		irregularNew[2][2] = 15;

		printArray(irregularLlaves);
		
		int [][] irregularAleatoria;
		
		Random rand= new Random();
		int filas= rand.nextInt(3, 8);
		
		irregularAleatoria = new int[filas][];
		
		int columnas=0;
		for (int i=0; i<filas ; i++) {
			columnas= rand.nextInt(2,10);
			irregularAleatoria[i] = new int[columnas];
			for (int j=0 ; j<columnas; j++) {
				irregularAleatoria[i][j]=rand.nextInt(-1000,1000);
				
			} 
		} printArray(irregularAleatoria);
	}

	public static void printArray(int[][] irregularArray) {

		String res = "";

		for (int i = 0; i < irregularArray.length; i++) {

			for (int j = 0; j < irregularArray[i].length; j++) {

				res += String.format("|%4d|", irregularArray[i][j]);

			}

			res += "\n";
		}

		System.out.println(res);

	}

}
