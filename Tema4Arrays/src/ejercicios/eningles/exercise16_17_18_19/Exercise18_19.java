package ejercicios.eningles.exercise16_17_18_19;

import arrays.ArrayMetodos;

public class Exercise18_19 {
	
	
	   public static int numberOfPositivesInArray(Integer[] arrayParam) {
		
		int cont=0;
		for (Integer item: arrayParam) {
			if (item>0)
				cont++;
		}
	
		return cont;
	}
	public static int sumArrayWithPositives(Integer[] arrayParam) {
	
	Integer[] arrayRes = new Integer[numberOfPositivesInArray(arrayParam)];
	int cont =0;
	int aux=0;
	   for (int i=0;i < arrayParam.length;i++) {
		   if (arrayParam[i] > 0) {
			   arrayRes[cont] = arrayParam[i];
			   aux= aux + arrayParam[i];
			   cont++;
		   }
		  
	   }
	return aux;
	
	
}
	public static int restarArrayWithPositives(Integer[] arrayParam) {
		
		Integer[] arrayRes = new Integer[numberOfPositivesInArray(arrayParam)];
		int cont =0;
		int aux=0;
		   for (int i=0;i < arrayParam.length;i++) {
			   if (arrayParam[i] > 0) {
				   arrayRes[cont] = arrayParam[i];
				   aux= aux - arrayParam[i];
				   cont++;
			   }
			  
		   }
		return aux;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arrayInt = ArrayMetodos.llenarArrayDecimalesWrap(20, -50,50);
		
		ArrayMetodos.mostrarArray(arrayInt);
		int arraySum = sumArrayWithPositives(arrayInt);
		int arrayResta = restarArrayWithPositives(arrayInt);
		System.out.println(arraySum);
		System.out.println(arrayResta);
	}

}
