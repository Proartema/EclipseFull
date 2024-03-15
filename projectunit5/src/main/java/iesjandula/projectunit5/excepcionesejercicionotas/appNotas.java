package iesjandula.projectunit5.excepcionesejercicionotas;

import java.util.Comparator;
import java.util.Scanner;
import java.util.function.BiFunction;

public class appNotas {

	   public static void main(String[] args) {
		   BlocNotas Bloc= new BlocNotas(notas[300]);
		   int identificador;
		   String contenido;
		   int numPalabraComienzo;
		   int entrada =0;
		   
		   while (entrada!=1) {
			   
			   System.out.println("Pulse:");
			   System.out.println("1 Listar notas:");
			   System.out.println("2 Listar notas de alarma:");
			   System.out.println("3 Listar notas marcadas:");
			   System.out.println("4 Introducir nota:");
			   System.out.println("5 Borrar nota:");
			   System.out.println("6 Buscar nota:");
			   System.out.println("7 Salir");
			   
			   switch (entrada) {
			   
			   case 1 : mostrarNotas();
			   case 2 : mostarNotasAlarma();
			   case 3 : mostrarNotasMarcadas();
			   case 4 : insertarNota();
				  
			   }
		   }
		   
		   public void insertarNota () {
			   Scanner input= new Scanner(System.in);
			   System.out.println("Introduzca un numero entero de indentificación para la nota:");
			   identificador=input.nextInt();
			   System.out.println("Introduzca el texto de la nota:");
			   contenido=input.nextLine();
			   System.out.println("Introduzca el numero de letras de la primera palabra:");
			   numPalabraComienzo=input.nextInt();
			   Nota nuevaNota=new Nota(identificador,contenido,numPalabraComienzo);
			   agregarNota(nuevaNota);
		   }
		   
	   }

	}