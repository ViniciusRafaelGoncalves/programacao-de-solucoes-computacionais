package pratica8;

import java.util.Scanner;

public class Atividade2_7 {

	public static void main(String[] args) {
		int[][] matriz1 = lerMatriz();
		int[][] matriz2 = lerMatriz();

		int[][] matrizSoma = somarMatrizes(matriz1, matriz2);

		System.out.println("Matriz 1:");
		imprimirMatriz(matriz1);

		System.out.println("Matriz 2:");
		imprimirMatriz(matriz2);

		System.out.println("Matriz resultante da soma:");
		imprimirMatriz(matrizSoma);
	}

	public static int[][] lerMatriz() {
		Scanner scanner = new Scanner(System.in);
		int[][] matriz = new int[2][2];
		System.out.println("Digite os elementos da matriz 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}
		return matriz;
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
		int[][] resultado = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		return resultado;
	}
}
