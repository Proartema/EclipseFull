package ies.jandula.funcional;
public class FunctionalInterfaceEjemplo {

   @FunctionalInterface
   interface MiPrimerFunctionalInterface {

       public double operacion(double a, double b);

       default double identity(double num) {

           return num;
       }

       public static int transformaAInteger(double num) {

           return (int) num;
       }

   }

   public static void main(String[] args) {

       MiPrimerFunctionalInterface varFunctionalSuma = new MiPrimerFunctionalInterface() {

           @Override
           public double operacion(double a, double b) {
               // TODO Auto-generated method stub
               return a + b;
           }
       };

       System.out.println("La operacion definida en la clase anónima es la suma:" + varFunctionalSuma.operacion(5, 7));

   MiPrimerFunctionalInterface varFunctionalProduct = (x, y) -> x * y;

       System.out.println("La operación definida en la expresion lambda producto da como resultado:"
               + varFunctionalProduct.operacion(5, 7));
       
       MiPrimerFunctionalInterface varFunctionalbloque = (x, y) -> {
           x = 2 * x;
           return x * y;
       };

   }

}