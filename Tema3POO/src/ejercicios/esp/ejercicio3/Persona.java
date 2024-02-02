package ejercicios.esp.ejercicio3;

public class Persona extends Direccion {
	// atributos
	protected String nombre;
	protected String apellidos;
	protected String DNI;
	protected int AñoNacimiento;
	protected Direccion dir;
	protected static int numPersonas = 0;

	// constructor
	public Persona() {

		numPersonas++;
	}

	public Persona(String nombre, String apellidos, String DNI, int AñoNacimiento, Direccion dir) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.AñoNacimiento = AñoNacimiento;
		this.dir=dir;
		numPersonas++;
	}

	// Metodo acceso
	public static int getNumPersonas() {

		return numPersonas;
	}

	public  String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public String getApellidos() {

		return apellidos;
	}

	public void setApellidos(String apellidos) {

		this.apellidos = apellidos;
	}

	public String getDNI() {

		return DNI;
	}

	public void setDNI(String DNI) {

		this.DNI = DNI;
	}

	public int getAñoNacimiento() {

		return AñoNacimiento;
	}

	public void setAñoNacimiento(int AñoNacimiento) {

		this.AñoNacimiento = AñoNacimiento;
	}
	
	
	public Direccion getDir() {
		return dir;
	}

	public void setDir(Direccion dir) {
		this.dir = dir;
	}

	// Metodo funcional
	public int calculaEdad(int añoActual) {

		return añoActual - AñoNacimiento;
	}
	
	public void identificate() {
		if (this instanceof Estudiante) {
			System.out.println("Esta persona es estudiante.");
		}
		else {
				System.out.println("Esta persona es un profesor");
		}
			
	}

	@Override
	public String toString() {

		return "Persona [nombre= " + nombre + ", apellidos= " + apellidos + ", DNI= " + DNI + ", AñoNacimiento= "
				+ AñoNacimiento + "]";
	}
}
