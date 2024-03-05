package IESJANDULA.proyectounidad4.ejercicio51;

public class Tecnico extends Empleado{
	
	
	private String area;
	private final double porcentajeAntiguedad=0.05;
	
	public Tecnico(String nombre, String apellidos, String nif, int antiguedad, int salario, String area) {
		super(nombre, apellidos, nif, antiguedad, salario);
		// TODO Auto-generated constructor stub
	}

	public String getArea() {
		return area;
	}

	public double getPorcentajeAntiguedad() {
		return porcentajeAntiguedad;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setPorcentajeAntiguedad(double porcentajeAntiguedad) {
		this.porcentajeAntiguedad = porcentajeAntiguedad;
	}

	public double calculaImpuestos(double salarioBruto,double impuestos) {
		
		return salarioBruto*impuestos;
	}
	
	@Override
	public double calculaSueldo(double impuestos) {
		double salarioBruto= this.getSalario()+(porcentajeAntiguedad*this.getAntiguedad());
		
		return salarioBruto-calculaImpuestos(salarioBruto,impuestos);
	}

	@Override
	public EnumCategoria tipoEmpleado() {
		// TODO Auto-generated method stub
		return EnumCategoria.TECNICOS;
	}
	
	
}
