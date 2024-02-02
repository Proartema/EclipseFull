package objetosTema3;

public class SedanFamiliar extends Sedan {
	public SedanFamiliar(String color, String marca, String modelo, double precio, double coste, int numAsientos) {
		super(color, marca, modelo, precio, coste, numAsientos);
// TODO Auto-generated constructor stub
	}

	public void printNumAsientos() {
		System.out.println("Numero de asientos " + numAsientos);
	}
}