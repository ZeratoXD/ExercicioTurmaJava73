package exercios_java;

import java.util.Scanner;

public class exercio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// variáveis
		
		float salario, abono,NovoSalario; 
		
		
		//Entrada
		
		System.out.println ("Digite seu salário: ");
		salario = leia.nextFloat();
		System.out.println ("Digite seu abono: ");
		abono = leia.nextFloat();
		NovoSalario = salario + abono;
		System.out.println ("Seu novo salário é: " + NovoSalario);

	}

}
