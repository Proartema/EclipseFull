package IESJANDULA.proyectounidad4.ejemplo49Carlos;

import java.util.Objects;

public class Alcalde implements Comparable<Alcalde>,IAlcalde{
	private String nombre;
	private String apellido;
	private EnumPartido partido;
	
	
public Alcalde(String nombre, String apellido, EnumPartido partido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.partido = partido;
	}


public String getNombre() {
	return nombre;
}


public String getApellido() {
	return apellido;
}





public EnumPartido getPartido() {
	return partido;
}


public void setPartido(EnumPartido partido) {
	this.partido = partido;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}





@Override
public String toString() {
	return "Alcalde [nombre=" + nombre + ", apellido=" + apellido + ", ayuntamiento=" + partido + "]";
}


@Override
public int hashCode() {
	return Objects.hash(apellido, nombre);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Alcalde other = (Alcalde) obj;
	return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre);
}


@Override
public int compareTo(Alcalde o) {
	String nombreAlc = this.nombre+this.getApellido();
	return nombreAlc.compareTo(o.getNombre()+o.getApellido());
}


@Override
public String infoAlcalde() {
	// TODO Auto-generated method stub
	return "Nombre: " + this.getNombre() + "Apellidos: " + this.getApellido() + "Partido: " + this.getPartido();
}

}
