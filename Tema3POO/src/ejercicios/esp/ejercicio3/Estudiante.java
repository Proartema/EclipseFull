package ejercicios.esp.ejercicio3;

public class Estudiante extends Persona {
	public int idEstudiante;

	public Estudiante() {
		
	}

	public Estudiante(String nombre, String apellidos, String DNI, int AñoNacimiento, Direccion dir,int idEstudiante) {
		super();
		this.idEstudiante = idEstudiante;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	@Override
	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", apellidos=" + apellidos + ", DNI="
				+ DNI + ", AñoNacimiento=" + AñoNacimiento + ", dir=" + dir + ", calle=" + calle + ", ciudad=" + ciudad
				+ ", codigopostal=" + codigopostal + ", pais=" + pais + "]";
	}
	
	
	
	
}
