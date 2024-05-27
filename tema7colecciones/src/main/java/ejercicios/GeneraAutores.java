package ejercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class GeneraAutores {
   
	private static final String BLANCO = " ";
	
	private static final String nombres[] = { "ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO",
           "JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER", "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA",
           "MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA", "PAULA", "ELENA", "MARIA LUISA", "RAQUEL" };

   private static final String apellidos[] = { "García", "Gonzalez", "Rodriguez", "Fernandez", "Lopez", "Martinez",
           "Sanchez", "Perez", "Gomez", "Martin", "Jimenez", "Ruiz", "Hernandez", "Diaz", "Moreno", "Muñoz", "Alvarez",
           "Romero", "Alonso", "Gutierrez", "Navarro", "Torres", "Dominguez", "Vazquez", "Ramos", "Gil", "Ramirez",
           "Serrano", "Blanco", "Molina", "Morales", "Suarez", "Ortega", "Delgado", "Castro", "Ortiz", "Rubio",
           "Marin", "Sanz", "Nuñez", "Iglesias", "Medina", "Garrido", "Cortes", "Castillo", "Santos" };
   // el max es +1 para hacer incluyente
   private static BiFunction <Integer,Integer,Integer> enteroEntre = (min,max) -> (new Random()).nextInt(min,max+1);
   private static Supplier<Integer> edadAleatoria = () -> (new Random()).nextInt(0,100);
   private static Supplier<String> nombreAleatorio = () -> nombres[enteroEntre.apply(0,nombres.length-1)];
   private static Supplier<String> apellidosAleatorios = () -> apellidos[enteroEntre.apply(0,apellidos.length-1)]
   												+ BLANCO
   												+ apellidos[enteroEntre.apply(0, apellidos.length-1)];
   
   public static List<Autor> generaAutoresList (int id) {
	return new Autor.(nombreAleatorio.get(),
							apellidosAleatorios.get(),
							id,
							edadAleatoria.get());
       
       
   }
   
   public static Map<Integer, Autor> generaAutoresMap(int n) {
       
	   List<Autor> listaAutor = new ArrayList(n + (int) n*0.75);
	   for (int i = 0, i<n ; i++) {
    	   
       }
       
   }    
   
   public static Set<Integer, Autor> generaAutoresSet(int n) {
       
       
   }

}