package IESJANDULA.proyectounidad4.ejemplo49Carlos;



public class Departamento {
	
	
	private static final int MUNICIPIO_MAX = 200;
	private final Municipio municipioNulo= new Villa("ZZZZZZZZZZZZZZ",-1000, -3000.0,-3000.0, new Alcalde("ZZZZZZ","ZZZZZZ",EnumPartido.CENTRO));
	
	private int contMunicipios=0;
	private String nombre;
	
	private Municipio[] municipios;
	
	
	public Departamento() {
	
			nombre="";
			municipios= new Municipio[MUNICIPIO_MAX];
			rellenaMunicipiosNull();
			
	}
	
	public Departamento(String nombre) {
		this();
		this.nombre = nombre;
	
		
	}

	// hacerlo con objeto MunicipioNulo
	//Añadir los mismos métodos que en tienda además de los que te pide el ejercicio
	public Departamento(String nombre, Municipio[] municipios) {
		this(nombre);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Municipio[] getMunicipios() {
		Municipio[] municipiosRes = new Municipio[contMunicipios];
		int contMunic=0;
		
		
		for (int i=0; i<municipios.length && contMunic<contMunicipios ; i++) {
			
			if (municipios[i].compareTo(municipioNulo)!=0) {
				
				municipiosRes[contMunic]= municipios[i];
				contMunic++;
			}
						
		}
		
		
		return municipiosRes;
	}

	public void agregarMunicipio(Municipio municipio) {
		
		int cont = 0;
		boolean hayHueco = false;

		while (cont < this.municipios.length && !hayHueco) {

			if (municipios[cont].compareTo(municipioNulo) == 0) {

				hayHueco = true;

			} else {
				cont++;
			}

		}

		if (hayHueco) {

			municipios[cont] = municipio;
			contMunicipios++;

		}
		
	}
	
	
	public void agregarMunicipios(Municipio[] municipiosAdd) {
		
		
		
		for (int i=0 ; i<municipiosAdd.length && contMunicipios< MUNICIPIO_MAX; i++) {
			
			agregarMunicipio(municipiosAdd[i]);
			
		}
		
	}
	
	public boolean eliminarMunicipio(Municipio munic) {
		// TODO Auto-generated method stub
		
		boolean encontrado = false;
		for (int i = 0; i < MUNICIPIO_MAX && !encontrado; i++) {

			if (municipios[i].equals(munic)) {
				encontrado = true;
				municipios[i] = municipioNulo;
				contMunicipios--;
			}

		}

		return encontrado;
		
	}
	
	
	public boolean hayMunicipios() {

		return contMunicipios > 0;
	}


	
	public int calcularCenso() {
		
		int sumaPoblacion=0;
		
		for (int i=0; i <MUNICIPIO_MAX ; i++) {
			
			if (municipios[i].compareTo(municipioNulo)!=0) {
				
				
				sumaPoblacion+= municipios[i].getPoblacion();
			}
			
			
		}
		
		
		return sumaPoblacion;
	}
	
	
	public Municipio buscarMunicipioPorNombre(String nombre) {
		
	Municipio municipioRes = municipioNulo;
	boolean encontrado=false;	
		
		
		for (int i=0 ; i < MUNICIPIO_MAX ; i ++) {
			
			
			if (municipios[i].getNombre().equals(nombre)&& !encontrado) {
				
				municipioRes= municipios[i];
			}
			
			
		}
		return municipioRes;
		
	}
	
	public Municipio buscarMunicipioConPoblacionMayor() {
		
		
		Municipio maxMunicipio = municipioNulo;
		
		
		
		for (int i=0 ; i < MUNICIPIO_MAX ; i ++) {
			
			
			if (municipios[i].getPoblacion()> maxMunicipio.getPoblacion()) {
				
				maxMunicipio= municipios[i];
			}
			
			
		}
		return maxMunicipio;
		
	}
	
	
	
	

	
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + "]";
	}

	
	public void imprimirInfoDepartamento() {
		
		System.out.println(this.toString());
		
		for (Municipio munic: this.getMunicipios()) {
			
			System.out.println(munic);
			
		}
		
		
	}
	
	
	private void rellenaMunicipiosNull() {

		for (int i = 0; i < MUNICIPIO_MAX; i++) {

			municipios[i] = municipioNulo;
		}
	}


	
	
	
	

}
