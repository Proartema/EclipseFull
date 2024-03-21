package iesjandula.projectunitefive.excepciones.biblioteca;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import iesjandula.projectunitefive.excepciones.biblioteca.datos.EntradaDeDatos;
import iesjandula.projectunitefive.excepciones.biblioteca.excepciones.EntradaDatosException;
import iesjandula.projectunitefive.excepciones.biblioteca.modelo.Autor;
import iesjandula.projectunitefive.excepciones.biblioteca.modelo.Biblioteca;
import iesjandula.projectunitefive.excepciones.biblioteca.modelo.EnumLibro;
import iesjandula.projectunitefive.excepciones.biblioteca.modelo.Libro;
import iesjandula.projectunitefive.excepciones.biblioteca.modelo.LibroEducativo;
import iesjandula.projectunitefive.excepciones.biblioteca.modelo.LibroFiccion;

public class AppBiblioCarlos {

   private static Scanner sc;

   public static void main(String[] args) {
       int opcion = 0;

       Biblioteca biblio = new Biblioteca("Biblioteca municipal de Andujar");

       sc = new Scanner(System.in);

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

               Optional<Libro> optLibro= introducirLibro();
               
               if (optLibro.isEmpty()) {
                   
                   
                   // hago unas cosas
               } else if (optLibro.isPresent()) {
                   
                   // puedo listar todos los libros con el libro añadido nuevo
                   biblio.listarLibros();
               }
               
               
           }

           case 5 -> {

               if (borrarLibro(biblio)) {

                   System.out.println("Libro borrado correctamente");

               } else {

                   System.out.println("Libro no borrado correctamente");
               }

           }

           case 6 -> {

               Libro libro = buscarLibro(biblio);

               if (!biblio.esNulo(libro)) {

                   System.out.println("Libro encontrado" + libro);
               } else {

                   System.out.println("Libro no encontrado");
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

       res = sc.nextInt();
       sc.nextLine();

       return res;

   }

   private static Optional<Libro> introducirLibro() {

       Libro libroRes = null;

       Optional<Libro> libroResOpt = Optional.empty();

       String titulo;
       Autor autor;
       int annioPublicacion;
       String editorial;
       String referencia;
       EnumLibro tipoLibro = null;

       try {

           System.out.println("Introduzca el titulo del libro");
           titulo = EntradaDeDatos.leerTitulo();

           autor = leerAutor();

           System.out.println("Introduzca el año de publicacion del libro");
           annioPublicacion = EntradaDeDatos.leerAnnio();

           System.out.println("Introduzca el editorial del libro");
           editorial = EntradaDeDatos.leerEditorial();

           System.out.println("Introduzca la referencia del libro");
           referencia = EntradaDeDatos.leeReferenciaLibro();

           tipoLibro = leerTipoLibro();

           if (tipoLibro.esEducativo(tipoLibro)) {

               System.out.println("Introduzca la materia del libro");

               String materia = sc.nextLine();

               libroRes = new LibroEducativo(titulo, autor, annioPublicacion, editorial, referencia, tipoLibro,
                       materia);

           } else {

               libroRes = new LibroFiccion(titulo, autor, annioPublicacion, editorial, referencia, tipoLibro);
           }

       } catch (EntradaDatosException ede) {

           System.out.println("Error en la entrada de datos. " + ede.getMessage());
           EntradaDeDatos.pulsaEnterParaContinuar();

       } finally {

           if (libroRes != null) {
               libroResOpt = Optional.of(libroRes);
               System.out.println("El libro " + libroRes.getTitulo() + " se ha introducido correctamente");

           } else {
               libroResOpt = Optional.empty();
               System.out.println("El libro se ha introducido incorrectamente");
               
           }

       }

       return libroResOpt;

   }

   private static Autor leerAutor() throws EntradaDatosException {

       String nombreyapellidos;

       String nombre;
       String apellidos;
       String dni;

       System.out.println("Introduzca el nombre y apellidos del autor");
       nombreyapellidos = EntradaDeDatos.leerNombreYApellidosAutor();
       nombre = EntradaDeDatos.getNombreAutor(nombreyapellidos);
       apellidos = nombre = EntradaDeDatos.getApellidosAutor(nombreyapellidos);

       System.out.println("Introduzca el dni del autor");
       dni = EntradaDeDatos.leerDniAutor();

       return new Autor(nombre, apellidos, dni);

   }

   private static EnumLibro leerTipoLibro() throws EntradaDatosException {

       EnumLibro tipolibro;

       System.out.println("Introduzca el tipo del libro. ");
       System.out.println("0. NOVELA, ");
       System.out.println("1. EDUCATIVO ");
       System.out.println("2. TECNICO ");
       System.out.println("3. POEMARIO ");
       System.out.println("4. CUENTOS ");

       tipolibro = EntradaDeDatos.leerTipoLibro();

       return tipolibro;

   }

   private static boolean borrarLibro(Biblioteca biblio) {
       String referencia = "";

       System.out.println("Introduzca la referencia del libro a borrar. ");

       referencia = sc.nextLine();

       return biblio.eliminarLibro(referencia);

   }

   private static Libro buscarLibro(Biblioteca biblio) {

       String referencia = "";

       System.out.println("Introduzca la referencia del libro a buscar. ");

       referencia = sc.nextLine();

       return biblio.buscarLibroPorCcc(referencia);
   }

   private static void ordenarPor(Biblioteca biblio) {

       System.out.println("1. Titulo");
       System.out.println("2. Autor ");
       System.out.println("3. Año publicacion ");
       System.out.println("4. Referencia ");

       int indice = sc.nextInt();
       sc.nextLine();

       switch (indice) {

       case 1 -> {

           biblio.ordenarLibrosPor((l1, l2) -> l1.getTitulo().compareTo(l2.getTitulo()));

       }

       case 2 -> {

           biblio.ordenarLibrosPor((l1, l2) -> l1.getAutor().compareTo(l2.getAutor()));

       }

       case 3 -> {

           biblio.ordenarLibrosPor((l1, l2) -> l1.getAnnioPublicacion() - l2.getAnnioPublicacion());
       }

       case 4 -> {

           biblio.ordenarLibros();

       }

       default -> {

           System.out.println("Opcion incorrecta");

       }

       }

   }

}
