package IESJANDULA.proyectounidad4.ejercicio45;

import java.util.Objects;

public class Autor implements Comparable<Autor>,infoAutor {
	
	private String nombre;
	private String apellido;
	private String dni;
	
	public Autor(String nombre, String apellido, String dni) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

	@Override
	public String obtenInforAutor() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	@Override
	public int compareTo(Autor o) {
		// TODO Auto-generated method stub
		
		return this.getDni().compareTo(o.getDni());
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
	
	
	
}
