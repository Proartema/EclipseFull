package IESJANDULA.proyectounidad4.ejercicio51enclase;

import IESJANDULA.proyectounidad4.ejercicio51.EnumCategoria;

public class Directivo extends Empleado{

		
		private double bonusPorcentaje;
		private double beneficiosDep;
		
		public Directivo(String nombre, String apellidos, String nif, int antiguedad, double salario, double bonusPorcentaje, double beneficiosDep) {
			super(nombre, apellidos, nif, antiguedad, salario);
			

			this.bonusPorcentaje= bonusPorcentaje;
			this.beneficiosDep= beneficiosDep;
		}
		
		

		public double getBonusPorcentaje() {
			return bonusPorcentaje;
		}



		public double getBeneficiosDep() {
			return beneficiosDep;
		}



		public void setBonusPorcentaje(double bonusPorcentaje) {
			this.bonusPorcentaje = bonusPorcentaje;
		}



		public void setBeneficiosDep(double beneficiosDep) {
			this.beneficiosDep = beneficiosDep;
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
		
		protected double calculaImpuestos(double sueldoBruto, double impuestos) {
			
				return sueldoBruto*impuestos;
		}
		
		
		
}
