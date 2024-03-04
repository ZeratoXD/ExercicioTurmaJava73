package lacos_condicionais;

import java.util.Scanner;

public class Exercicio01_If {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite um valor para A");
        a = leia.nextInt();
        System.out.println("Digite um valor para B");
        b = leia.nextInt();
        System.out.println("Digite um valor para C");
        c = leia.nextInt();
       
        if (a + b>= c) {
			System.out.println ("A soma de A mais B é maior que C ");

	}
		else if (c + b<= c) {
		System.out.println ("A soma de A mais B é menor que C ");
}
		else 
			System.out.println ("A soma de A mais B é igual a C ");
	}

}
