package IESJANDULA.proyectounidad4.ejercicio44;

public enum EnumNota {

	NOTA_ALARMA("Nota Alarma"),NOTA_MARCADA("Nota Marcada");
	
	private String descripcion;

	private EnumNota(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	
	
}
