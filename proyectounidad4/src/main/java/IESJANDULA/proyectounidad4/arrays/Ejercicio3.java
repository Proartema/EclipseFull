package IESJANDULA.proyectounidad4.arrays;


public class Ejercicio3 {
public static void pintarArrayEnteros(char[] array) {
		
		for (int i=0 ; i< array.length ; i++) {
			
			if (i==array.length-1)
				System.out.print("| " + array[i] + " |");
			else
				System.out.print("| " + array[i]);
	}
		System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] simbolo= {0,1,2,3,4,5,6,7,8,9};
		simbolo[0]='a';
		simbolo[1]='x';
		simbolo[4]='@';
		simbolo[6]=' ';
		simbolo[7]='+';
		simbolo[8]='Q';
		pintarArrayEnteros(simbolo);
	}

}
