package ejercicios.esp.ejercicio3;

public class Pelicula {
	private String nombre;
	private String director;
	private int duracion;
	private EnumPeliculas genero;
	private int anu;
	private double calificacion;
	
	
	public Pelicula() {
			
		}
		
	
	
		public Pelicula(String nombre, String director, int duracion, EnumPeliculas genero, int anu, double calificacion) {
		
		this.nombre = nombre;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
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
		public  boolean esPeliculaEpica() {
			
			return this.duracion>=180;
		}
		
		public String calcularValoracion() {
			
			String resultado="";
			if (this.calificacion<= EnumCalificacion.MUY_MALA.getMaxRange()) {
				resultado=EnumCalificacion.MUY_MALA.getDescripcion();
			}
			else if (this.calificacion<= EnumCalificacion.MALA.getMaxRange()) {
				resultado=EnumCalificacion.MALA.getDescripcion();
			}
			else if (this.calificacion<= EnumCalificacion.REGULAR.getMaxRange()) {
				resultado=EnumCalificacion.REGULAR.getDescripcion();
			}
			else if (this.calificacion<= EnumCalificacion.BUENA.getMaxRange()) {
				resultado=EnumCalificacion.BUENA.getDescripcion();
			}
			else {
				resultado=EnumCalificacion.MUY_BUENA.getDescripcion();
			}
			return resultado;
		}
		
		public boolean esSimilar (Pelicula pelicula) {
			
			return (this.genero.equals(pelicula) && this.calificacion==pelicula.getCalificacion());
		}
		@Override
		public String toString() {
			return "Peliculas [nombre=" + nombre + ", director=" + director + ", duracion=" + duracion + ", genero="
					+ genero + ", anu=" + anu + ", calificacion=" + calificacion + "]";
		}
}

