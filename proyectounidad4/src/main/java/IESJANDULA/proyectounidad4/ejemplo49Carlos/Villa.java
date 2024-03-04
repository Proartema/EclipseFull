package IESJANDULA.proyectounidad4.ejemplo49Carlos;

import java.util.Objects;

public class Villa extends Municipio implements Comparable<Municipio>, IAlcalde{

	private Alcalde alcalde;
	
	public Villa(String nombre, int poblacion, double temperatura, double altitud, Alcalde alcalde) {
		super(nombre, poblacion, temperatura, altitud, alcalde);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esPedania() {
		// TODO Auto-generated method stub
		return false;
	}

	public Alcalde getAlcalde() {
		return alcalde;
	}

	public void setAlcalde(Alcalde alcalde) {
		this.alcalde = alcalde;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(alcalde);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Villa other = (Villa) obj;
		return Objects.equals(alcalde, other.alcalde);
	}

	@Override
	public String toString() {
		return "Villa [alcalde=" + alcalde + ", nombre=" + getNombre() + ", poblacion=" + getPoblacion()
				+ ", temperatura=" + getTemperatura() + ", altitud=" + getAltitud() + "]";
	}
	
	@Override
	public String infoAlcalde() {
		// TODO Auto-generated method stub
		return this.getAlcalde().infoAlcalde();
	}

	@Override
	public int compareTo(Municipio o) {

		int compare;

		if (this.getPoblacion() == o.getPoblacion()) {

			compare = this.getNombre().compareTo(o.getNombre());

		} else {

			compare = this.getAlcalde().compareTo(getAlcalde());
		}

		return compare;
	}
	
	
}
