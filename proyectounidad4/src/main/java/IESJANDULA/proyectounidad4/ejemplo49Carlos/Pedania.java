package IESJANDULA.proyectounidad4.ejemplo49Carlos;

public class Pedania extends Municipio implements IAlcalde {
	

	private Villa villa;
	
	public Pedania(String nombre, int poblacion, double temperatura, double altitud, Villa villa) {
		super(nombre, poblacion, temperatura, altitud, villa.getAlcalde());
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esPedania() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "Pedania [villa=" + villa.getNombre() + ", nombre=" + getNombre() + ",poblacion=" + getPoblacion()
				+ ", temperatura=" + getTemperatura() + ", altitud=" + getAltitud() + ", alcalde="
				+ getAlcalde() + "]";
	}

	@Override
	public String infoAlcalde() {
		// TODO Auto-generated method stub
		return villa.getAlcalde().infoAlcalde();
	}
	
	
}
