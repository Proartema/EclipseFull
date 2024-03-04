package IESJANDULA.proyectounidad4.ejercicio45;

public class LibroFiccion extends Libro implements Comparable<Libro>,infoAutor{
	
	public LibroFiccion(String titulo, Autor autor, int anoPublicacion, String editorial,
			String referenciaBibliografica) {
		super(titulo, autor, anoPublicacion, editorial, referenciaBibliografica);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "LibroFiccion [tipoLibro()=" + tipoLibro() + ", getTitulo()=" + getTitulo() + ", getAutor()="
				+ getAutor() + ", getAnoPublicacion()=" + getAnoPublicacion() + ", getEditorial()=" + getEditorial()
				+ ", getReferenciaBibliografica()=" + getReferenciaBibliografica() + "]";
	}



	@Override
	public String obtenInforAutor() {
		// TODO Auto-generated method stub
		return this.getAutor().obtenInforAutor();
	}

	@Override
	public EnumLibro tipoLibro() {
		// TODO Auto-generated method stub
		return EnumLibro.CUENTOS;
	}
	
}
