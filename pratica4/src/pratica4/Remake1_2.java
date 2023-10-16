package pratica4;

import java.util.Scanner;

public class Remake1_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char continuar;

		do {
			System.out.println("Digite sua primeira nota: ");
			double nota1 = input.nextDouble();
			System.out.println("Digite sua segunda nota: ");
			double nota2 = input.nextDouble();
			double media = (nota1 + nota2) / 2;

			if (media >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}

			System.out.println("Deseja calcular a média novamente? (S para Sim, qualquer outra tecla para sair)");
			continuar = input.next().charAt(0);

		} while (continuar == 'S' || continuar == 's');
	}
}