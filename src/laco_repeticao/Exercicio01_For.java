package laco_repeticao;

import java.util.Scanner;

public class Exercicio01_For {

	public static void main(String[] args) {

		// variáveis

		int num1, num2, contador;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite primeiro valor: ");
		num1 = leia.nextInt();

		System.out.println("Digite segundo valor: ");
		num2 = leia.nextInt();

		if (num1 >= num2) {
			System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");

		}

		System.out.println("Múltiplos de 3 e 5 no intervalo:");

		for (contador = num1; contador <= num2; contador++) {
			if (contador % 3 == 0 && contador % 5 == 0) {
				System.out.println(contador);
			}
		}

		leia.close();

	}

}
