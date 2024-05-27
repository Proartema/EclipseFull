package tema7coleccionesejemplos;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

class TreeSetEjemplo {
   public static void main(String args[]) {
// Create a tree set.
       TreeSet<String> ts = new TreeSet<String>();
// Add elements to the tree set.

       ts.add("A");
       ts.add("B");
       ts.add("E");
       ts.add("F");
       ts.add("D");
       ts.add("H");
       ts.add("G");
       ts.add("");
       System.out.println(ts);

       // SortedSet

       String elCeiling = ts.ceiling("C");

       System.out.println("El ceiling de C es " + elCeiling);

       String elfloor = ts.floor("H");

       System.out.println("El floor de H es " + elfloor);

       SortedSet<String> head = ts.headSet("E");

       System.out.println("Subconjunto con los elementos menores que 'E', o HEAD" + head);

       TreeSet<String> tail = (TreeSet<String>) ts.tailSet("D");

       System.out.println("Subconjunto con los elementos mayores que 'D', o TAIL" + tail);

       // Navigable Set

       String elPrimero = ts.pollFirst();

       System.out.println("despues del pollLast se quita el primer elemento " + elPrimero + " y queda " + ts);

       String elUltimo = ts.pollLast();

       // Lastly printing the elements of TreeSet remaining
       // to figure out pollLast() method
       System.out.println("despues del pollLast se quita el ultimo elemento " + elUltimo + " y queda " + ts);

       String elHigher = ts.higher("C");

       System.out.println("El mayor de C es " + elHigher);

       String elLower = ts.lower("H");

       System.out.println("El menor de H es " + elfloor);

       NavigableSet<String> headNav = ts.headSet("E", true);

       System.out.println("Subconjunto con los elementos menores que 'E', o HEAD" + headNav);

       TreeSet<String> tailNav = (TreeSet<String>) ts.tailSet("D", true);

       System.out.println("Subconjunto con los elementos mayores que 'D', o TAIL" + tail);

       NavigableSet<String> subset = ts.subSet("B", true, "G", false);

       System.out.println("Subconjunto con los elementos mayores que 'B' incluido, menores que 'G'" + subset);

   }
}