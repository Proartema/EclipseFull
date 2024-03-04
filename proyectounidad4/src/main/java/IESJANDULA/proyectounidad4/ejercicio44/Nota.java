package IESJANDULA.proyectounidad4.ejercicio44;

import java.util.Objects;

public abstract class Nota implements Comparable<Nota>{

	private int identificador;
	private String contenido;
	private int numPalabraComienzo;
	
	public Nota(int identificador, String contenido, int numPalabraComienzo) {
		super();
		this.identificador = identificador;
		this.contenido = contenido;
		this.numPalabraComienzo = numPalabraComienzo;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getContenido() {
		return contenido;
	}

	public int getNumPalabraComienzo() {
		return numPalabraComienzo;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void setNumPalabraComienzo(int numPalabraComienzo) {
		this.numPalabraComienzo = numPalabraComienzo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numPalabraComienzo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return numPalabraComienzo == other.numPalabraComienzo;
	}

	@Override
	public String toString() {
		return "Nota [identificador=" + identificador + ", contenido=" + contenido + ", numPalabraComienzo="
				+ numPalabraComienzo + "]";
	}

	@Override
	public int compareTo(Nota o) {
		int compare;

		if (this.getNumPalabraComienzo() == o.getNumPalabraComienzo()) {

			compare = this.getContenido().compareTo(o.getContenido());

		} else {

			compare = this.getNumPalabraComienzo() - o.getNumPalabraComienzo();
		}

		return compare;
		
	}
	
	public abstract int enTexto();

	
	public abstract EnumNota tipoNota();
	
	
	
}
