package fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EjemploFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fecha;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una fecha en el formato: dd/MM/yyyy");
		
		fecha= sc.nextLine();
		
		LocalDate date= LocalDate.parse(fecha, formatter);
		
		System.out.println(date);
	}

}
