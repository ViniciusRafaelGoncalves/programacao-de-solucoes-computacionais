package pratica7;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrizA = new int[2][2];
		int[][] matrizB = new int[2][2];

		System.out.println("Digite os elementos da primeira matriz 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrizA[i][j] = input.nextInt();
			}
		}

		System.out.println("Digite os elementos da segunda matriz 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrizB[i][j] = input.nextInt();
			}
		}

		int[][] matrizResultado = multiplicarMatrizes(matrizA, matrizB);
		System.out.println("Matriz Resultante da Multiplicação:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrizResultado[i][j] + " ");
			}
			System.out.println();
		}

		input.close();
	}

	public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
		int[][] resultado = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				resultado[i][j] = 0;
				for (int k = 0; k < 2; k++) {
					resultado[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}
		return resultado;
	}
}