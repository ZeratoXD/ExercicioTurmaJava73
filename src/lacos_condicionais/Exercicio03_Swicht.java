package lacos_condicionais;

import java.util.Scanner;

public class Exercicio03_Swicht {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		String NomeDoProduto = "";
		float preco = 0.0f;
		
		
		System.out.print("Qual o códígo do produto de 1 a 6?: ");
		int CodigoDoProduto= leia.nextInt();
		
		System.out.print("Qual a quantidade do produtos: ");
		int quantidade = leia.nextInt();
		
		
		
		
		switch (CodigoDoProduto) {
        case 1:
            NomeDoProduto = "Cachorro Quente";
            preco = (float) 10.00;
            break;
        case 2:
        	NomeDoProduto = "X-Salada";
        	 preco = (float) 15.00;
            break;
        case 3:
        	NomeDoProduto = "X-Bacon";
        	 preco = (float) 18.00;
            break;
        case 4:
        	NomeDoProduto = "Bauru";
        	 preco = (float) 12.00;
            break;
        case 5:
        	NomeDoProduto = "Refrigerante";
        	 preco = (float) 8.00;
            break;
        case 6:
        	NomeDoProduto = "Suco de laranja";
        	 preco = (float) 13.00;
            break;
        default:
            System.out.println("Código de produto inválido.");
            return; 
    }
		
		float ValorTotal = (quantidade * preco);
		
		 System.out.println("\nProduto: " + NomeDoProduto);
	        System.out.println("Valor total: R$ " + String.format("%.2f", ValorTotal));

	        leia.close();
	}

}
