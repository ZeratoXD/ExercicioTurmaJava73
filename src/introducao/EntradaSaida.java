package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		String nome ;
		int idade;
		
		//Concatenação juntar um texto com 1 ou mais variáveis
		

		//Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println ("Insira seu nome: ");
		nome = leia.next();
		System.out.println ("Insira sua idade: ");
		idade = leia.nextInt();
		
		// Saída de dados
		System.out.println("Bom dia, " + nome);
		System.out.println("A sua idade é " + idade);
	}

}
