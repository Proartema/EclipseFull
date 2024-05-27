package modelo;
import java.util.Comparator;
import java.util.Objects;

public class Empleado implements Comparable<Empleado> {
   
   int id;
   String nombre;
   
   String apellidos;
   
   public Empleado () {
       
       
   }
   
   public Empleado (int id, String nombre, String apellidos) {
       
       this.id=id;
       this.nombre=nombre;
       this.apellidos=apellidos;
       
   }
   
   public int getId() {
       return id;
   }

   public void setId(int id) {
       this.id = id;
   }

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public String getApellidos() {
       return apellidos;
   }

   public void setApellidos(String apellidos) {
       this.apellidos = apellidos;
   }

   @Override
   public String toString() {
       return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
   }

   @Override
   public int hashCode() {
       return Objects.hash(apellidos, id, nombre);
   }

   @Override
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       Empleado other = (Empleado) obj;
       return Objects.equals(apellidos, other.apellidos) && id == other.id && Objects.equals(nombre, other.nombre);
   }

   @Override
   public int compareTo(Empleado o) {
       // TODO Auto-generated method stub
       String nombreCompEmp1= this.getApellidos() + " " + this.getNombre();
       String nombreCompEmp2 = o.getApellidos() + " " + o.getNombre();
       
       
       return nombreCompEmp1.compareTo(nombreCompEmp2);
       
   }

   
}