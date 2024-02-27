package exercicios_complementar;

public class e1 {

	public static void main(String[] args) {
		// Variaveis
				int num1, num2;
				
				Scanner leia = new Scanner(System.in);
				
				// Entrada de Dados
				System.out.println("Insira o primeiro valor: ");
				num1 = leia.nextInt();
				
				System.out.println("Insira o segundo valor: ");
				num2 = leia.nextInt();
				
				leia.close();
				
				// Saída de Dados
				System.out.println("\nSoma: " + (num1 + num2));
				System.out.println("Diferença: " + (num1 - num2));
				System.out.println("Multiplicação: " + (num1 * num2));
				System.out.println("Divisão: " + (num1 / num2));

	}

}
