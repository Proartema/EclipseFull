package metodosinterfaces;

public class ComponenteDeCoche {
	private String descripcion;
	private double peso;
	private double coste;
	public ComponenteDeCoche() {
		
	}
	public ComponenteDeCoche(String descripcion, double peso, double coste) {
		
		this.descripcion = descripcion;
		this.peso = peso;
		this.coste = coste;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public double getPeso() {
		return peso;
	}
	public double getCoste() {
		return coste;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setCoste(double coste) {
		this.coste = coste;
	}
	@Override
	public String toString() {
		return "ComponenteDeCoche [descripcion=" + descripcion + ", peso=" + peso + ", coste=" + coste + "]";
	}
	
}
