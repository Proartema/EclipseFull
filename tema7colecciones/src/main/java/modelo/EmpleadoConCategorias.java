package modelo;
import java.util.EnumSet;

public class EmpleadoConCategorias extends Empleado{

   

   public EnumSet<CategoriasEmpleado> categorias= EnumSet.noneOf(CategoriasEmpleado.class);
   
public EmpleadoConCategorias () {
       
       
   }
   
public EmpleadoConCategorias (int id, String nombre, String apellidos) {
   super(id,nombre,apellidos);
   
}


   public EmpleadoConCategorias (int id, String nombre, String apellidos,EnumSet<CategoriasEmpleado> categorias) {
       
   
       super(id,nombre,apellidos);
       
       this.categorias = categorias;
   }


   

   public EnumSet<CategoriasEmpleado> getCategorias() {
       return categorias;
   }

   public void setCategorias(EnumSet<CategoriasEmpleado> categorias) {
       this.categorias = categorias;
   }

   
   public void addCategoria(CategoriasEmpleado enumCat) {
       

       
       categorias.add(enumCat);
       
   }
   
   public void removeCategoria(CategoriasEmpleado enumCat) {
       
       categorias.remove(enumCat);
   }
   

   
   @Override
   public String toString() {
       return "EmpleadoConCategorias [categorias=" + categorias + ", id" + getId() + ", Nombre=" + getNombre()
               + ", Apellidos=" + getApellidos() + "]";
   }
   
       
}