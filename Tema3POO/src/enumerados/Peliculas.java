package enumerados;

public enum Peliculas {
	ACCION,COMEDIA,DRAMA,SUSPENSE;
	
	private String nombre;
	private String director;
	private int duracion;
	private int anu;
	private double calificacion;
		
	public Peliculas() {
		
	}
	



	public Peliculas(String nombre, String director, int duracion, int anu, double calificacion) {
		this.nombre = nombre;
		this.director = director;
		this.duracion = duracion;
		this.anu = anu;
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getAnu() {
		return anu;
	}

	public void setAnu(int anu) {
		this.anu = anu;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
