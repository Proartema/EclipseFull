package fundamentosorientacionaobjetos.finalejemplo;

public final class Empleado extends Persona {

	private int id;

	private int salario;

	public Empleado() {

		// person="Employee";

	}

	public Empleado(int id, String nombre, String apellidos, int salario) {

		super(nombre, apellidos);
		this.id = id;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salario;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSalary(int salary) {
		this.salario = salary;
	}

	public int getAnnualSalary() {

		return this.salario * 12;
	}

	/*
	 * @Override public final String getNombreCompleto() {
	 *
	 * }
	 */

}
