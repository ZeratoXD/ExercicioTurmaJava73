package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		// Vetor
		String cachorros[] = new String[3];
		
		
		Scanner leia = new Scanner(System.in);
		int indice;

		for (indice = 0; indice < 3; indice++) {
			
			System.out.println("Digite o " + (indice + 1) + "° nome: ");
			cachorros[1] = leia.nextLine();
		
		}
		// Lista os nomes
		for (indice = 0; indice < cachorros.length ; indice++) {
		System.out.println("cachorros [" + indice + "]: " + cachorros [indice]);
			
			
		}
		
	}

}
