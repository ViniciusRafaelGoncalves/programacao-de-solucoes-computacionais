package pratica2;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o 1º número: ");
		double n1 = input.nextDouble();
		System.out.print("Digite o 2º número: ");
		double n2 = input.nextDouble();

		System.out.println(
				"1 - Somar os dois números.\n2 - Multiplicar os dois números.\n3 - Subtrair o número maior pelo número menor (se os dois forem iguais, retorne zero).\n4 - Dividir o primeiro número pelo segundo (lembre-se de que não existe divisão por\r\n"
						+ "zero).\n");
		System.out.println("Escolha uma operação:");
		int tabela = input.nextInt();

		switch (tabela) {
		case 1:
			double soma = n1 + n2;
			System.out.println("A soma é: " + soma);
			break;
		case 2:
			double mult = n1 * n2;
			System.out.println("O produto é: " + mult);
			break;
		case 3:
			double sub = (n1 > n2) ? (n1 - n2) : (n2 - n1);
			System.out.println("O resto é: " + sub);
			break;
		case 4:
			if (n2 != 0) {
				double div = n1 / n2;
				System.out.println("O quociente é: " + div);
			} else {
				System.out.println("Erro: Divisão por 0");
			}
			break;
		default:
			System.out.println("Opção inválida");
		}
	}

}
