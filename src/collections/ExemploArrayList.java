package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {


		// Criando a Collection
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner leia = new Scanner(System.in);
		Double numero = (double) 0;
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);
		
		System.out.println("\nNotas cadastradas: " + notas);
		System.out.println("Digite o númeroque você deseja procurar ");
		
		System.out.println("\nA posição da nota 5 é: " + notas.indexOf(numero));

	}

}
