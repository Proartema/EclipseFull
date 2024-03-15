package iesjandula.projectunit5.excepcionesejercicionotas;

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
