package IESJANDULA.proyectounidad4.ejercicio49;

public class Municipio {
	private String nombre;
	private int poblacion;
	private double temperaturaMedia;
	private double altura;
	
	public Municipio() {
		
	}

	public Municipio(String nombre, int poblacion, double temperaturaMedia, double altura) {
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.temperaturaMedia = temperaturaMedia;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public double getTemperaturaMedia() {
		return temperaturaMedia;
	}

	public double getAltura() {
		return altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Municipio [nombre=" + nombre + ", poblacion=" + poblacion + ", temperaturaMedia=" + temperaturaMedia
				+ ", altura=" + altura + "]";
	}
		
}
