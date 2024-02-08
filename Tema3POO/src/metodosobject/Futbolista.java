package metodosobject;

public class Futbolista implements Comparable<Futbolista> {
	private String nombre;
	private String posicion;
	private int calidad;

	public Futbolista(String nombre, String posicion, int calidad) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.calidad = calidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getCalidad() {
		return calidad;
	}

	public void setCalidad(int calidad) {
		this.calidad = calidad;
	}

	/*public int compareTo(Futbolista o) {
// TODO Auto-generated method stub
		return (this.calidad > o.calidad) ? 1 : ((this.calidad == o.calidad) ? 0 : -1);
	}*/
	public int compareTo(Futbolista o) {
		// TODO Auto-generated method stub
				return this.nombre.compareTo(o.getNombre())*-1;
			}
	
	/***
	 * 
	 * Comparar por nombre y posicion
	 */

	public static void main(String[] args) {
		Futbolista f1 = new Futbolista("Peri", "Delantero", 8);
		Futbolista f2 = new Futbolista("Jari", "Defensa", 6);
		if (f1.compareTo(f2) > 0) {
			System.out.println("futbolista " + f1.getNombre() + " es mejor que futbolista " + f2.getNombre());
		} else if (f1.compareTo(f2) == 0) {
			System.out.println(f1.getNombre() + " es igual de bueno que " + f2.getNombre());
		} else if (f1.compareTo(f2) < 0) {
			System.out.println(f1.getNombre() + " es peor que " + f2.getNombre());
		}
	}
}