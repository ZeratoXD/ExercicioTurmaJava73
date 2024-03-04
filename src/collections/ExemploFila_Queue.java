package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;


public class ExemploFila_Queue {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<Integer>();

		for (int i = 0; i <= 10; i++)
			fila.add(i);

		System.out.println("\nElementos na fila: "	+ fila);
		
		System.out.println("\nRemover Elemento: " + fila.remove());

		System.out.println("\nFila atualizada: " + fila);
		
		System.out.println("\nAdicionar Elemento 11: " + fila.add(11));

		System.out.println("\nExibir a Fila atualizada: " + fila);

		System.out.println("\nExibir o Primeiro Elemento da fila: " + fila.peek());
		
		// Criando a Collection de Iteração
		Iterator<Integer> iterator = fila.iterator();
		
	
		
		
		
	
		
		
		
		
	}

}
