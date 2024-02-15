package arrays;

public class appArrayMetodos {

	public static void main(String[] args) {
		
		
		int[] arrayInteger = ArrayMetodos.llenarArrayDecimales(20, 50);
		
		ArrayMetodos.mostrarArray(arrayInteger);
		int[] arrayRevertido = ArrayMetodos.revierteArray(arrayInteger);
		
		ArrayMetodos.mostrarArray(arrayRevertido);
		
		Double[] arrayWrapDouble = ArrayMetodos.llenarArrayDecimalesWrap(20,55.0);
		
		ArrayMetodos.mostrarArray(arrayWrapDouble);
		ArrayMetodos.revierteArray(arrayWrapDouble);
		ArrayMetodos.mostrarArray(arrayWrapDouble);
		
		Double max = ArrayMetodos.maxT(arrayWrapDouble);
		System.out.println("Maximo" + max);
		Integer[] arrayWrapInteger = ArrayMetodos.llenarArrayDecimalesWrap(20,30);
		
		Integer min = ArrayMetodos.minT(arrayWrapInteger);
		System.out.println("Minimo" + min);
		
		String[] arrayString = ArrayMetodos.combinaArrays(arrayWrapDouble, arrayWrapInteger);
		ArrayMetodos.mostrarArray(arrayString);
	}

}
