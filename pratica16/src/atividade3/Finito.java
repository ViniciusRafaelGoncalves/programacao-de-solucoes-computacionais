package atividade3;
import java.util.Scanner;
public class Finito {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] sequenciaA = lerSequencia("Digite os elementos da sequência A (separados por espaço): ", input);
        int[] sequenciaB = lerSequencia("Digite os elementos da sequência B (separados por espaço): ", input);

        System.out.print("Sequência A: ");
        exibirSequencia(sequenciaA);
        System.out.print("Sequência B: ");
        exibirSequencia(sequenciaB);

        int[] conjuntoA = gerarConjunto(sequenciaA);
        int[] conjuntoB = gerarConjunto(sequenciaB);

        int[] conjuntoC = unirConjuntos(conjuntoA, conjuntoB);

        System.out.print("Conjunto A: ");
        exibirConjunto(conjuntoA);
        System.out.print("Conjunto B: ");
        exibirConjunto(conjuntoB);
        System.out.print("Conjunto C (A ∪ B): ");
        exibirConjunto(conjuntoC);

        input.close();
    }

    private static int[] lerSequencia(String mensagem, Scanner input) {
        System.out.print(mensagem);
        String[] numeros = input.nextLine().split(" ");
        int[] sequencia = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            sequencia[i] = Integer.parseInt(numeros[i]);
        }

        return sequencia;
    }

    private static void exibirSequencia(int[] sequencia) {
        for (int i = 0; i < sequencia.length; i++) {
            System.out.print(sequencia[i] + " ");
        }
        System.out.println();
    }

    private static int[] gerarConjunto(int[] sequencia) {
        int[] conjunto = new int[sequencia.length];
        int tamanho = 0;

        for (int i = 0; i < sequencia.length; i++) {
            if (!contemElemento(conjunto, tamanho, sequencia[i])) {
                conjunto[tamanho] = sequencia[i];
                tamanho++;
            }
        }

        return redimensionarConjunto(conjunto, tamanho);
    }

    private static int[] unirConjuntos(int[] conjuntoA, int[] conjuntoB) {
        int[] conjuntoC = new int[conjuntoA.length + conjuntoB.length];
        int tamanhoC = 0;

        for (int i = 0; i < conjuntoA.length; i++) {
            conjuntoC[tamanhoC] = conjuntoA[i];
            tamanhoC++;
        }

        for (int i = 0; i < conjuntoB.length; i++) {
            if (!contemElemento(conjuntoA, conjuntoA.length, conjuntoB[i])) {
                conjuntoC[tamanhoC] = conjuntoB[i];
                tamanhoC++;
            }
        }

        return redimensionarConjunto(conjuntoC, tamanhoC);
    }

    private static boolean contemElemento(int[] conjunto, int tamanho, int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (conjunto[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    private static int[] redimensionarConjunto(int[] conjunto, int tamanho) {
        int[] novoConjunto = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            novoConjunto[i] = conjunto[i];
        }
        return novoConjunto;
    }

    private static void exibirConjunto(int[] conjunto) {
        for (int i = 0; i < conjunto.length; i++) {
            System.out.print(conjunto[i] + " ");
        }
        System.out.println();
    }
}
