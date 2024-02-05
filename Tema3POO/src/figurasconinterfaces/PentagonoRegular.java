package figurasconinterfaces;

public class PentagonoRegular extends FiguraGeometrica {
	
	protected double apotema;
	protected double lado;
	
	public PentagonoRegular() {
		this.tipoFigura= EnumFigura.POLIGONOS;
	}
	
	public PentagonoRegular(double lado) {
		this();
		this.lado=lado;
	}
	
	private double calcularApotema() {
		return this.apotema=(2*this.calcularArea())/this.calcularPerimetro();
	}
	
		
	
	@Override
	public double calcularArea() {
		
		return (this.calcularPerimetro()*this.calcularApotema())/2;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.lado*5;
	}

}
