package IESJANDULA.proyectounidad4.claseArrays;

import java.util.Comparator;

public class EmpleadoCompId implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	

}
