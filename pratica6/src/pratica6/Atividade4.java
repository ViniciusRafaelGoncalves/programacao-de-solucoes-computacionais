package pratica6;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		int i;

		Scanner input = new Scanner(System.in);
		double[] vetor = new double[10];

		for (i = 0; i < vetor.length; i++) {

			System.out.println("Informe um número: ");
			vetor[i] = input.nextDouble();

		}
		for (i = 0; i < vetor.length; i += 2) {

			System.out.print(vetor[i] + " ");
		}

	}
}