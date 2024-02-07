package interfacesherencia;

public class Circle implements GeometricObject{
	public double radius;

	public Circle() {
		
	}

	public Circle(double radius) {
		
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI* Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2* (int) Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}
	
	
	
}
