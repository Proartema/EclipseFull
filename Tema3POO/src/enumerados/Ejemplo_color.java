package enumerados;

//Declaración de enum en java :

//La declaración de enumeración se puede hacer fuera de una clase o dentro de una clase, pero no dentro de un método.

// Un ejemplo de enumeración simple  donde  se declara la enumeración
// fuera de cualquier clase (Nótese  la palabra clave enum en lugar de class)

enum Color {
	RED, GREEN, BLUE;
}

public class Ejemplo_color {

	public static void main(String args[]) {
		

		Color c1 = Color.RED;
		Color c2 = Color.BLUE;

		Color c3 = Color.valueOf("GREEN");
		  System.out.println(c1);

	       System.out.println(c1 + " el orden del color c1 es " + c1.ordinal());
	       System.out.println(c2 + " el orden del color c1 es " + c2.ordinal());
	       System.out.println(c3 + " el orden del color c1 es " + c3.ordinal());
	       if (!c1.equals(c2)) {

	           System.out.println("El color " +c1 + " y " + c2 + " son diferentes");
		
	           Color[] valores = Color.values();
		
		for (int i=0; i<valores.length;i++) {
			System.out.println(valores[i]);
		}
		
		System.out.println(valores[Color.BLUE.ordinal()]);
	}
}