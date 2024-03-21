package iesjandula.projectunit5.excepciones.biblioteca.modelo;

import java.util.Objects;

import iesjandula.projectunit5.excepciones.biblioteca.interfaces.InfoAutor;


/**
 * @author David
 * 
 * THe Autor class provides an abstraction for the book Author
 * THe book class has an attribute Autor type
 * @see Libro#getAutor()
 * 
 * @version 1.0
 * @since 1.0
 * 
 */

public class Autor implements Comparable<Autor>, InfoAutor {
	
	/**
	 * Author name of String type
	 *
	 * 
	 */
	
	private String nombre;
	
	/**
	 *It stores the Author last name 
	 * 
	 * 
	 */
	
	private String apellidos; 
	
	/**
	 * This property contains a dni value of the author.
	 * The DNi is the national identity card in Spain
	 * David does not have this. In Jesus' opinion he should be deported.
	 * 
	 * 
	 */
	
	private String dni;
	
	
	public Autor(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}
	/**
	 * @author Virginia Scrum Master
	 * 
	 * This method gets the author's name
	 * @param returns the name
	 * 
	 * 
	 * @version
	 * @since
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @author Virginia Scrum Master
	 * 
	 * This method changes the author's name
	 * @param receives a name as a parameter
	 * 
	 * 
	 * @version
	 * @since
	 */

	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(dni, other.dni);
	}


	@Override
	public int compareTo(Autor o) {
		// TODO Auto-generated method stub
		return this.getDni().compareTo(o.getDni());
	}


	@Override
	public String obtenInforAutor() {
		// TODO Auto-generated method stub
		return "Nombre: " + nombre+ " Apellido: " + apellidos;
	}
	
	
	
	
	
	

}
