package laco_repeticao;

import java.util.Scanner;

public class Exercicio03_Do_while {

	public static void main(String[] args) {
		
		int num1, positivos = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
            System.out.println("Digite um número (Caso queira encerrar digite 0):");
            num1 = leia.nextInt();

            if (num1 > 0) {
                positivos += num1;
            }
        } while (num1 != 0);

        System.out.println("A soma dos números positivos é de: " + positivos);

        leia.close();

	}

}
