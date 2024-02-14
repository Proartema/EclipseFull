package wrapclasses;
public class Appwrap {
   
   public static void main(String[] args) {
       // TODO Auto-generated method stub
       
       Integer iObj = new Integer("3");
       //autoboxing
       Long lObje = 5L;
       //ESTE ES UN EJEMPLO CON METODOS
       Double dObj =5.9;
       Float flObj = new Float(dObj);
       Boolean blObj= true;
               
       Integer intVar =Integer.valueOf("6");
       
       Byte bObj = Byte.valueOf("23");
       
       //unboxing
       int iPrim = iObj;
       long lPrim= lObje;
       
       double dPrim = dObj;
       float flPrim = flObj;
       
       boolean blPrim = blObj;
       
       
       Double objDouble = dPrim;
       
       Long objLong = lPrim;
       
       
       
       String convPrim = " int to String " + String.valueOf(iPrim) + "" +
               
           " long to String " +    String.valueOf(lPrim) + "." +
           " double to String " +    String.valueOf(dPrim) + "." +
           " float to String " +    String.valueOf(flPrim) + "." +
           " boolean to String " +    String.valueOf(blPrim) + "." ;
               
           
       System.out.println("Primitive Types conversion to String" + convPrim);
       
       
       String convObj = " Integer to String " + String.valueOf(iObj) + "." +
       
           " Long to String " +    String.valueOf(lObje) + "." +
           " Double to String " +    String.valueOf(dObj) + "." +
           " Float to String " +    String.valueOf(flObj) + "." +
           " Boolean to String " +    String.valueOf(blObj) + "." ;
       
       
       
       
       System.out.println("Primitive Types conversion to String" + convObj);
       
       
   }
}