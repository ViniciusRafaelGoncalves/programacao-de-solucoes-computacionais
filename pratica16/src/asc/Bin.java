package asc;

import java.util.Scanner;

public class Bin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        ordenarVetor(numeros);

        while (true) {
            System.out.println("\nEscolha o algoritmo de busca:");
            System.out.println("1. Busca Binária");
            System.out.println("2. Sair");
            System.out.print("Opção: ");

            int opcao = input.nextInt();

            if (opcao == 2) {
                System.out.println("Encerrando o programa.");
                break;
            }

            System.out.print("Digite o número a ser pesquisado: ");
            int numeroPesquisado = input.nextInt();

            int comparacoes = 0;
            boolean encontrado = false;

            switch (opcao) {
                case 1:
                    int inicio = 0;
                    int fim = numeros.length - 1;

                    while (inicio <= fim) {
                        int meio = (inicio + fim) / 2;
                        comparacoes++;

                        if (numeros[meio] == numeroPesquisado) {
                            encontrado = true;
                            break;
                        } else if (numeros[meio] < numeroPesquisado) {
                            inicio = meio + 1;
                        } else {
                            fim = meio - 1;
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            if (encontrado) {
                System.out.println("Número encontrado! Comparacoes realizadas: " + comparacoes);
            } else {
                System.out.println("Número não encontrado. Comparacoes realizadas: " + comparacoes);
            }
        }

        input.close();
    }

    private static void ordenarVetor(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
