package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio02_Set {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Set<Integer> inteiroSet = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe um valor inteiro: ");
			int valor = leia.nextInt();
			inteiroSet.add(valor);
		}

		System.out.println("\nListar dados do Set:");
		Iterator<Integer> iterator = inteiroSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		leia.close();

	}

}
