package ejercicios.esp.ejercicio3;

public class Empleado {
	private int identificador;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Empleado() {
		this.identificador=100;
		this.nombre="Nuevo empleado";
		this.apellidos="Nuevo empleado";
		this.edad=18;
	}
	public Empleado(int identificador, String nombre, String apellidos, int edad) {
		this.identificador=identificador;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		
		
	}
}
