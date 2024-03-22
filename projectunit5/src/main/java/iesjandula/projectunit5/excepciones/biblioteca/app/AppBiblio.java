package iesjandula.projectunit5.excepciones.biblioteca.app;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import iesjandula.projectunit5.excepciones.biblioteca.excepciones.EntradaDatosException;
import iesjandula.projectunit5.excepciones.biblioteca.excepciones.MenuException;
import iesjandula.projectunit5.excepciones.biblioteca.modelo.Autor;
import iesjandula.projectunit5.excepciones.biblioteca.modelo.Biblioteca;
import iesjandula.projectunit5.excepciones.biblioteca.modelo.EntradaDeDatos;
import iesjandula.projectunit5.excepciones.biblioteca.modelo.EnumLibro;
import iesjandula.projectunit5.excepciones.biblioteca.modelo.Libro;
import iesjandula.projectunit5.excepciones.biblioteca.modelo.LibroEducativo;
import iesjandula.projectunit5.excepciones.biblioteca.modelo.LibroFiccion;

public class AppBiblio {

	static {
		String fileConfig = System.getProperty("user.dir") + "\\src\\main\\resources\\log4j2.properties";

		System.setProperty("log4j2.configurationFile", fileConfig);

	}
	
	private static final Logger appLogger = LogManager.getLogger();
	private static final Marker marker = MarkerManager.getMarker("AppBiblio");
	
   private static Scanner input;

   public static void main(String[] args) {
	   	
	   
	   
	   
	   int opcion = 0;

       Biblioteca biblio = new Biblioteca("Biblioteca municipal de Andujar");

       input = new Scanner(System.in);

       boolean bsalir = true;

       while (bsalir) {
    	   try {
    		   
    	   
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
        	 
        	   Optional<Libro> optLibro= introducirLibro();
        	   
        	   while (optLibro.isEmpty()) {
        		  System.out.println("Introducir el libro de nuevo"); 
        		  optLibro= introducirLibro();
        	   }
        	   
        		   biblio.listarLibros();
        	   

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
        	   
        	   bsalir=false;
               
           }

           } 
           }catch (MenuException e) {
        	   
        	   System.out.println("Error en la opción de menu introduzca la correcta. \n" + e.getMessage());
        	   
        	   appLogger.error(marker,"Error en la opción de menu introduzca la correcta. \n" + e.getMessage());
        	   EntradaDeDatos.pulsaEnterParaContinuar();
           
          

       }
     }

   }

   private static int opcionesMenu() throws MenuException {
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
       
           res = EntradaDeDatos.leerOpcionMenu(1, 7);
           
           input.nextLine();

       

           return res;
       
   }
   
   private static Optional<Libro> introducirLibro() {
	   Libro libroRes=null;
	   
	   Optional<Libro>libroResOpt = java.util.Optional.empty();
	   String titulo;
		 Autor autor;
		 int annioPublicacion;
		 String editorial;
		 String referencia;
		EnumLibro tipoLibro=null;
	   
	  try {
	   System.out.println("Introduzca un titulo para el libro:");
	   titulo=EntradaDeDatos.leerTitulo();
	   System.out.println("Introduzca el autor:");
	   autor=leerAutor();
	   System.out.println("Introduzca el año de publicación:");
	   annioPublicacion=EntradaDeDatos.leerAnnio();
	   System.out.println("Introduzca la editorial:");
	   editorial=EntradaDeDatos.leerEditorial();
	   System.out.println("Introduzca el numero de referencia:");
	   referencia=EntradaDeDatos.leeReferenciaLibro();
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
	  } catch (EntradaDatosException ede) {
		  appLogger.error(marker,"Error en la entrada de datos. " + ede.getMessage());
		  
		  System.out.println("Error en la entrada de datos. " + ede.getMessage());
		  EntradaDeDatos.pulsaEnterParaContinuar();
	  }
	  finally {
		  
		  if(libroRes!=null) {
			  libroResOpt.of(libroRes);
			  appLogger.info(marker,"El libro " + libroRes.getTitulo()+ "se ha introducido correctamente.");
			  
			  System.out.println("El libro " + libroRes.getTitulo()+ "se ha introducido correctamente.");
		  }
		  else {
			  libroResOpt=Optional.empty();
			  appLogger.info("El libro " + libroRes.getTitulo()+ "se ha introducido incorrectamente.");
		  }
	  }
	   
	   
	   return libroResOpt;
   }
   
   private static Autor leerAutor() throws EntradaDatosException {
	   String nombreYApellidos="";
	   
	   String nombre;
	   String apellidos;
	   String dni;
	   
	   System.out.println("Introduzca el nombre y apellidos del autor:");
	   nombreYApellidos=EntradaDeDatos.leerNombreYApellidosAutor();
	   nombre= EntradaDeDatos.getNombreAutor(nombreYApellidos);
	   apellidos= nombre= EntradaDeDatos.getApellidosAutor(nombreYApellidos);
	 
	   System.out.println("Introduzca el dni del autor:");
	   dni=EntradaDeDatos.leerDniAutor();
	   
	   Autor autor= new Autor(nombre,apellidos,dni);
	   return autor;
   }
   
   private static EnumLibro leerTipoLibro() throws EntradaDatosException {
	   EnumLibro tipolibro;
	   
	   System.out.println("Introduzca el tipo de libro:");
	   System.out.println("0. Novela");
	   System.out.println("1. Educativo");
	   System.out.println("2. Tecnico");
	   System.out.println("3. Poemario");
	   System.out.println("4. Cuentos");
	   
	   int indice=input.nextInt();
	   tipolibro= EntradaDeDatos.leerTipoLibro();
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