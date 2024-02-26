package IESJANDULA.proyectounidad4.matrices.exercises;

public class Ejercicio52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = { { 1, 2 }, { 3, 4 } };

		int[][] B = { { 1, 1 }, { 1, 1 } };
		int[][] suma = new int[2][2];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; i < B.length; j++) {

				suma[i][j] = A[i][j] + B[i][j];
			}
		}
		
		//hacer multiplicacion tambien
	}
}
