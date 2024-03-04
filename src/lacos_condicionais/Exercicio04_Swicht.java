package lacos_condicionais;

import java.util.Scanner;

public class Exercicio04_Swicht {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.print("Qual o códígo do produto de 1 a 6?: ");
		float num1= leia.nextFloat();
		
		System.out.print("Qual a quantidade do produtos: ");
		float num2 = leia.nextFloat();

		System.out.print("Qual a quantidade do produtos: ");
		int operacao = leia.nextInt();
		
		switch (operacao) {
		
			case 1:
				System.out.print( num1 + "+" + num2);
				
		
		}	
		
	}

}
