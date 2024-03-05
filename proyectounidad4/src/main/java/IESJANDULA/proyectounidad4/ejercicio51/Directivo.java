package IESJANDULA.proyectounidad4.ejercicio51;

public class Directivo extends Empleado {
	
	private double bonusPorcentaje;
	private int beneficiosDep;
	
	public Directivo(String nombre, String apellidos, String nif, int antiguedad, int salario) {
		super(nombre, apellidos, nif, antiguedad, salario);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonusPorcentaje() {
		return bonusPorcentaje;
	}

	public int getBeneficiosDep() {
		return beneficiosDep;
	}

	public void setBonusPorcentaje(double bonusPorcentaje) {
		this.bonusPorcentaje = bonusPorcentaje;
	}

	public void setBeneficiosDep(int beneficiosDep) {
		this.beneficiosDep = beneficiosDep;
	}
	
	public double calculaImpuestos(double salarioBruto,double impuestos) {
		
		return salarioBruto*impuestos;
	}
	@Override
	public double calculaSueldo(double impuestos) {
		double salarioBruto= this.getSalario()+(bonusPorcentaje*beneficiosDep);
		
		return salarioBruto-calculaImpuestos(salarioBruto,impuestos);
	}

	@Override
	public EnumCategoria tipoEmpleado() {
		// TODO Auto-generated method stub
		return EnumCategoria.DIRECTIVO;
	}
}
