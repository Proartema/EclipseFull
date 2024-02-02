package ejercicios.esp.ejercicio3;

public class Circle extends Shape {
	private double radius=1.0;

	public Circle() {
		
	}

	public Circle(double radius) {
		
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return Math.PI * (2*radius);
	}
	@Override
	public double getPerimeter() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}

	
	
	
	
	
	
}
