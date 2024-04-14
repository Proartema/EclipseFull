package fechas;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.SECONDS;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		
		String fecha1;
		String fecha2;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una fecha en el formato: dd/MM/yyyy");
		
		fecha1= sc.nextLine();
		LocalDate date1= LocalDate.parse(fecha1, formatter);
		System.out.println("Introduce otra fecha en el formato: DD-yyyy");
		formatter= DateTimeFormatter.ofPattern("DD-yyyy");
		fecha2= sc.nextLine();
		LocalDate date2= LocalDate.parse(fecha2, formatter);
		
		
		long meses = MONTHS.between(date1, date2);
		long dias = SECONDS.between(date1, date2);
		
		System.out.println("Los meses de diferencia son "+ meses);
		System.out.println("Los días de diferencia son "+ dias);
		
	}

}
