package vetor_matriz;

import java.util.Scanner;

public class Exercicio02_Matriz {

	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		int elementPrincipal[] = new int[3];
		int elementSecundaria[] = new int[3];
		int linha, coluna;
		int somaPrincipal, somaSecundaria;	
		somaPrincipal = 0;
		somaSecundaria = 0;	
		
		Scanner leia = new Scanner(System.in);		
		
		for(linha = 0; linha <= 2; linha++) {
			for(coluna = 0; coluna <= 2; coluna++) {
				System.out.println("Digite o elemento " + linha + ", " + coluna + " da matriz:");
				matriz[linha][coluna] = leia.nextInt();			
			}	
		}	
		for(linha = 0; linha <= 2; linha++) {
			for(coluna = 0; coluna <= 2; coluna++) {
				if(linha == coluna) {
					elementPrincipal[coluna] = matriz[linha][coluna];
					somaPrincipal = somaPrincipal + matriz[linha][coluna];
				}
				switch(linha) {
				case 0:
					if(coluna == 2) {
						elementSecundaria[linha] = matriz[linha][coluna];
						somaSecundaria = somaSecundaria + matriz[linha][coluna];
					}
					break;		
				case 1:
					if(coluna == 1) {
						elementSecundaria[linha] = matriz[linha][coluna];
						somaSecundaria = somaSecundaria + matriz[linha][coluna];
					}
					break;
				case 2:
					if(coluna == 0) {
						elementSecundaria[linha] = matriz[linha][coluna];
						somaSecundaria = somaSecundaria + matriz[linha][coluna];
					}
					break;				
				}
			}		
		}
		System.out.println("Elementos da diagonal principal:");
		for(coluna = 0; coluna <= 2; coluna++) {
			System.out.print(elementPrincipal[coluna] + " ");
		}
		System.out.println("\n \nElementos da diagonal secundaria:");
		for(coluna = 0; coluna <= 2; coluna++) {
			System.out.print(elementSecundaria[coluna] + " ");
		}		
		System.out.println("\n \nSoma dos elementos da diagonal principal:\n" + somaPrincipal);		
		System.out.println("\n \nSoma dos elementos da diagonal secundária:\n" + somaSecundaria);	
	}
}

