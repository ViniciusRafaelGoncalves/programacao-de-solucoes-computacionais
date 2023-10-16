package pratica7;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, j;
		int[][] matriz = new int[5][5];
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz.length; j++) {
				System.out.print("Digite o elemento na posição [" + i + "][" + j + "]: ");
				matriz[i][j] = input.nextInt();

			}

		}
		System.out.println("Matriz Informada:");
		imprimirMatriz(matriz);

		System.out.println("Elementos nas posições onde o índice da linha é par e o índice da coluna é ímpar:");
		for (i = 0; i < 5; i += 2) {
			for (j = 1; j < 5; j += 2) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		System.out.println();

		System.out.println("Matriz Transposta:");
		int[][] matrizTransposta = calcularTransposta(matriz);
		imprimirMatriz(matrizTransposta);

		int[][] matrizTrocaDiagonal = trocarDiagonais(matriz);
		System.out.println("Matriz com Diagonais Trocadas:");
		imprimirMatriz(matrizTrocaDiagonal);

		input.close();
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] calcularTransposta(int[][] matriz) {
		int[][] transposta = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				transposta[j][i] = matriz[i][j];
			}
		}
		return transposta;
	}

	public static int[][] trocarDiagonais(int[][] matriz) {
		int n = matriz.length;
		int[][] matrizTroca = new int[n][n];
		for (int i = 0; i < n; i++) {
			matrizTroca[i][i] = matriz[i][n - 1 - i];
			matrizTroca[i][n - 1 - i] = matriz[i][i];
		}
		
		return matrizTroca;
	}
}