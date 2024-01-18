package objetosTema3;

public class Coche {

	//atributos
	private String color;
	private String marca;
	private String modelo;
	private static int numCoches= 0;
	// CUIDADO LOS ATRIBUTOS PUBLICOS NO
	//public String publica;
	
	//constructores
	
	public Coche() {
		
		color="Blanco";
		numCoches++;
		
		System.out.println("Numero de coches creados: "+ Coche.numCoches);
	}
	//constructores con parametros
	public Coche(String color, String marca,String modelo) {
		
		this.color=color;
		this.marca=marca;
		this.modelo=modelo;
		numCoches++;
		System.out.println("Numero de coches creados: "+ Coche.numCoches);
	}
	
	public String getColor() {
		
		return color;
	}
	
	public void setColor(String color) {
		
		this.color=color;
	}
	
	public String getMarca() {
		
		return marca;
	}
	
	public void setMarca (String marca) {
		
		this.marca=marca;
	}
	
	public String getModelo() {
		
		return modelo;
	}
	
	public void setModelo(String modelo) {
		
		this.modelo=modelo;
	}
	public void repintar(String color) {
		
		this.color=color;
	}
	
	public static int numCoches() {
		
		return numCoches;
	}
	
	@Override
	public String toString() {
		
		return "Coche [color=" + color + ", marca=" + this.marca + ", modelo=" + modelo + "]";
	}
}
