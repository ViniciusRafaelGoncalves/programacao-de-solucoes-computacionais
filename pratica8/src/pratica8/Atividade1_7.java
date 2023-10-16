package pratica8;
import java.util.Scanner;

public class Atividade1_7 {

	 public static void main(String[] args) {
	        int[][] matriz = lerMatriz();
	        
	        System.out.println("Matriz informada:");
	        imprimirMatriz(matriz);
	        
	        System.out.println("Elementos nas posições em que o índice da linha é par e o índice da coluna é ímpar:");
	        imprimirElementosPosicoesPares(matriz);
	        
	        System.out.println("Matriz transposta:");
	        int[][] transposta = calcularTransposta(matriz);
	        imprimirMatriz(transposta);
	        
	        System.out.println("Matriz após trocar os elementos da diagonal principal com os elementos da diagonal secundária:");
	        int[][] matrizTrocaDiagonais = trocarDiagonais(matriz);
	        imprimirMatriz(matrizTrocaDiagonais);
	    }

	    public static int[][] lerMatriz() {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[5][5];
	        System.out.println("Digite os elementos da matriz 5x5:");
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                matriz[i][j] = scanner.nextInt();
	            }
	        }
	        return matriz;
	    }

	    public static void imprimirMatriz(int[][] matriz) {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void imprimirElementosPosicoesPares(int[][] matriz) {
	        for (int i = 0; i < 5; i += 2) {
	            for (int j = 1; j < 5; j += 2) {
	                System.out.print(matriz[i][j] + " ");
	            }
	        }
	        System.out.println();
	    }

	    public static int[][] calcularTransposta(int[][] matriz) {
	        int[][] transposta = new int[5][5];
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                transposta[i][j] = matriz[j][i];
	            }
	        }
	        return transposta;
	    }

	    public static int[][] trocarDiagonais(int[][] matriz) {
	        int[][] matrizTrocaDiagonais = new int[5][5];
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (i == j) {
	                    matrizTrocaDiagonais[i][j] = matriz[i][4 - j];
	                } else if (i + j == 4) {
	                    matrizTrocaDiagonais[i][j] = matriz[i][j];
	                } else {
	                    matrizTrocaDiagonais[i][j] = matriz[i][j];
	                }
	            }
	        }
	        return matrizTrocaDiagonais;
	    }
	}