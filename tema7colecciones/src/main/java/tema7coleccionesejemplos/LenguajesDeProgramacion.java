package tema7coleccionesejemplos;
import java.util.EnumSet;


enum Lenguajes { JAVA, PYTHON, C, LISP, CSHARP , JAVASCRIPT };

// Main class
// EnumSetExample
public class LenguajesDeProgramacion {

// Main driver method
public static void main(String[] args) {

// Creating a set
EnumSet<Lenguajes> set1, set2, set3, set4,set5;

// Adding elements
set1 = EnumSet.of(Lenguajes.JAVA, Lenguajes.PYTHON, Lenguajes.CSHARP);
set2 = EnumSet.complementOf(set1);
set3 = EnumSet.allOf(Lenguajes.class);
set4 = EnumSet.range(Lenguajes.LISP, Lenguajes.JAVASCRIPT);
set5 = EnumSet.copyOf(set3);

// Printing corresponding elements in Sets
System.out.println("Set 1: " + set1);
System.out.println("Set 2: " + set2);
System.out.println("Set 3: " + set3);
System.out.println("Set 4: " + set4);
System.out.println("Set 5: " + set5);

System.out.println("Enumerado s1");

for (Lenguajes sEl: set1) {
   
   System.out.print( sEl + "," );
   System.out.flush();
   
}

set1.add(Lenguajes.LISP);

set2.remove(Lenguajes.LISP);



}

}