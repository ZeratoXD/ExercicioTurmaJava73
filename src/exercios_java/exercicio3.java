package exercios_java;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
					
					// variáveis
					
					float SalarioBruto, AdicionalNoturno,HorasExtras,Descontos,SalarioLiquido; 
					
					
					//Entrada
					
					System.out.println ("Digite seu salário: ");
					SalarioBruto = leia.nextFloat();
					System.out.println ("Digite seu adicional noturno: ");
					AdicionalNoturno = leia.nextFloat();
					System.out.println ("Digite sua nota: ");
					HorasExtras = leia.nextFloat();
					System.out.println ("Digite sua nota: ");
					Descontos = leia.nextFloat();
					SalarioLiquido = SalarioBruto + AdicionalNoturno + HorasExtras - (Descontos*5);
					System.out.printf ("Sua média final é: " + SalarioLiquido);

	}

}
