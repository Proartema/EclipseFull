package IESJANDULA.proyectounidad4.ejercicio51;

public class AppEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Empresa Manresa= new Empresa("58456732","Manresa",1000.0);
			
			Tecnico Paco = new Tecnico("Paco","Fiestas","5678901234",35,1008,"Oficina");
			
			Manresa.agregarEmpleado(Paco);
			System.out.println(Manresa.buscarEmpleadoPorNif("5678901234"));
	}

}
