package IESJANDULA.proyectounidad4.matrices.exercises;

public class matrizpascal {

	public class TrianguloPascal {
		public static void rellena(int[][] triangulo) {
			for (int i = 0; i < triangulo.length; i++) {
				triangulo[i] = new int[i + 1];
				triangulo[i][0] = 1;
				triangulo[i][i] = 1;
				for (int j = 1; j < i; j++) {
					triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
				}
			}
		}

	}
}
