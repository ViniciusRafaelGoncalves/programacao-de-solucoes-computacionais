package pratica8;

import java.util.Scanner;

public class Atividade4_6 {

	public static void main(String[] args) {
		double[] vetor = lNum();
		printVetor(vetor);

	}

	public static double[] lNum() {
		Scanner input = new Scanner(System.in);
		double[] vetor = new double[10];
		System.out.println("Digite os números do vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt();
		}
		return vetor;
	}

	public static void printVetor(double[] vetor) {
		System.out.print("Números nas posições pares do vetor: ");
		for (int i = 0; i < vetor.length; i+=2) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}

}
