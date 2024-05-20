package fechas;

import java.sql.Date;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class ejercicio7 {

	public static long getDateDiff(Date fecha1, Date fecha2, TimeUnit unidad) {
	    long diff = fecha2.getTime() - fecha1.getTime();
	    return unidad.convert(diff,TimeUnit.MILLISECONDS);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String String1= "2005/11/19 00:00:00.000";
		String String2= "2000/10/29 00:00:00.000";
		LocalDate fecha1= LocalDate.valueOf(String1);
		LocalDate fecha2= LocalDate.valueOf(String2);
		TimeUnit horas = TimeUnit.HOURS;
		System.out.println("Diferencia=" + getDateDiff(fecha1,fecha2,horas));
	}


}
