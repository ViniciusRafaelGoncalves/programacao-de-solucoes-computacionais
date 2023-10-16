package pratica6;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		double[] vetor = new double[10];
		for (i = 0; i < vetor.length; i++) {
			System.out.print("Informe um número: ");
			vetor[i] = input.nextDouble();
		}
		System.out.println("Vetor de números reais:");
		for (i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("\nPosições do vetor de números negativos:");
		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(" Posição " + i + ": " + vetor[i]);	
			}
		

		}
	}

}
