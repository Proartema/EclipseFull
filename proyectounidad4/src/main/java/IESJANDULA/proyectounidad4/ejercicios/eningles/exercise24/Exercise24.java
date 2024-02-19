package IESJANDULA.proyectounidad4.ejercicios.eningles.exercise24;

public class Exercise24 {
	
	private int getNumEvenNumbersInArray(Integer[] array){
		
		int cont=0;
		for (Integer item: array) {
			if (item%2==0)
				cont++;
		}
	
		return cont;
	}
	
	public Integer[] evenArray(Integer[] array1, Integer[] array2) {
		int cont=0;
		
		int tamArrayRes = getNumEvenNumbersInArray(array1) + getNumEvenNumbersInArray(array2);
		
		Integer[] arrayResul = new Integer[tamArrayRes];
		
		
		for (Integer item: array1) {
			if (item%2==0)
				cont++;
		}
		for (Integer item: array2) {
			if (item%2==0)
				cont++;
		}
		return 
		
	}
}
