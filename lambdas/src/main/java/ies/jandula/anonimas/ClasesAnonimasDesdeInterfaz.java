package ies.jandula.anonimas;
public class ClasesAnonimasDesdeInterfaz {

   interface InterfaceNombre {

       public void metodoNombre(String name);

   }

   public static void main(String[] args) {

       InterfaceNombre anon = new InterfaceNombre() {
           @Override
           public void metodoNombre(String name) {

               System.out.println("Sobreescribimos el método de manera anónima:" + name);
           }

       };

       anon.metodoNombre("Mildred");

   }

}