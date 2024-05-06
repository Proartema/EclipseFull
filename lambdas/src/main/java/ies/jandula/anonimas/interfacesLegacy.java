package ies.jandula.anonimas;

import java.util.concurrent.ForkJoinPool;

public class interfacesLegacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ForkJoinPool pool = ForkJoinPool.commonPool();
		
		Runnable thread = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hilo anonimo: ");
			}
			
		};
		
		Runnable threadLambda = () -> System.out.println("Hilo anonimo lambda: ");
		
		pool.execute(thread);
		
		pool.execute(() -> System.out.println("Hilo anonimo lambda: "));
	}

}
