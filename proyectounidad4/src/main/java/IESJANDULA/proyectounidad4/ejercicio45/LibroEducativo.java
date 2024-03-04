package IESJANDULA.proyectounidad4.ejercicio45;

public class LibroEducativo extends Libro implements Comparable<Libro>,infoAutor{
	private String materia;
	

	public LibroEducativo(String titulo, Autor autor, int anoPublicacion, String editorial,
			String referenciaBibliografica, String materia) {
		super(titulo, autor, anoPublicacion, editorial, referenciaBibliografica);
		this.materia = materia;
	}


	public String getMateria() {
		return materia;
	}



	public void setMateria(String materia) {
		this.materia = materia;
	}



	@Override
	public String toString() {
		return "LibroEducativo [materia=" + materia + ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor()
				+ ", getAnoPublicacion()=" + getAnoPublicacion() + ", getEditorial()=" + getEditorial()
				+ ", getReferenciaBibliografica()=" + getReferenciaBibliografica() + "]";
	}


	@Override
	public EnumLibro tipoLibro() {
		// TODO Auto-generated method stub
		return EnumLibro.EDUCATIVO;
	}

	@Override
	public String obtenInforAutor() {
		// TODO Auto-generated method stub
		return this.getAutor().obtenInforAutor();
	}
}
