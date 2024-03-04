package IESJANDULA.proyectounidad4.ejercicio44;


public class BlocNotas {
	private static final int CAPACIDAD = 300;
	private static Nota notaNula= new NotaMarcada(0,"ZZZZZZ",0,"ZZZZZZ");
	private Nota[] notas;
	private int contNotas;
	
	public BlocNotas() {
		notas = new Nota[CAPACIDAD];
		rellenaNotasNull();
	}
	
	public BlocNotas(Nota[] notasParam) {
		
		for (int i = 0; i < notasParam.length && i < CAPACIDAD; i++) {
			
			this.agregarNota(notasParam[i]);
		}
		
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}
	
	public boolean agregarNota(Nota N1) {
		int cont = 0;
		boolean hayHueco = false;
		while (cont < this.notas.length && !hayHueco) {
			if (notas[cont] == notaNula) {
				hayHueco = true;
			} else {
				cont++;
				contNotas++;
			}
		}
		if (hayHueco) {
			notas[cont] = N1;
		}
		return hayHueco;
	}
	
	public boolean eliminarNota(int identificador) {
		boolean encontrado = false;
		for (int i = 0; i < CAPACIDAD && !encontrado; i++) {
			if (notas[i].equals(identificador)) {
				encontrado = true;
				notas[i] = null;
				contNotas--;
			}
		}
		return encontrado;
	}
	 private void rellenaNotasNull() {

			for (int i = 0; i < CAPACIDAD; i++) {

				notas[i] = notaNula;
			}
		}
	 public void mostrarNotas() {
		   
	       for (int i = 0; i < notas.length; i++) {
	           if (i == notas.length - 1 && notas[i].equals(notaNula))
	               System.out.print(notas[i]);
	           else
	               System.out.print(notas[i] + ", ");

	       }

	       System.out.println();

	   }
	 public void buscarNotas(int identificador) {
			boolean encontrado = false;
			for (int i = 0; i < CAPACIDAD && !encontrado; i++) {
				if (notas[i].getIdentificador()==(identificador)) {
					encontrado = true;
					System.out.println(notas[i].toString());
				}
				
			}
			if (encontrado == false) {
				System.out.println("No se ha encontrado la nota");
			}
			
		}
	 public boolean hayNotas() {
			
			return contNotas>0;
		}
	
	
	
}
