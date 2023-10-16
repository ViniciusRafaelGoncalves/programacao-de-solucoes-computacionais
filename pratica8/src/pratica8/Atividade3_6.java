package pratica8;
import java.util.Scanner;
public class Atividade3_6 {

    public static void main(String[] args) {
        int[] vetor = lNum();
        printVetor(vetor);
        maNum(vetor);


    }

    public static int[] lNum() {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite os números do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = input.nextInt();
        }
        return vetor;
    }

    public static void printVetor(int[] vetor) {
        System.out.print("Números no vetor: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void maNum(int[] vetor) {
    	double menor = vetor[0];
        double maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            } else if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("Menor número informado: " + menor);
        System.out.println("Maior número informado: " + maior);
    }
}