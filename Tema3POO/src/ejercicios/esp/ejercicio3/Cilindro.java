package ejercicios.esp.ejercicio3;

public class Cilindro extends Circulo {

	private double height = 0.0;

	public Cilindro() {

	}

	public Cilindro(double radius) {

		super(radius);
	}

	public Cilindro(double radius, double height) {

		super(radius);
	}

	public Cilindro(double radius, double height, String color) {

		super(radius);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return 2 * Math.PI * this.getRadio() * this.height + 2 * Math.PI * Math.pow(this.getRadio(), 2);
	}
	
	public double getVolume() {
		 return calcularArea()*height;
		 }

}
