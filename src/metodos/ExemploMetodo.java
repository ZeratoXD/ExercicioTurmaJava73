package metodos;

public class ExemploMetodo {

	public static void main(String[] args) {

		
		
		int resultado = somar(2,5);
		System.out.println("O resultado é " + somar(8,3));
		
		System.out.println("O resultado é " + resultado);
		
	}

	public static int somar(int num1, int num2) {

		return num1 + num2;

	}
	
	public static void mensagem() {
		System.out.println("Olá, turma 73 !");
	}

}
