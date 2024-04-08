package fechas;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.MONTHS;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fecha1;
		String fecha2;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una fecha en el formato: dd/MM/yyyy");
		
		fecha1= sc.nextLine();
		System.out.println("Introduce otra fecha en el formato: dd/MM/yyyy");
		
		fecha2= sc.nextLine();
		
		LocalDate date1= LocalDate.parse(fecha1, formatter);
		LocalDate date2= LocalDate.parse(fecha2, formatter);
		long meses = MONTHS.between(date1, date2);
		
		System.out.println("Los meses de diferencia son "+ meses);
	}

}
