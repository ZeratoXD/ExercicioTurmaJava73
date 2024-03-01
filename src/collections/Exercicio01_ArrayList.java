package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01_ArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Criando um ArrayList para armazenar as cores
		ArrayList<String> listaCores = new ArrayList<String>();

		// Solicitando ao usuário que digite 5 cores e adicionando ao ArrayList
		for (int i = 0; i < 5; i++) {
			System.out.print("Escolha uma cor: ");
			String cor = leia.nextLine();
			listaCores.add(cor);
		}

		// Mostrando na tela todas as cores adicionadas
		System.out.println("\nListar todas as cores:");
		for (String cor : listaCores) {
			System.out.println(cor);
		}

		// Ordenando o ArrayList em ordem crescente
		Collections.sort(listaCores);

		// Mostrando na tela as cores ordenadas
		System.out.println("\nOrdenar as cores:");
		for (String cor : listaCores) {
			System.out.println(cor);
		}

		// Fechando o scanner
		leia.close();

	}

}
