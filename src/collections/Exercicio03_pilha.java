package collections;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio03_pilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        // Criando uma pilha para armazenar os livros
        Stack<String> pilhaLivros = new Stack<>();

        int opcao;
        do {
            // Exibindo o menu
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da Pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Sair do programa");
            System.out.print("Escolha uma opção: ");
            
            // Lendo a opção do usuário
            opcao = leia.nextInt();
            leia.nextLine(); // Consumindo a quebra de linha

            switch (opcao) {
                case 1:
                    // Adicionar um novo livro na pilha
                    System.out.print("Digite o nome do livro: ");
                    String livro = leia.nextLine();
                    pilhaLivros.push(livro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    // Listar todos os livros da pilha
                    listarLivros(pilhaLivros);
                    break;

                case 3:
                    // Retirar um livro da pilha
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia. Não é possível retirar um livro.");
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("Livro retirado: " + livroRetirado);
                    }
                    break;

                case 0:
                    // Finalizar o programa
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        // Fechando o scanner
        leia.close();
    }

    private static void listarLivros(Stack<String> pilhaLivros) {
        System.out.println("\nLista de Livros na Pilha:");
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            for (String livro : pilhaLivros) {
                System.out.println(livro);
            }
        }

	}

}
