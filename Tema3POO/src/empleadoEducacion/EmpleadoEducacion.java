package empleadoEducacion;

public abstract class EmpleadoEducacion {
	protected String nombre;
	protected String apellido;
	protected long telefono;
	protected String direccion;
	protected double sueldo;
	protected double irpf;
	protected int horarioPermanencia;
	protected String funciones;
	public EmpleadoEducacion() {
		super();
	}
	public EmpleadoEducacion(String nombre, String apellido, long telefono, String direccion, double sueldo,
			double irpf, int horarioPermanencia, String funciones) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.sueldo = sueldo;
		this.irpf = irpf;
		this.horarioPermanencia = horarioPermanencia;
		this.funciones = funciones;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public long getTelefono() {
		return telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public double getSueldo() {
		return sueldo;
	}
	public double getIrpf() {
		return irpf;
	}
	public int getHorarioPermanencia() {
		return horarioPermanencia;
	}
	public String getFunciones() {
		return funciones;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}
	public void setHorarioPermanencia(int horarioPermanencia) {
		this.horarioPermanencia = horarioPermanencia;
	}
	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}
	public abstract double calculoDeSueldo();
	public abstract double calculoDeImpuesto();
	public abstract String funcion();
	
	
	
}
