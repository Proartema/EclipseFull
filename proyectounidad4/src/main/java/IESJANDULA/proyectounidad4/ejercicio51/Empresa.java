package IESJANDULA.proyectounidad4.ejercicio51;

import IESJANDULA.proyectounidad4.ejercicio44.Nota;

public class Empresa {

	private final int MAX_CLIENTE = 1000;
	private final int MAX_EMPLEADO = 1000;
	private int contEmpleados=0;
	private int contClientes=0;
	private String NIF;

	private String nombre;

	private double beneficios;
	private Cliente[] clientes = new Cliente[MAX_CLIENTE];
	private Empleado[] empleados = new Empleado[MAX_EMPLEADO];

	public Empresa(String nIF, String nombre, double beneficios) {
		super();
		NIF = nIF;
		this.nombre = nombre;
		this.beneficios = beneficios;

	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(double beneficios) {
		this.beneficios = beneficios;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Empresa [NIF=" + NIF + ", nombre=" + nombre + ", beneficios=" + beneficios + "]";
	}

	/**
	 *
	 * Añade un empleado si hay sitio, sino devuelve fals
	 *
	 */
	public void addEmpleados (Empleado[] emplAdd) {
		
		for (int i=0; i<emplAdd.length && contEmpleados < MAX_EMPLEADO ; i++) {
			
			if (emplAdd[i]!=null)
				agregarEmpleado(emplAdd[i]);
		}
	}
	public boolean agregarEmpleado(Empleado e) {
		int cont = 0;
		boolean hayHueco = false;
		while (cont < this.empleados.length && !hayHueco) {
			if (empleados[cont] == null) {
				hayHueco = true;
				contEmpleados++;
			} else {
				cont++;

			}
		}
		if (hayHueco) {
			empleados[cont] = e;
		}
		return hayHueco;
	}

	/**
	 *
	 * Borra un empleado si lo encuentra sino devuelve false
	 *
	 */

	public boolean eliminarEmpleado(Empleado e) {
		boolean encontrado = false;
		for (int i = 0; i < MAX_EMPLEADO && !encontrado; i++) {
			if (empleados[i].equals(e)) {
				encontrado = true;
				empleados[i] = null;
				contEmpleados--;
			}
		}
		return encontrado;
	}

	/**
	 *
	 * Añade un cliente si hay sitio, sino devuelve fals
	 *
	 */

	public boolean AddCliente(Cliente c) {
		int cont = 0;
		boolean hayHueco = false;
		while (cont < this.clientes.length && !hayHueco) {
			if (clientes[cont] == null) {
				hayHueco = true;
			} else {
				cont++;

			}
		}
		if (hayHueco) {
			clientes[cont] = c;
		}
		return hayHueco;
	}

	/**
	 *
	 * Borra un cliente si lo encuentra sino devuelve false
	 *
	 */

	public boolean borrarCliente(Cliente c) {
		boolean encontrado = false;
		for (int i = 0; i < MAX_CLIENTE && !encontrado; i++) {
			if (clientes[i].equals(c)) {
				encontrado = true;
				clientes[i] = null;

			}
		}
		return encontrado;
	}

	/**
	 *
	 * Busca un empleado por nif si lo encuentra sino devuelve nulo
	 *
	 */

	public Empleado buscarEmpleadoPorNif(String nif) {
		
		boolean encontrado = false;
		Empleado emplRes= null;
		for (int i = 0; i < MAX_EMPLEADO && !encontrado; i++) {
			if (empleados[i]!= null && empleados[i].getNif().equals(nif)) {
				encontrado = true;
				emplRes= empleados[i];
			}
			
		}
		
		return emplRes;
	}	
	
	public Empleado buscarEmpleadoPorNifVirgi(String nif) {

		boolean encontrado=false;
        int cont=0;
        Empleado algo = null;
        while(cont<MAX_EMPLEADO && !encontrado) {
            if(empleados[cont].getNif().equals(nif)) {
                encontrado=true;
                algo=empleados[cont];
            }else {
                cont ++;
            }
        }
        if(encontrado==false) {
            empleados[cont]=null;
        }
        return algo;
    }

	/**
	 *
	 * Busca un empleado por nombre si lo encuentra sino devuelve nulo
	 *
	 */

	public Empleado buscarEmpleadoPorNombre(String nombre) {

		return null;
	}

	/**
	 *
	 * Busca un cliente por nif si lo encuentra sino devuelve nulo
	 *
	 * 
	 */

	public Cliente buscaClientePorNif(String nif) {

		return null;
	}

	/**
	 *
	 * Busca un cliente por nombre si lo encuentra sino devuelve nulo
	 *
	 */

	public Cliente buscarClientePorNombre(String nombre) {

		return null;
	}

	/**
	 *
	 * Devuelve un array con todos los directivos, podeis usar instance of o el tipo
	 * de empleado para identificar quien es Directivo
	 *
	 */

	private Directivo[] getDirectivos() {

		return null;
	}

	/**
	 *
	 * Devuelve un array con todos los subdirectivos, podeis usar instance of o el
	 * tipo de empleado para identificar quien es Subdirectivo
	 *
	 */
	private int contarSubdirectivos() {
		int arrayParam=0;
		for(int i=0; i<empleados.length; i++) {
            if(empleados[i] instanceof Subdirectivo) {
                 arrayParam++;
            }
        }
		return arrayParam;
	}
	private Subdirectivo[] getSubdirectivos() {
		int arrayCopia=0;
		int num= contarSubdirectivos();
        Subdirectivo[] SubD = new Subdirectivo[num];
       
        for(int i=0; i<empleados.length; i++) {
            if(empleados[i] instanceof Subdirectivo) {
                 SubD[arrayCopia]=(Subdirectivo) empleados[i];
                 arrayCopia++;
            }
        }

        return SubD;
    }

	/**
	 *
	 * Devuelve un array con todos los técnicos, podeis usar instance of o el tipo
	 * de empleado para identificar quien es Tecnico
	 *
	 */

	private Tecnico[] getTecnicos() {

		return null;
	}

	/**
	 *
	 * recorre el array de empleados sumando los salarios de todos los empleados
	 */

	private double calcularSalariosTotales() {
		
		double sumSalario=0;
		
		for (Empleado emp: empleados)
			if (emp!=null) {
				sumSalario+= emp.calculaSueldo(sumSalario);
			}
		return sumSalario;
	}

}
