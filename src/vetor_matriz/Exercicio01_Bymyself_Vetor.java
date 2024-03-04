package vetor_matriz;

import java.util.Scanner;

public class Exercicio01_Bymyself_Vetor {

	public static void main(String[] args) {
		// Declaração do vetor  e da variável com entrada
				int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
				int numProcurado, posicao, auxiliar;
				boolean resposta;
				
				auxiliar = 0;
				resposta = false;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.println("Digite o número que você deseja encontrar: ");
				numProcurado = leia.nextInt();
				
				// Processamento
				for(posicao = 0; posicao < 10 ; posicao++) {
					if(numeros[posicao] == numProcurado) {
						resposta = true;
						auxiliar = posicao;
					}
				}	
				// Saída
				
				if(resposta == true) {
					System.out.print("O número " + numProcurado + " está localizado na posição: " + auxiliar);
				}
				else {
					System.out.println("O número " + numProcurado + " não foi encontrado!");
				}
					
			}
		}