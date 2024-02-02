package ejercicios.esp.ejercicio3;

public class Direccion {
	protected String calle;
	protected String ciudad;
	protected int codigopostal;
	protected String pais;
	
	public Direccion() {
		
	}

	public Direccion(String calle, String ciudad, int codigopostal, String pais) {
		
		this.calle = calle;
		this.ciudad = ciudad;
		this.codigopostal = codigopostal;
		this.pais = pais;
	}

	public String getCalle() {
		return calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getCodigopostal() {
		return codigopostal;
	}

	public String getPais() {
		return pais;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setCodigopostal(int codigopostal) {
		this.codigopostal = codigopostal;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", codigopostal=" + codigopostal + ", pais=" + pais
				+ "]";
	}
	
	

}
