package IESJANDULA.proyectounidad4.ejercicio45;

import java.util.Arrays;

import IESJANDULA.proyectounidad4.ejercicio49.Municipio;

public class Biblioteca {

	private static final int CAPACIDAD = 500;
	private static Libro libroNulo= new Libro("Libronulo","Libronulo",0,"Libronulo","ZZZZZZZZZZZZ");
	private String nombre;
	private Libro[] libros;
	private int contLibros=0;
	
	
	
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		libros= new Libro[CAPACIDAD];
		rellenaLibrosNull();
	}

	public Biblioteca(String nombre, Libro[] librosParam) {
		this(nombre);
		
		for (int i = 0; i < librosParam.length && i < CAPACIDAD; i++) {
			
			this.agregarLibro(librosParam[i]);
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public Libro[] getLibros() {
		return libros;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}
	
	public boolean agregarLibro(Libro l1) {
		int cont = 0;
		boolean hayHueco = false;
		while (cont < this.libros.length && !hayHueco) {
			if (libros[cont] == libroNulo) {
				hayHueco = true;
			} else {
				cont++;
				contLibros++;
			}
		}
		if (hayHueco) {
			libros[cont] = l1;
		}
		return hayHueco;
	}
	
	
	public boolean eliminarLibro(String nombre) {
		boolean encontrado = false;
		for (int i = 0; i < CAPACIDAD && !encontrado; i++) {
			if (libros[i].equals(nombre)) {
				encontrado = true;
				libros[i] = null;
				contLibros--;
			}
		}
		return encontrado;
	}
	
	public boolean hayLibros() {
		
		return contLibros>0;
	}
	
	   public void mostrarLibros() {
		   
	       for (int i = 0; i < libros.length; i++) {
	           if (i == libros.length - 1 && libros[i].equals(libroNulo))
	               System.out.print(libros[i]);
	           else
	               System.out.print(libros[i] + ", ");

	       }

	       System.out.println();

	   }
	   private void rellenaLibrosNull() {

			for (int i = 0; i < CAPACIDAD; i++) {

				libros[i] = libroNulo;
			}
		}
	   
	   public void buscarLibro(String nombre) {
			boolean encontrado = false;
			for (int i = 0; i < CAPACIDAD && !encontrado; i++) {
				if (libros[i].getTitulo().equals(nombre)) {
					encontrado = true;
					System.out.println(libros[i].toString());
				}
				
			}
			if (encontrado == false) {
				System.out.println("No se ha encontrado el libro");
			}
			
		}

	
	

	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", libros=" + Arrays.toString(libros) + "]";
	}
	
	
	
}
