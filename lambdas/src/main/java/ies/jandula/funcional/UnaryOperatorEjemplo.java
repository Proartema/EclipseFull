package ies.jandula.funcional;


 


import
java.util.function.UnaryOperator;


 


public class UnaryOperatorEjemplo {


      


      


public static void main(String[] args) {


            


             UnaryOperator<Long>
factorial = (n) -> {


                   


                    Long res= 1L;


                    for (int i = 1; i<=n ;i++) {


                         


                         


                          res= res*i;


                    }


                   


                    return res;


             };


            


            


            


            


            


             System.out.println("The factorial de 5 es: " + factorial.apply(5L));


            


}


 


}