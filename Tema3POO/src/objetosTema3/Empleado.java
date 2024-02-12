package objetosTema3;

public class Empleado implements Comparable<Empleado> {
	
	private int id;
	private String nombre;
	private String apellido;
	private int salario;
	
		//constructor
	public Empleado() {
		
	}
	
	public Empleado(int id,String nombre,String apellido,int salario) {
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.salario=salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getSalarioAnual() {
		return this.salario*12;
	}
	
	public int AumentarSalario(int percent) {
		double incremento = this.salario* (double) percent/100;
		setSalario(this.salario + (int) Math.round(incremento));
		return this.salario;
	}

	@Override
	public String toString() {
		
		return "Empleado [id= " + id + ", Nombre= " + nombre + ", Apellido= " + apellido + ", Salario= " + salario + "]";
		}

	@Override
	public int compareTo(Empleado o) {
		
		return this.salario>o.getSalario()?1:(this.salario==o.getSalario()?0:-1);
	}

}
