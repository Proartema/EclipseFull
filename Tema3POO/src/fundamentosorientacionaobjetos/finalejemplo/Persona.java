package fundamentosorientacionaobjetos.finalejemplo;

public class Persona {
	private String nombre;
	private String apellidos;
	protected final String person = "Persona";

	public Persona() {
	}

	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
// person="Persona2";
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public final String getNombreCompleto() {
		return this.nombre + " " + this.apellidos;
	}
	public String getNombreCompleto(String aka) {
		return this.nombre + " " + this.apellidos + " " + aka;
	}
}