package pratica16;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = input.nextInt();
		}

		while (true) {
			System.out.println("\nEscolha o algoritmo de busca:");
			System.out.println("1. Busca Sequencial");
			System.out.println("2. Busca Sequencial com Sentinela");
			System.out.println("3. Sair");
			System.out.print("Opção: ");

			int opcao = input.nextInt();

			if (opcao == 3) {
				System.out.println("Encerrando o programa.");
				break;
			}

			System.out.print("Digite o número a ser pesquisado: ");
			int numeroPesquisado = input.nextInt();

			int comparacoes = 0;
			boolean encontrado = false;

			switch (opcao) {
			case 1:

				for (int i = 0; i < numeros.length; i++) {
					comparacoes++;
					if (numeros[i] == numeroPesquisado) {
						encontrado = true;
						break;
					}
				}
				break;

			case 2:

				int ultimo = numeros[numeros.length - 1];
				numeros[numeros.length - 1] = numeroPesquisado;

				int i = 0;
				while (numeros[i] != numeroPesquisado) {
					comparacoes++;
					i++;
				}

				numeros[numeros.length - 1] = ultimo;

				if (i < numeros.length - 1 || numeros[numeros.length - 1] == numeroPesquisado) {
					encontrado = true;
				}
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				continue;
			}

			if (encontrado) {
				System.out.println("Número encontrado! Comparacoes realizadas: " + comparacoes);
			} else {
				System.out.println("Número não encontrado. Comparacoes realizadas: " + comparacoes);
			}
		}

		input.close();
	}
}
