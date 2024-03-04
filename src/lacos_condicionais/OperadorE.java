package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		boolean carteiraM;
		
		System.out.println("Digite a sua idade");
		idade = leia.nextInt();

		System.out.println("Você tem carteira de habilitação? (true/false)");
		carteiraM = leia.nextBoolean();
        
		System.out.println("Digite a sua idade");

		
		
		if ( idade >= 18 && carteiraM == true) {
			System.out.println("Pode dirigir!");

		}else {
			System.out.println("Não pode dirigir");
		}
		
		leia.close();
		
	}

}
