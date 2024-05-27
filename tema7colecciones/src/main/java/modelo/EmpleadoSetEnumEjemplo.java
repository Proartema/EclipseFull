package modelo;
import java.util.EnumSet;

import modelo.CategoriasEmpleado;
import modelo.EmpleadoConCategorias;

public class EmpleadoSetEnumEjemplo {
   
public static void main(String[] args) {
   

   EnumSet<CategoriasEmpleado> setCat = EnumSet.of(CategoriasEmpleado.ASOCIADO, CategoriasEmpleado.CONTRATADO);
   
   EmpleadoConCategorias emplCat = new EmpleadoConCategorias(4,"Carlos","Perez", setCat );
   
   emplCat.addCategoria(CategoriasEmpleado.FIJO);
   emplCat.removeCategoria(CategoriasEmpleado.CONTRATADO);
   
   System.out.println("Empleado creado: " + emplCat);
}

} 