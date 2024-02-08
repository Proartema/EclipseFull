package metodosobject;

import java.util.Objects;

/***
 * Comparar con identificador
 */
public class Usuario implements Comparable<Usuario>{
	private int identificador = 0;
	private String nombre;

	public Usuario(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		Usuario us = (Usuario) obj;
		
		return ((this.identificador== us.identificador) && 
				(this.nombre.equals(us.nombre)));

		
	}

	public boolean equals(Usuario obj) {

		return ((this.identificador == obj.identificador) && (this.nombre.equals(obj.nombre)));
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador, nombre);
	}

	public static void main(String[] args) {
		Object o = new Object();
		Usuario e = new Usuario(12, "Objeto1");
		Usuario e2 = new Usuario(12, "Objeto1");
		if (!o.equals(e))
			System.out.println("Son Objetos distintos");
		if (!e.equals(e2))
			System.out.println("Son Objetos distintos");
		if (e.equals(e2))
			System.out.println("Son Objetos iguales");
		
		System.out.println(e.hashCode());
		System.out.println(e2.hashCode());
	}

	@Override
	public int compareTo(Usuario o) {
		// TODO Auto-generated method stub
		return ((this.identificador > o.getIdentificador())?1:(this.identificador == o.getIdentificador())?0:-1);
	}
}
