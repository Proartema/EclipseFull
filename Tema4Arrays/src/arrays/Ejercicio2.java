package arrays;

import java.util.Locale;

public class Ejercicio2 {
	
public static void pintarArrayEnteros(int[] array, int numFinal) {
		
		for (int i=0 ; i< array.length && array[i]!= numFinal ; i++) {
			
			if (i==array.length-1)
				System.out.format(Locale.ENGLISH,"|%-4d|", + array[i]);
			else
				System.out.format(Locale.ENGLISH,"|%4d", + array[i]);
	}
		System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] num= {0,1,2,3,4,5,6,7,8,9,10,11};
		num[0]=39;
		num[1]=-2;
		num[4]=0;
		num[6]=14;
		num[8]=5;
		num[9]=120;
		pintarArrayEnteros(num);

	}

}
