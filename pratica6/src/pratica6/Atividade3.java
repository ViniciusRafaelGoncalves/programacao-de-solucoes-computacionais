package pratica6;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		int i;
		double meNum = Integer.MAX_VALUE;
		double maNum = Integer.MIN_VALUE;
		Scanner input = new Scanner(System.in);
		double[] vetor = new double[10];
		for (i = 0; i < vetor.length; i++) {

			System.out.println("Informe um número: ");
			vetor[i] = input.nextInt();
		}
		System.out.print("Vetor de números reais:");
		for (i = 0; i < vetor.length; i++)

		{
			System.out.print(vetor[i] + " ");
		}
		for (i = 0; i < vetor.length; i++)

		{
			if (vetor[i] < meNum) {
				meNum = vetor[i];
			}
			if (vetor[i] > maNum) {
				maNum = vetor[i];
			}

		}
		System.out.println("\nMenor número: " + meNum);
		System.out.println("Maior número: " + maNum);
	}

}
