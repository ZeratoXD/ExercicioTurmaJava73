package lacos_condicionais;

import java.util.Scanner;

public class Exercicio02_If {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Digite um numero: ");
        num1 = leia.nextInt();
       
        
        if (num1 % 2 == 0 && num1 >= 0) {
			System.out.println ("O número " + num1 + " é par ");

	}
		else 
			System.out.println ("O número " + num1 + " é impar ");

	
        if (num1 > 0) {
            System.out.print("e positivo!");
        } else if (num1 < 0) {
            System.out.print("e negativo!");
        } else {
            System.out.print("e zero!");
        }
	
	
	
	}

}
