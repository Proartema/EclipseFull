package ejercicios.eningles.exercise16_17_18_19;

import java.util.Random;

import arrays.ArrayMetodos;

public class Exercise16_17 {

	public static int numberOfPositivesInArray(Integer[] arrayParam) {
		
		int cont=0;
		for (Integer item: arrayParam) {
			if (item>0)
				cont++;
		}
	
		return cont;
	}
	public static int numberOfNegativesInArray(Integer[] arrayParam) {
		
		int cont=0;
		for (Integer item: arrayParam) {
			if (item<0)
				cont++;
		}
	
		return cont;
	}
	public static Integer[] returnArrayWithPositives(Integer[] arrayParam) {
		
		Integer[] arrayRes = new Integer[numberOfPositivesInArray(arrayParam)];
		int cont =0;
		   for (int i=0;i < arrayParam.length;i++) {
			   if (arrayParam[i] > 0) {
				   arrayRes[cont] = arrayParam[i];
				   cont++;
			   }
		   }
		return arrayRes;
		
	}
	
	public static Integer[] returnArrayWithNegatives(Integer[] arrayParam) {
		
		Integer[] arrayRes = new Integer[numberOfNegativesInArray(arrayParam)];
		int cont =0;
		   for (int i=0;i < arrayParam.length;i++) {
			   if (arrayParam[i] < 0) {
				   arrayRes[cont] = arrayParam[i];
				   cont++;
			   }
		   }
		return arrayRes;
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Integer[] arrayInt = ArrayMetodos.llenarArrayDecimalesWrap(20, -50,50);
			
			ArrayMetodos.mostrarArray(arrayInt);
			Integer[] arrayRes = returnArrayWithPositives(arrayInt);
			
			ArrayMetodos.mostrarArray(arrayRes);
	}

}
