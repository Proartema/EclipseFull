package iesjandula.projectunit5.excepciones.biblioteca.interfaces;

import iesjandula.projectunit5.excepciones.biblioteca.modelo.EnumLibro;
/**
 * {@summary add a behavior to the Book class to figure out the book type}
 * 
 * The book classification in the library encompasses two kind of books:
 * 
 * Educative book: TECNICO, EDUCATIVO
 * Fictional book: NOVELA, CUENTO, POEMARIO
 * @see EnumLibro#esEducativo(EnumLibro)
 * 
 * 
 * 
 * @version 1.0
 * @since 1.0
 * 
 * 
 */

public interface IEducativo {
	public boolean esEducativo();
}
