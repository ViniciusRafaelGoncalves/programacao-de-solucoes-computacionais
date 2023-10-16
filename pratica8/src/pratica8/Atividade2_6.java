package pratica8;

import java.util.Scanner;

public class Atividade2_6 {

    public static void main(String[] args) {
        double[] vetor = lNum();
        printVetor(vetor);
        negVetor(vetor);

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
        System.out.print("Números no vetor: ");
        for (double num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void negVetor(double[] vetor) {
    	System.out.print("Posições do vetor que armazenam números negativos: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}