package ejercicios.esp.ejercicio3;

public enum EnumCalificacion {
	MUY_MALA("MUY MALA.",0,2),
	MALA("MALA.",2,5),
	REGULAR("REGULAR.",5,7),
	BUENA("BUENA.",7,8),
	MUY_BUENA("MUY BUENA.",8,10);
	
	private String calificacion;
	private int minRange;
	private int maxRange;
	
	EnumCalificacion(String descripcion, int minRange, int maxRange) {
		this.calificacion = descripcion;
		this.minRange = minRange;
		this.maxRange = maxRange;
	}

	public String getDescripcion() {
		return calificacion;
	}

	public int getMinRange() {
		return minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}



	
}
