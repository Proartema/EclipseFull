package fechas;

import java.time.ZoneId;

import java.util.Set;

public class EjemploZoneId {

	public static void main(String[] args) {


             // TODO Auto-generated method stub


            


            


            


ZoneId desplanZone = ZoneId.of("UTC+2");


            


             System.out.println("Zona con
desplazamiento" + desplanZone);            


ZoneId
zoneBerlin = ZoneId.of("Europe/Berlin");


 


            


             System.out.println(zoneBerlin);


            


             ZoneId zoneMadrid = ZoneId.of("Europe/Madrid");


 


             System.out.println(zoneMadrid);


            


              //ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);


 


            


             Set<String> zoneIds= ZoneId.getAvailableZoneIds();


 


             for (String zone : zoneIds) {


                 System.out.println(zone);


             }


            


       }
}