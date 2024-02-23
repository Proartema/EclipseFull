package IESJANDULA.proyectounidad4.ejercicio49;

public class AppDepartamento {

	public static void main(String[] args) {

		Municipio m1 = new Municipio("Andújar", 56700, 40.0, 500.2);
		Municipio m2 = new Municipio("Torremolinos", 120000, 25.0, 20.0);

		Departamento d1 = new Departamento("Sanidad");

		d1.agregarMunicipio(m1);
		d1.agregarMunicipio(m2);

		d1.buscarMunicipioConPoblacion(56700);

	}

}
