package exercios_java;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		// variáveis
		
		float nota1, nota2,nota3,nota4,media; 
		
		
		//Entrada
		
		System.out.println ("Digite sua nota: ");
		nota1 = leia.nextFloat();
		System.out.println ("Digite sua nota: ");
		nota2 = leia.nextFloat();
		System.out.println ("Digite sua nota: ");
		nota3 = leia.nextFloat();
		System.out.println ("Digite sua nota: ");
		nota4 = leia.nextFloat();
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.printf ("Sua média final é: " + media);
	}

}
