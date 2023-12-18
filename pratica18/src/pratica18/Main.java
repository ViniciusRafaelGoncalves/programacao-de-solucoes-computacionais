package pratica18;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\nEscolha o método de ordenação:");
			System.out.println("1. Bubble Sort");
			System.out.println("2. Selection Sort");
			System.out.println("3. Insertion Sort");
			System.out.println("4. QuickSort");
			System.out.println("5. Merge Sort");
			System.out.println("6. Sair");
			System.out.print("Opção: ");

			int opcao = input.nextInt();

			if (opcao == 6) {
				System.out.println("Encerrando o programa.");
				break;
			}

			int[] vetor = new int[10];

			System.out.print("Digite 10 números para serem ordenados (separados por espaço): ");
			for (int i = 0; i < 10; i++) {
				vetor[i] = input.nextInt();
			}

			switch (opcao) {
			case 1:
				Ordenacao.bubbleSort(vetor);
				break;

			case 2:
				Ordenacao.selectionSort(vetor);
				break;

			case 3:
				Ordenacao.insertionSort(vetor);
				break;

			case 4:
				Ordenacao.quickSort(vetor, 0, vetor.length - 1);
				break;

			case 5:
				Ordenacao.mergeSort(vetor, 0, vetor.length - 1);
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				continue;
			}

			System.out.print("Vetor ordenado: ");
			exibirVetor(vetor);

		} while (true);

		input.close();
	}

	private static void exibirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}
}