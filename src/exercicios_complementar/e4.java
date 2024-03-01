package exercicios_complementar;

import java.util.Scanner;

public class e4 {

	public static void main(String[] args) {
		// Variaveis
				int valor;
				int notasCem, notasCiq, notasVinte, notasDez, notasCinco, notasDois, notasUm;
				
				Scanner leia = new Scanner(System.in);
				
				// Entrada de Dados
				System.out.println("Insira um valor: ");
				valor = leia.nextInt();
				System.out.println(" ");	// apenas para pular linha
				
				// Processamento
				
		        notasCem = valor / 100;
		        valor = valor % 100;
		        
		        notasCiq = valor / 50;
		        valor %= 50;
		        
		        notasVinte = valor / 20;
		        valor %= 20;
		        
		        notasDez = valor / 10;
		        valor %= 10;
		        
		        notasCinco = valor / 5;
		        valor %= 5;
		        
		        notasDois = valor / 2;
		        valor %= 2;
		        
		        notasUm = valor;
		        
				// Saída de Dados
		        
		        System.out.printf("%d nota(s) de R$ 100,00%n", notasCem);
		               
		        System.out.printf("%d nota(s) de R$ 50,00%n", notasCiq);
		               
		        System.out.printf("%d nota(s) de R$ 20,00%n", notasVinte);

		        System.out.printf("%d nota(s) de R$ 10,00%n", notasDez);

		        System.out.printf("%d nota(s) de R$ 5,00%n", notasCinco);

		        System.out.printf("%d nota(s) de R$ 2,00%n", notasDois);

		        System.out.printf("%d nota(s) de R$ 1,00%n", notasUm);

		        leia.close();	

	}

}
