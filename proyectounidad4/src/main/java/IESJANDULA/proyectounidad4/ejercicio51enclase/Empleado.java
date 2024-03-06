package IESJANDULA.proyectounidad4.ejercicio51enclase;

import java.util.Objects;

import IESJANDULA.proyectounidad4.ejercicio51.EnumCategoria;

public abstract class Empleado implements Comparable<Empleado>{
	
	private String nombre;
	private String apellidos;
	private String nif;
	private int antiguedad;
	private double salario;
	
	public Empleado(String nombre, String apellidos, String nif, int antiguedad, double salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.antiguedad = antiguedad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNif() {
		return nif;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public double getSalario() {
		return salario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nif, other.nif);
	}
	
	
	@Override
	public String toString() {
		return "Empleado [tipo=" + this.tipoEmpleado() +"nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", antiguedad=" + antiguedad
				+ ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		return this.getNif().compareTo(o.getNif());
	}
	
	public abstract double calculaSueldo(double impuestos); 
	public abstract EnumCategoria tipoEmpleado();
	
	
	
}
