package ejercicios.esp.ejercicio3;

public class Profesor {
	private int despacho;

	public Profesor() {
		
	}

	public Profesor(String nombre, String apellidos, String DNI, int AñoNacimiento, Direccion dir,int despacho) {
		super();
		this.despacho = despacho;
	}

	public int getDespacho() {
		return despacho;
	}

	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}
	
	
	
	
}
