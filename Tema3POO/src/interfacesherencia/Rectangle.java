package interfacesherencia ;

public class Rectangle implements GeometricObject{
	private double width;
	private double length;
	public Rectangle() {
		
	}
	public Rectangle(double width, double length) {
		
		this.width = width;
		this.length = length;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*width + 2*length;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + "]";
	}
	
	
	
}
