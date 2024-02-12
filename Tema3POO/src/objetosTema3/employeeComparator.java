package objetosTema3;

import java.util.Comparator;

public class employeeComparator implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		String name1 = o1.getApellido() + "" + o1.getNombre();
		String name2 = o2.getApellido() + "" + o2.getNombre();
		return name1.compareTo(name2);
	}

}
