package objetosTema3;

public class SUVElectrico extends SUV {
	public static final String TYPE_SUVE="SUVE";
	public SUVElectrico(String color, String marca, String modelo, double precio, double coste) {
		super(color, marca, modelo, precio, coste);
	}
public String getTipoCoche() {
		
		return TYPE_SUVE;
	}
}
