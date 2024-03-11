package IESJANDULA.proyectounidad4.ejercicio44;

import java.util.Comparator;
import java.util.function.BiFunction;

public class appNotas {

	   public static void main(String[] args) {
	       // TODO Auto-generated method stub
	       
	       Nota n1= new NotaMarcada(0,"Conjunción",40,"Amarillo");
	       
	       Nota n2= new NotaAlarma(1,"Adelantar reloj",60,"10:20");
	       
	       BlocNotas bloq = new BlocNotas();
	       
	       bloq.agregarNota(n1);
	       bloq.agregarNota(n2);
	       
	       Nota n3= bloq.buscarNotas(0);
	       
	       System.out.println(n3);
	       
	    Nota[] notas = {n2,n3};
	   
	    bloq.eliminarNota(n1);
	    bloq.eliminarNota(n2);
	   
	    bloq.mostrarNotas();
	   
	   
	    bloq.addNotas(notas);
	   
	    bloq.mostrarNotas();
	   
	    bloq.ordenarNotas(new Comparator<Nota> (){

			@Override
			public int compare(Nota o1, Nota o2) {
				// TODO Auto-generated method stub
				int res=0;
				if (o1==null) {
					res=-1;
				} else if (o2==null) {
					res=1;
				} else {
					res= o1.getContenido().compareTo(o2.getContenido());
				}
				return res;
			} 
			
	    });
	    
	    bloq.listarNotas;
	    
	    bloq.devuelvaNotasOrdenado((o1,o2) -> o1.getContenido().compareTo(o2.getContenido()));
	   
	   BiFunction<Double, Integer, Double> bifu= (d,i) -> d*i;
	   
	   bifu.apply(5.0, 7);

	   

	   }

	}