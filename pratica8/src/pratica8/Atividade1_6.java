package pratica8;

import java.util.Scanner;

public class Atividade1_6 {

	public static void main(String[] args) {
		int[] vetor = lNum();
		printVetor(vetor);
		int somaPares = somaVetor(vetor);
		System.out.println("A soma dos números pares é: " + somaPares);

	}

	public static int[] lNum() {
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[10];
		System.out.println("Digite os números do vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt();

		}
		return vetor;
	}



	public static void printVetor(int[] vetor) {
		System.out.print("Números no vetor: ");
		for (int num : vetor) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static int somaVetor(int[] vetor) {
		int soma = 0;
		for (int num : vetor) {
			if (num % 2 == 0) {
				soma += num;
			}
		}
		return soma;
	}
}