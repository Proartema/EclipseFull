package IESJANDULA.proyectounidad4.ejercicio49;

import IESJANDULA.proyectounidad4.arraysdeobjetos.agregacion.Cliente;

public class Departamento {
	private static final int MUNICIPIOS_ESPAÑA = 8132;
	private String nombre;
	private Municipio[] municipio;
	
	public Departamento() {
		
	}

	public Departamento(String nombre) {
		
		this.nombre = nombre;
		municipio= new Municipio[MUNICIPIOS_ESPAÑA];
	}

	public static int getMunicipiosEspaña() {
		return MUNICIPIOS_ESPAÑA;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean agregarMunicipio(Municipio ml) {
		int cont = 0;
		boolean hayHueco = false;
		while (cont < this.municipio.length && !hayHueco) {
			if (municipio[cont] == null) {
				hayHueco = true;
			} else {
				cont++;
			}
		}
		if (hayHueco) {
			municipio[cont] = ml;
		}
		return hayHueco;
	}
	
	public boolean eliminarMunicipio(String nombre) {
		boolean encontrado = false;
		for (int i = 0; i < MUNICIPIOS_ESPAÑA && !encontrado; i++) {
			if (municipio[i].equals(nombre)) {
				encontrado = true;
				municipio[i] = null;
			}
		}
		return encontrado;
	}
	
	public void buscarMunicipio(String nombre) {
		boolean encontrado = false;
		for (int i = 0; i < MUNICIPIOS_ESPAÑA && !encontrado; i++) {
			if (municipio[i].equals(nombre)) {
				encontrado = true;
				System.out.println(municipio[i].toString());
			}
			else {
				System.out.println("No se ha encontrado el municipio");
			}
		}
		
	}
	
	public void buscarMunicipioConPoblacion(int poblacion) {
		boolean encontrado = false;
		for (int i = 0; i < MUNICIPIOS_ESPAÑA && !encontrado; i++) {
			if (municipio[i].getPoblacion() >=poblacion) {
				encontrado = true;
				System.out.println(municipio[i].toString());
			}
			else {
				System.out.println("No se ha encontrado el municipio con esa población.");
			}
		}
		
	}
	
	public int calcularCensoPoblacion() {
		int cont=0;
		int sum=0;
		for (Municipio item: municipio) {
			sum += municipio[cont].getPoblacion();
				cont++;
		}
	
		return sum;
	}
	
	
	
	
	
	
	
}
