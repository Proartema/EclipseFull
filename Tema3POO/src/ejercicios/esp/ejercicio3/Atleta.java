package ejercicios.esp.ejercicio3;

public class Atleta {
	private int identificador;
	private String nombre;
	private double tiempo;
	static int numatletas;
	static String seleccion="Colombia";
	static int tiempoEquipo;
	
	public Atleta() {
		numatletas++;
	}
	
	public Atleta(String nombre, double tiempo) {
		numatletas++;
		this.identificador = numatletas;
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public double getTiempo() {
		return tiempo;
	}

	public static int getNumatletas() {
		return numatletas;
	}

	public static String getSeleccion() {
		return seleccion;
	}

	public static int getTiempoEquipo() {
		return tiempoEquipo;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public static void setNumatletas(int numatletas) {
		Atleta.numatletas = numatletas;
	}

	public static void setSeleccion(String seleccion) {
		Atleta.seleccion = seleccion;
	}

	public static void setTiempoEquipo(int tiempoEquipo) {
		Atleta.tiempoEquipo = tiempoEquipo;
	}
	
	public void correr400Metros() {
		tiempoEquipo+=this.tiempo;
	}
	
	public static void imprimir() {
		System.out.println("El tiempo total es: " + tiempoEquipo);
	}
	
	public static void main() {
		Atleta atleta1 = new Atleta("Alejandro Perlaza",9.55);
		Atleta atleta2 = new Atleta("Anthony Zambrano",9.28);
		Atleta atleta3 = new Atleta("Diego Palomeque Perlaza",9.53);
		Atleta atleta4 = new Atleta("Gilmar Herrera",9.29);
	}
	
	
}
