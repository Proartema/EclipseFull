package enumerados;

public enum EnumCoches {
		ELECTRICO("Motor elécctrico",1,"SEV"), DIESEL("Motor Diesel",2,"DV"),GAS("Motor de gas",3,"GV"),HIDROGENO("Motor de hidrógeno",4,"HEV");
	
	private String nombre;
	private int id;
	private String siglas;
	
	EnumCoches(String nombre,int id,String siglas) {
		
		this.nombre=nombre;
		this.id=id;
		this.siglas=siglas;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getId() {
		return this.id;
	}
	public String getSiglas() {
		return this.siglas;
	}
}
