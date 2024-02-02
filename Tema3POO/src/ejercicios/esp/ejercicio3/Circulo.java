package ejercicios.esp.ejercicio3;

public class Circulo {
	    
		private double radius = 1.0;
		private String color = "Rojo";
	    public Circulo () {
	    	
	    }
	    public Circulo (double radius) {
	    	this();
	        this.radius=radius;
	        
	    }
	    

	    public double getRadio() {
	        return radius;
	    }

	    public void setRadio(int radio) {
	        this.radius = radio;
	    }
	    
	    public double calcularArea() {

	        //pi * r*r
	        return Math.PI* Math.pow(radius, 2);
	    }
	    
	    public double calcularPerimetro () {

	        //pi * d (d=r*r)
	        return 2* (int) Math.PI * radius;
	    }

	    @Override
	    public String toString () {

	        return "Circulo [radio =" + radius + "]";
	    }
	    
	   
	}
