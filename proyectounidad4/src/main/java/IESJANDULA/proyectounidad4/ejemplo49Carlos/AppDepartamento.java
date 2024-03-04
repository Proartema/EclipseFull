package IESJANDULA.proyectounidad4.ejemplo49Carlos;

public class AppDepartamento {

	public static void main(String[] args) {
	

		Alcalde alcalde = new Alcalde("Carlos", "Cano Ladera", EnumPartido.CENTRO);
		
		Villa m1= new Villa("Andujar", 35000, 14.2, 250.2, alcalde);
		Pedania m2= new Pedania("Villa de Andújar", 45000, 10.2, 455.2, m1);
		
		Departamento dep = new Departamento("Sierra Morena");
		
		
		dep.agregarMunicipio(m1);
		dep.agregarMunicipio(m2);
		
		dep.eliminarMunicipio(m2);
		
		dep.imprimirInfoDepartamento();
		
		dep.agregarMunicipio(m2);
		

		dep.imprimirInfoDepartamento();
	

	}

}
