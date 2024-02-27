package lacos_condicionais;

import java.util.Scanner;

public class InterativoE2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float nota1,nota2,media;
		
		System.out.println ("Digite sua nota: ");
		nota1 = leia.nextFloat();
		System.out.println ("Digite sua nota: ");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if (media >= 6) {
			System.out.println ("Parabéns você foi aprovado(a) ");

	}
		else if (media >= 5) {
		System.out.println ("Está de exame, fique atento aos estudos ");
}
		else 
			System.out.println ("iiiiiih você foi de base! ");

	}
}