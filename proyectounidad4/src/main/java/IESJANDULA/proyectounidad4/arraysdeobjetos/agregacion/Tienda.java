package IESJANDULA.proyectounidad4.arraysdeobjetos.agregacion;

public class Tienda {

	private static final int CLIENTE_MAX = 200;
	private static final Cliente clienteNull = new Cliente("Cliente", "Mock", "ZZZZZZZZZZZZZZZ");

	private String nombre;
	private String direccion;

	private Cliente[] clientes;
	private int contClientes = 0;

	public Tienda(String nombre, String direccion) {

		this.nombre = nombre;
		this.direccion = direccion;

		clientes = new Cliente[CLIENTE_MAX];
		rellenaClientesNull();
	}

	public Tienda(String nombre, String direccion, Cliente[] clientArray) {

		this(nombre, direccion);

		// copiar del array de clientes pasado como parámetro
		// a nuestro array los clientes
		// hacerlo en un método privado

		for (int i = 0; i < clientArray.length && i < CLIENTE_MAX; i++) {

			this.addCliente(clientArray[i]);

		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Cliente[] getClientes() {

		int cont = 0;
		Cliente[] arrayCliente = new Cliente[contClientes];

		for (Cliente cliente : clientes) {

			if (cliente.compareTo(clienteNull) != 0) {

				arrayCliente[cont] = cliente;
				cont++;

			}

		}

		return arrayCliente;

	}

	public boolean addCliente(Cliente cl) {

		int cont = 0;
		boolean hayHueco = false;

		while (cont < this.clientes.length && !hayHueco) {

			if (clientes[cont].compareTo(clienteNull) == 0) {

				hayHueco = true;

			} else {
				cont++;
			}

		}

		if (hayHueco) {

			clientes[cont] = cl;
			contClientes++;

		}

		return hayHueco;
	}

	public boolean borrarCliente(Cliente cl) {

		boolean encontrado = false;
		for (int i = 0; i < CLIENTE_MAX && !encontrado; i++) {

			if (clientes[i].equals(cl)) {
				encontrado = true;
				clientes[i] = clienteNull;
				contClientes--;
			}

		}

		return encontrado;

	}

	public boolean hayClientes() {

		return contClientes > 0;
	}
	// hacer el buscar
	// probarlo en un test

	public Cliente buscarClientePorDni(String dni) {

		return null;

	}

	private void rellenaClientesNull() {

		for (int i = 0; i < CLIENTE_MAX; i++) {

			clientes[i] = clienteNull;
		}
	}

}