package iesjandula.projectunit5.excepciones.bibliotecas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppBiblio {

   private static Scanner input;

   public static void main(String[] args) {
	   	
	   
	   
	   
	   int opcion = 0;

       Biblioteca biblio = new Biblioteca("Biblioteca municipal de Andujar");

       input = new Scanner(System.in);

       boolean bsalir = true;

       while (bsalir) {

           opcion = opcionesMenu();

           switch (opcion) {

           case 1 -> {
        	   	biblio.listarLibros();
           }

           case 2 -> {
        	   biblio.listarLibrosFiccion();
           }

           case 3 -> {
        	   biblio.listarLibrosEducativos();
           }
           case 4 -> {
        	   Libro libro = introducirLibro();
               System.out.println("Libro Introducida correctamente");

           }

           case 5 -> {

           }

           case 6 -> {

           }

           case 7 -> {

               bsalir = false;
           }

           }

       }

   }

   private static int opcionesMenu() {
       // TODO Auto-generated method stub
       int res = -1;

       System.out.println("Introduzca una opción entre las siguientes:");

       System.out.println("--1 Listar libros");

       System.out.println("--2 Listar libros de ficcion");

       System.out.println("--3 Listar libros educativos");
       System.out.println("--4 Introducir libro");
       System.out.println("--5 Borrar libro");
       System.out.println("--6 Buscar libro");
       System.out.println("--7 Salir");

       
           res = input.nextInt();
           
           input.nextLine();

       

           return res;
       
   }
   
   private static Libro introducirLibro() {
	   
	   String titulo;
		 Autor autor;
		 int annioPublicacion;
		 String editorial;
		 String referencia;
		EnumLibro tipoLibro;
	   
	  
	   System.out.println("Introduzca un titulo para el libro:");
	   titulo=input.nextLine();
	   System.out.println("Introduzca el autor:");
	   autor=leerAutor();
	   System.out.println("Introduzca el año de publicación:");
	   annioPublicacion=input.nextInt();
	   System.out.println("Introduzca el año de publicación:");
	   annioPublicacion=input.nextInt();
	   System.out.println("Introduzca la editorial:");
	   editorial=input.nextLine();
	   System.out.println("Introduzca el numero de referencia:");
	   referencia=input.nextLine();
	   System.out.println("Introduzca el tipo de libro:");
	   tipoLibro=leerTipoLibro();
	   
	   if (tipoLibro.esEducativo(tipoLibro)) {
		   System.out.println("Introduzca la materia del libro:");
		   
		   String materia = input.nextLine();
		   
		   LibroEducativo Libro=new LibroEducativo(titulo,autor,annioPublicacion,editorial,referencia,tipoLibro,materia);
	   }
	   else {
		   LibroFiccion Libro=new LibroFiccion(titulo,autor,annioPublicacion,editorial,referencia,tipoLibro);
	   }
	   
	   
	   return Libro;
   }
   
   private static Autor leerAutor() {
	   String nombre;
	   String apellidos;
	   String dni;
	   
	   System.out.println("Introduzca el nombre del autor:");
	   nombre=input.nextLine();
	   System.out.println("Introduzca los apellidos del autor:");
	   apellidos=input.nextLine();
	   System.out.println("Introduzca el dni del autor:");
	   dni=input.nextLine();
	   
	   Autor autor= new Autor(nombre,apellidos,dni);
	   return autor;
   }
   
   private static EnumLibro leerTipoLibro() {
	   EnumLibro tipolibro;
	   
	   System.out.println("Introduzca el tipo de libro:");
	   System.out.println("0. Novela");
	   System.out.println("1. Educativo");
	   System.out.println("2. Tecnico");
	   System.out.println("3. Poemario");
	   System.out.println("4. Cuentos");
	   
	   int indice=input.nextInt();
	   tipolibro= EnumLibro.values()[indice];
	   return tipolibro;
   }
   
   private static boolean borraLibro(Biblioteca biblio) {
	   System.out.println("Introduzca la referencia del libro a borrar:");
	   
	   String referencia= input.nextLine();
	   
	   return biblio.eliminarLibro(referencia);
   }

}