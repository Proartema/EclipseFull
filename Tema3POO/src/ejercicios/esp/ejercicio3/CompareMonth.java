package ejercicios.esp.ejercicio3;

import java.util.Comparator;

public class CompareMonth implements Comparator<Date>{

	@Override
	public int compare(Date o1,Date o2) {
			
		return (o1.getMonth() > o2.getMonth()) ? 1 : ((o1.getMonth() == o2.getMonth()) ? 0 : -1);
	}
	
	public static void main(String[] args) {
		
		CompareMonth dateComp = new CompareMonth();
		Date d1 = new Date(20, 10, 1998);
		Date d2 = new Date(30,9, 2000);
		System.out.println(dateComp.compare(d1, d2));
	}

}
