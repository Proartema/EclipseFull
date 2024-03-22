package iesjandula.projectunit5.excepciones.biblioteca.modelo;

import java.util.Comparator;
import java.util.Objects;

import iesjandula.projectunit5.excepciones.biblioteca.interfaces.IEducativo;
import iesjandula.projectunit5.excepciones.biblioteca.interfaces.InfoAutor;
/**
 * {@summary Libro is the abstract class that aims to represent books in our library}
 * 
 * Libro is extennded by two concrete classes: {@link LibroEducativo} and {@link LibroFiccion}
 * 
 * It will be managed in the Biblioteca Class. The biblioteca class is an abstraction of a Library
 * 
 * @author Virginia Scrummaster
 * @since 1.0
 * @version 1.1
 * 
 */
public abstract class Libro implements Comparable<Libro>, InfoAutor, IEducativo {
	
	/**
	 * Store a book title. The form of its representation is the first word in Capital letters
	 * 
	 * 
	 * 
	 * 
	 */
	private String titulo;
	/**
	 * 
	 * The autor comprises all the significant data for the book author
	 * @see Autor
	 */
	private Autor autor;
	private int annioPublicacion;
	private String editorial;
	private String referencia;
	private EnumLibro tipoLibro;
	
	/**
	 * The constructor with parameters provides an instance of the Libro class.
	 * There is no parameterless constructor. It is mandatory to build the object
	 * relying on all it's attributes.
	 * 
	 * @param titulo
	 * @param autor
	 * @param annioPublicacion the year of edition when the book came out
	 * @param editorial The Publisher
	 * @param referencia the look reference in ISBN format
	 * @param tipoLibro an Enum type with five kinds of books (@link EnumLibro}
	 */
	public Libro(String titulo, Autor autor, int annioPublicacion,
			String editorial, String referencia, EnumLibro tipoLibro) {

		this.titulo = titulo;
		this.autor = autor;
		this.annioPublicacion = annioPublicacion;
		this.editorial = editorial;
		this.referencia = referencia;
		this.tipoLibro= tipoLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAnnioPublicacion() {
		return annioPublicacion;
	}

	public void setAnnioPublicacion(int annioPublicacion) {
		this.annioPublicacion = annioPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	
	
	
	public EnumLibro getTipoLibro() {
		return tipoLibro;
	}

	public void setTipoLibro(EnumLibro tipoLibro) {
		this.tipoLibro = tipoLibro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(referencia);
	}

	
	
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", annioPublicacion=" + annioPublicacion
				+ ", editorial=" + editorial + ", referencia=" + referencia + ", tipoLibro=" + tipoLibro + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(referencia, other.referencia);
	}

	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.getReferencia().compareTo(o.getReferencia());
	}

	@Override
	public String obtenInforAutor() {
		// TODO Auto-generated method stub
		return this.getAutor().obtenInforAutor();
	}
	
	@Override
	public boolean esEducativo() {
		return EnumLibro.esEducativo(this.tipoLibro);
	}

}
