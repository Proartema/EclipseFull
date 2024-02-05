package figurasconinterfaces;

public class Circulo extends FiguraGeometrica{
	    
		private int radio;

	    public Circulo () {
	    	this.tipoFigura=EnumFigura.ELIPSES;
	    }

	    public Circulo (int radio) {
	    	this.tipoFigura=EnumFigura.ELIPSES;
	        this.radio=radio;
	    }

	    public int getRadio() {
	        return radio;
	    }

	    public void setRadio(int radio) {
	        this.radio = radio;
	    }
	    @Override
	    public double calcularArea() {

	        //pi * r*r
	        return Math.PI* Math.pow(radio, 2);
	    }
	    @Override
	    public double calcularPerimetro () {

	        //pi * d (d=r*r)
	        return 2* (int) Math.PI * radio;
	    }

	    @Override
	    public String toString () {

	        return "Circulo [radio =" + radio + "]";
	    }
	    
	   
	}
