package IESJANDULA.proyectounidad4.ejercicio51;

public class Subdirectivo extends Empleado{
	
	private double porcentajeBonusAntiguedad;
	private double primaAnual;
	
	public Subdirectivo(String nombre, String apellidos, String nif, int antiguedad, int salario) {
		super(nombre, apellidos, nif, antiguedad, salario);
	}

	public double getPorcentajeBonusAntiguedad() {
		return porcentajeBonusAntiguedad;
	}

	public double getPrimaAnual() {
		return primaAnual;
	}

	public void setPorcentajeBonusAntiguedad(double porcentajeBonusAntiguedad) {
		this.porcentajeBonusAntiguedad = porcentajeBonusAntiguedad;
	}

	public void setPrimaAnual(double primaAnual) {
		this.primaAnual = primaAnual;
	}
	
	
	@Override
	public double calculaSueldo(double impuestos) {
		double salarioBruto= this.getSalario()+(porcentajeBonusAntiguedad*this.getAntiguedad()+primaAnual);
		
		return salarioBruto-this.calculaImpuestos(salarioBruto,impuestos);
	}

	@Override
	public EnumCategoria tipoEmpleado() {
		// TODO Auto-generated method stub
		return EnumCategoria.SUBDIRECTIVO;
	}
	
	
	
}
