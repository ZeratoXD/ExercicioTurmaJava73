package laco_repeticao;

import java.util.Scanner;

public class Exercicio02_While {

	public static void main(String[] args) {

		int idade, menor21 = 0, maior50 = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite uma idade (digite uma idade negativa para encerrar):");

		while (true) {
			idade = leia.nextInt();

			if (idade < 0) {
				break;
			}

			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
				
			}
		}

		System.out.println(" O total de pessoas menores de 21 anos: " + menor21);
		System.out.println("O total de pessoas maiores de 50 anos: " + maior50);

		leia.close();

	}

}
