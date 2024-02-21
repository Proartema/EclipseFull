package IESJANDULA.proyectounidad4.ejercicio49;

public class Departamento {
	private static final int MUNICIPIOS_ESPAÑA = 8132;
	private String nombre;
	private Municipio[] municipio;
	
	public Departamento() {
		
	}

	public Departamento(String nombre, Municipio[] municipio) {
		
		this.nombre = nombre;
		municipio= new Municipio[MUNICIPIOS_ESPAÑA];
	}

	public static int getMunicipiosEspaña() {
		return MUNICIPIOS_ESPAÑA;
	}

	public String getNombre() {
		return nombre;
	}

	public Municipio[] getMunicipio() {
		return municipio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMunicipio(Municipio[] municipio) {
		this.municipio = municipio;
	}
	
	
	
	
	
	
	
	
	
}
