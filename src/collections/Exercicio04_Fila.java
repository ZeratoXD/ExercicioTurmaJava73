package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio04_Fila {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);

	        Queue<String> filaClientes = new LinkedList<>();

	        int opcao;
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1: Adicionar um novo Cliente na fila");
	            System.out.println("2: Listar todos os Clientes na fila");
	            System.out.println("3: Chamar (retirar) uma pessoa da fila");
	            System.out.println("0: Sair do programa");
	            System.out.print("Escolha uma opção: ");
	            
	            opcao = leia.nextInt();
	            leia.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do Cliente: ");
	                    String cliente = leia.nextLine();
	                    filaClientes.add(cliente);
	                    System.out.println("Cliente adicionado com sucesso!");
	                    break;

	                case 2:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("A fila está vazia.");
	                    } else {
	                        System.out.println("\nLista de Clientes na Fila:");
	                        for (String c : filaClientes) {
	                            System.out.println(c);
	                        }
	                    }
	                    break;

	                case 3:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("A fila está vazia. Não é possível chamar um cliente.");
	                    } else {
	                        String clienteChamado = filaClientes.poll();
	                        System.out.println("Cliente chamado: " + clienteChamado);
	                    }
	                    break;

	                case 0:
	                    System.out.println("Programa finalizado.");
	                    break;

	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (opcao != 0);

	        leia.close();
	}

}
