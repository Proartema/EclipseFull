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
           
           case 0 -> {
        	   bsalir = false;
           }
           
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
        	   if (borraLibro(biblio)) {
        		   System.out.println("Libro borrado correctamente");
        	   }
        	   else {
        		   System.out.println("No se ha podido borrar el libro");
        	   }
           }

           case 6 -> {
        	   	Libro libro = buscarLibro(biblio);
        	   	
        	   	if(biblio.esNulo(libro)) {
        	   		System.out.println("Libro encontrado correctamente" + libro);
        	   	}
        	   	else {
        	   		System.out.println("No se ha podido encontrar el libro");
        	   	}
           }

           case 7 -> {
        	   
               
           }

           
           
          

       }
     }

   }

   private static int opcionesMenu() {
       // TODO Auto-generated method stub
       int res = -1;

       System.out.println("Introduzca una opción entre las siguientes:");
       System.out.println("--0 Salir");
       System.out.println("--1 Listar libros");

       System.out.println("--2 Listar libros de ficcion");

       System.out.println("--3 Listar libros educativos");
       System.out.println("--4 Introducir libro");
       System.out.println("--5 Borrar libro");
       System.out.println("--6 Buscar libro");
       System.out.println("--7 Ordenar");
       System.out.println("--8 ");
       
           res = input.nextInt();
           
           input.nextLine();

       

           return res;
       
   }
   
   private static Libro introducirLibro() {
	   Libro libroRes=null;
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
		   
		   libroRes =new LibroEducativo(titulo,autor,annioPublicacion,editorial,referencia,tipoLibro,materia);
	   }
	   else {
		   libroRes =new LibroFiccion(titulo,autor,annioPublicacion,editorial,referencia,tipoLibro);
	   }
	   
	   
	   return libroRes;
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

   private static Libro buscarLibro(Biblioteca biblio) {
	   String referencia= "";
	   System.out.println("Introduzca la referencia del libro a buscar:");
	   referencia=input.nextLine();
	return biblio.buscarLibroPorCcc(referencia);
   }
   
   public static void ordernarPor(Biblioteca biblio ) {
	   
	   System.out.println("1. Titulo");
	   System.out.println("2. Autor");
	   System.out.println("3. Año de publicacion");
	   System.out.println("4. Referencia");
	   
	   int indice = input.nextInt();
	   input.nextLine();
	   
	   switch (indice) {
	   
	   case 1 -> {
		   biblio.ordenarLibrosPor((l1,l2) -> l1.getTitulo().compareTo(l2.getTitulo()));
	   }
	   
	   case 2 -> {
		   biblio.ordenarLibrosPor((l1, l2) -> l1.getAutor().compareTo(l2.getAutor()));
	   }
	   
	   case 3 -> {
		   biblio.ordenarLibrosPor((l1, l2) -> l1.getAnnioPublicacion()-(l2.getAnnioPublicacion()));
	   }
	   
	   case 4 -> {
		   biblio.ordenarLibrosPor((l1, l2) -> l1.getReferencia().compareTo(l2.getReferencia()));
	   }
	   
	   default -> {
		   System.out.println("Opcion incorrecta");
	   }
	   }
   }

}