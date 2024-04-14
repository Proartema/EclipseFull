package fechas;

import static java.time.temporal.ChronoUnit.MINUTES;
import static java.time.temporal.ChronoUnit.MILLIS;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String fechaString1;
		String fechaString2;
		LocalTime time1;
		LocalTime time2;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H m s");
		
		
		
		System.out.println("Introduce una hora en el formato: H m s");
		
		fechaString1= sc.nextLine();
		time1= LocalTime.parse(fechaString1, formatter);
		
		
		System.out.println("Introduce otra hora en el formato: HH:mm:ss");
		formatter= DateTimeFormatter.ofPattern("HH:mm:ss");
		fechaString2= sc.nextLine();
		time2= LocalTime.parse(fechaString2, formatter);
		
		
		long minutos = MINUTES.between(time1, time2);
		long milisegundos = MILLIS.between(time1, time2);
		
		System.out.println("Los minutos de diferencia son "+ minutos);
		System.out.println("Los milisegundos de diferencia son "+ milisegundos);
		
		
		time1=time1.minusMinutes(3);
		System.out.println("Los minutos de la primera hora menos 3 dan "+ time1);
		time2=time2.plusSeconds(15);
		System.out.println("Los segundos de la segunda hora mas 15 dan "+ time2);
		
		System.out.println("Concretamente la segunda hora tiene la hora "+ time2.getHour()+", los minutos "+time2.getMinute()+" y los segundos "+time2.getSecond());
		OffsetTime time3=time2.atOffset(ZoneOffset.ofHours(-6));
		System.out.println("La segunda hora en Nueva York sería las "+time3);
	}

}
