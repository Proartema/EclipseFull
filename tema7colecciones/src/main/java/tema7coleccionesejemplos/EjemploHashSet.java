package tema7coleccionesejemplos;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSet {
   
   public static void main(String[] args) {
       // Creating object of Set and declaring String type
       Set<String> hs = new HashSet<String>();

       // Adding elements to Set
       // using add() method

       // Custom input elements
       hs.add("A");
       hs.add("B");
       hs.add("C");

       if (!hs.add("B")) {

           System.out.println("Elemento B ya pertenece al conjunto no se puede insertar de nuevo");

       }
       hs.add("D");
       hs.add("E");

       System.out.println();

       hs.remove("A");
       
       hs.removeIf(s-> s.compareTo("X")>0);
       
    		   if (!hs.remove("X")) {

           System.out.println("Elemento X no está en el conjunto no se puede borrar");

       }

       Object[] convertirArray = hs.toArray();

       System.out.println(Arrays.toString(convertirArray));

       System.out.println("Recorrido de conjunto con iterator");
       Iterator<String> it = hs.iterator();

       for (; it.hasNext();) {

           System.out.print(it.next() + ", ");
           System.out.flush();
       }

       System.out.println("\nRecorrido de conjunto con for each");

       // Iterating through the Set
       // via for-each loop
       for (String value : hs) {
           // Printing all the values inside the object
           System.out.print(value + ", ");

       }

       System.out.println("\nRecorrido de conjunto con método forEach y lambda");
       hs.forEach((elem) -> System.out.print(elem + ", "));

   }

}