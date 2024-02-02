package objetosTema3;

public class CrossOver extends Coche {
	public static final String TYPE_CO="Crossover";
	public CrossOver(String color, String marca, String modelo, double precio, double coste) {
		super();

	}
	public String getTipoCoche() {
		
		return TYPE_CO;
	}
	
	@Override
	public String toString() {
		return "CrossOver [getColor()=" + getColor() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste() + "]";
	}
	

}
