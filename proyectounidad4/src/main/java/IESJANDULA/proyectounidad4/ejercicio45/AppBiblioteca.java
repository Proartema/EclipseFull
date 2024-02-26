package IESJANDULA.proyectounidad4.ejercicio45;

public class AppBiblioteca {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Cien años de soledad","Gabriel García Márquez",1967,"Sudamericana","858.67 M566");
		Libro libro2 = new Libro("Rayuela","Julio Cortázar",1963,"Sudamericana","863.55 J667");
		Libro libro3 = new Libro("La tia Julia y el escribidor","Mario Vargas Llosa",1977,"Seix Barral","868.23 L567");
		
		
		Biblioteca biNacional = new Biblioteca("Biblioteca Nacional") ;
		
		biNacional.agregarLibro(libro1);
		biNacional.agregarLibro(libro2);
		biNacional.agregarLibro(libro3);
		
		//biNacional.mostrarLibros();
		biNacional.buscarLibro("Rayuela");
	}
	
	
	
	
}
