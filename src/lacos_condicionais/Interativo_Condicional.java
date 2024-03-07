package lacos_condicionais;

import java.util.Scanner;

public class Interativo_Condicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
				
            int x,y = 0;
            
            System.out.println("Digite um valor para X");
            x = leia.nextInt();
            System.out.println("Digite um valor para Y");
            x = leia.nextInt();
            
            if (x > y) {
     		   System.out.println("X maior que Y");
     		
     		}else if (x==y) {}
     			System.out.println("Não tem maior");
     	
     		
   }
 }