package ejercicios.esp.ejercicio3;

import java.util.Comparator;

public class CompareDay implements Comparator<Date>{

	@Override
	public int compare(Date o1,Date o2) {
			
		return (o1.getDay() > o2.getDay()) ? 1 : ((o1.getDay() == o2.getDay()) ? 0 : -1);
	}
	
	public static void main(String[] args) {
		
		CompareDay dateComp = new CompareDay();
		Date d1 = new Date(20, 10, 1998);
		Date d2 = new Date(20,9, 2000);
		System.out.println(dateComp.compare(d1, d2));
	}

}
